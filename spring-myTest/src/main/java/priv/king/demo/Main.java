package priv.king.demo;

import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import priv.king.demo.config.Config;
import priv.king.demo.service.DemoService;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/**
 * @author king
 * TIME: 2020/3/8 - 20:46
 **/
public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(Config.class);
		DemoService demoService = ac.getBean(DemoService.class);
		System.out.println(demoService);
		demoService.hello();
//		Object demoService2 = ac.getBean("demoService2");
//		System.out.println(demoService2);




	}
}
