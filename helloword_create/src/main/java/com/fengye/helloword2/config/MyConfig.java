package com.fengye.helloword2.config;

import ch.qos.logback.core.db.DBHelper;
import com.fengye.helloword2.bean.Person;
import com.fengye.helloword2.bean.Pet;
import com.fengye.helloword2.bean.Product;
import com.fengye.helloword2.bean.User;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.ModelAndView;

/**
 *   1、配置类里面使用@Bean标注在方法上给容器注册组件，默认也是单实例的
 *   2、配置类本身也是组件
 *   3、proxyBeanMethods：代理bean的方法
 *     Full(proxyBeanMethods = true)、【保证每个@Bean方法被调用多少次返回的组件都是单实例的】
 *     Lite(proxyBeanMethods = false)【每个@Bean方法被调用多少次返回的组件都是新创建的】
 *     组件依赖必须使用Full模式默认。其他默认是否Lite模式
 */
@Configuration(proxyBeanMethods = true)  //告诉SpringBoot这是一个配置类，和配置文件的作用一样
//@Import({DBHelper.class, ModelAndView.class})   //给容器中自动创建出这两个类的对象
//@ConditionalOnBean(name = "tom")
@EnableConfigurationProperties(Product.class)
public class MyConfig {
    @Bean(name = "tom22")  //给容器中添加组件，以方法名作为组件id
    //返回类型就是组件类型，返回的值，就是组件在容器中的实例
    @ConditionalOnBean(name = "tom22")
    public User user01() {
        User zhangsan = new User("zhangsan", 19);
        //user组件依赖了Pet组件
        zhangsan.setPet(tomcat());
        return zhangsan;
    }

    @Bean(name = "tom22")
    public Pet tomcat() {
        return new Pet("tomcat", 20.6);
    }
}
