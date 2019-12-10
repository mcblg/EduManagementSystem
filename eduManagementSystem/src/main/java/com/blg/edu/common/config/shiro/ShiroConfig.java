package com.blg.edu.common.config.shiro;

import com.blg.edu.service.PermissionService;
import com.blg.edu.service.RoleService;
import com.blg.edu.service.UserService;
import org.apache.shiro.realm.Realm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @description:
 * @author: huangdong
 * @create: 2019-12-10
 */

@Configuration
public class ShiroConfig {

    //配置自定义Realm
    @Bean
    public Realm Realm() {
        return new UserRealm();
    }
}
