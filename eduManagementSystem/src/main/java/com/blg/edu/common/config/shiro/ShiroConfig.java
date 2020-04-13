package com.blg.edu.common.config.shiro;

import com.blg.edu.service.PermissionService;
import com.blg.edu.service.RoleService;
import com.blg.edu.service.UserService;
import org.apache.shiro.realm.Realm;
import org.apache.shiro.spring.web.config.DefaultShiroFilterChainDefinition;
import org.apache.shiro.spring.web.config.ShiroFilterChainDefinition;
import org.springframework.aop.framework.autoproxy.DefaultAdvisorAutoProxyCreator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @description:
 * @author: chenjiahao
 * @create: 2019-12-10
 */

@Configuration
public class ShiroConfig {

    /**
     * 配置自定义Realm
     */
    @Bean
    public Realm realm() {
        return new UserRealm();
    }

    @Bean
    public static DefaultAdvisorAutoProxyCreator getDefaultAdvisorAutoProxyCreator() {
        DefaultAdvisorAutoProxyCreator creator = new DefaultAdvisorAutoProxyCreator();
        /**
         * setUsePrefix(false)用于解决一个奇怪的bug。在引入spring aop的情况下。
         * 在@Controller注解的类的方法中加入@RequiresRole注解，会导致该方法无法映射请求，导致返回404。
         * 加入这项配置能解决这个bug
         */
        creator.setProxyTargetClass(true);
        return creator;
    }

    @Bean
    public ShiroFilterChainDefinition shiroFilterChainDefinition() {
        DefaultShiroFilterChainDefinition chain = new DefaultShiroFilterChainDefinition();
        //哪些请求可以匿名访问
        chain.addPathDefinition("/dist/**", "anon");
        chain.addPathDefinition("/plugins/**", "anon");
        chain.addPathDefinition("/login", "anon");
        chain.addPathDefinition("/doLogin", "anon");
        chain.addPathDefinition("/common/403.html", "anon");
        chain.addPathDefinition("/druid/**", "anon");
        chain.addPathDefinition("/index/generatePassword", "anon");
        chain.addPathDefinition("/logout", "logout");

        chain.addPathDefinition("/generatePassword", "anon");

        //除了以上的请求外，其它请求都需要登录
        chain.addPathDefinition("/**", "authc");
        return chain;
    }
}
