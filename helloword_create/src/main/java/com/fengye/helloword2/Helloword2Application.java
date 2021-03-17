package com.fengye.helloword2;

import ch.qos.logback.core.db.DBHelper;
import com.fengye.helloword2.bean.Person;
import com.fengye.helloword2.bean.Pet;
import com.fengye.helloword2.bean.Product;
import com.fengye.helloword2.bean.User;
import com.fengye.helloword2.config.MyConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;
import org.springframework.web.servlet.ModelAndView;

@SpringBootApplication(scanBasePackages = "com.fengye.helloword2")  //标注这个类是一个springboot应用：启动类下的所有资源被导入
//@SpringBootConfiguration
//@EnableAutoConfiguration
//@ComponentScan("com.fengye.helloword2")  //以上三个注解等同于@SpringBootApplication
@ImportResource(locations = "classpath:bean.xml")
public class Helloword2Application {
    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(Helloword2Application.class, args);
        //2、查看容器里面的组件
        String[] names = run.getBeanDefinitionNames();
        for(String name :names){
            System.out.println(name);
        }
//
//        //3、从容器中获取组件
////        Pet tom01 = run.getBean("tom", Pet.class);
////        Pet tom02 = run.getBean("tom", Pet.class);
////        System.out.println("组件："+(tom01 ==tom02));
//
//        //4、org.springframework.aop.config.internalAutoProxyCreator：MyConfig类型已经是一个代理对象
//        MyConfig bean = run.getBean(MyConfig.class);
//        System.out.println(bean);
//
//        //5、如果@Configuration(proxyBeanMethods = true)代理对象调用方法。SpringBoot总会检查这个组件是否在容器中有
//        //有则拿出来用，不会创建新的对象，保持组件单实例
//        User user = bean.user01();
//        User user1 = bean.user01();
//        System.out.println(user == user1);
//
//        //6、比较依赖创建的对象与容器中的bean对象生成是否是同一个bean对象
//        User user01 = run.getBean("user01", User.class);
//        Pet tom = run.getBean("tom", Pet.class);
//        System.out.println("依赖对象tom与容器中的tom是否是同一个：" + (user01.getPet() == tom));
//
//        //7、获取@Import组件
//        System.out.println("======================");
//        String[] beanNames = run.getBeanNamesForType(ModelAndView.class);
//        for (String name : beanNames) {
//            System.out.println(name);
//        }
//
//        DBHelper dbHelper = run.getBean(DBHelper.class);
//        System.out.println(dbHelper);

        //8.验证@Conditional注解
//        boolean user01 = run.containsBean("user01");
//        boolean tom = run.containsBean("tom");
//        System.out.println(user01);
//        System.out.println(tom);

        //9.验证@ImportSource注解
        boolean haha = run.containsBean("haha");
        System.out.println(haha);
        boolean hehe = run.containsBean("hehe");
        System.out.println(hehe);

        //10.验证属性注解
        Product product = run.getBean(Product.class);
        System.out.println(product);

    }
}
