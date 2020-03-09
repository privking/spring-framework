package priv.king.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import priv.king.demo.config.Config;

/**
 * @author king
 * TIME: 2020/3/8 - 20:46
 **/
public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(Config.class);

		Object demoService = ac.getBean("demoService");
		System.out.println(demoService);
	}
}
