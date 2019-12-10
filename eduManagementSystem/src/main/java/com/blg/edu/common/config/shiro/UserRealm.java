package com.blg.edu.common.config.shiro;

import com.alibaba.fastjson.JSONArray;
import com.blg.edu.entity.Permission;
import com.blg.edu.entity.Role;
import com.blg.edu.entity.User;
import com.blg.edu.service.PermissionService;
import com.blg.edu.service.RoleService;
import com.blg.edu.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authz.AuthorizationException;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

import java.util.HashSet;
import java.util.List;

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


    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        //null usernames are invalid
        if (principalCollection == null) {
            throw new AuthorizationException("PrincipalCollection method argument cannot be null.");
        }

        User user = (User) getAvailablePrincipal(principalCollection);

        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();

        log.info("");

        info.setRoles(user.getRoles());
        info.setStringPermissions(user.getPerssions());
        return info;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        return null;
    }
}
