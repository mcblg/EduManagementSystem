package com.blg.edu.common.config.shiro;

import com.alibaba.fastjson.JSONArray;
import com.blg.edu.common.Constant.UserStatus;
import com.blg.edu.entity.Permission;
import com.blg.edu.entity.Role;
import com.blg.edu.entity.User;
import com.blg.edu.service.PermissionService;
import com.blg.edu.service.RoleService;
import com.blg.edu.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.authc.*;
import org.apache.shiro.authc.credential.HashedCredentialsMatcher;
import org.apache.shiro.authz.AuthorizationException;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.crypto.hash.Sha256Hash;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @description:
 * @author: huangdong
 * @create: 2019-12-10
 */
@Slf4j
public class UserRealm extends AuthorizingRealm {

    @Autowired
    UserService userService;
    @Autowired
    RoleService roleService;
    @Autowired
    PermissionService permissionService;

    //告诉shiro如何根据获取到的用户信息中的密码和盐值来校验密码
    {
        //设置用于匹配密码的CredentialsMatcher
        HashedCredentialsMatcher hashMatcher = new HashedCredentialsMatcher();
        hashMatcher.setHashAlgorithmName(Sha256Hash.ALGORITHM_NAME);
        hashMatcher.setStoredCredentialsHexEncoded(true);
        hashMatcher.setHashIterations(1024);
        this.setCredentialsMatcher(hashMatcher);
    }


    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        if (principalCollection == null) {
            throw new AuthorizationException("PrincipalCollection method argument cannot be null.");
        }

        User user = (User) getAvailablePrincipal(principalCollection);

        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();

        log.info("用户角色" + user.getRoles());
        log.info("用户权限" + user.getPermissions());

        info.setRoles(user.getRoles());
        info.setStringPermissions(user.getPermissions());
        return info;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        UsernamePasswordToken upToken = (UsernamePasswordToken) authenticationToken;
        String username = upToken.getUsername();

        // Null username is invalid
        if (username == null) {
            throw new AccountException("Null usernames are not allowed by this realm.");
        }

        User user = userService.getUserByUserName(username);


        if (user == null) {
            throw new UnknownAccountException("用户[" + username + "]不存在");
        }

        if (user.getStatus().equals(UserStatus.LOCK)) {
            throw new LockedAccountException("用户已锁定");
        }

        if (user.getStatus().equals(UserStatus.INVALID)) {
            throw new LockedAccountException("无效用户");
        }

        //查询用户的角色和权限存到SimpleAuthenticationInfo中，这样在其它地方
        //SecurityUtils.getSubject().getPrincipal()就能拿出用户的所有信息，包括角色和权限
        Set<String> roles = roleService.getRoleCodeByUserId(user.getId());
        Set<String> permissions = permissionService.getPerCodeByUserId(user.getId());
//        user.getRoles().addAll(roles);
//        user.getPermissions().addAll(permissions);

        SimpleAuthenticationInfo info = new SimpleAuthenticationInfo(user, user.getPwd(), getName());
        if (user.getSalt() != null) {
            info.setCredentialsSalt(ByteSource.Util.bytes(user.getSalt()));
        }

        return info;
    }
}
