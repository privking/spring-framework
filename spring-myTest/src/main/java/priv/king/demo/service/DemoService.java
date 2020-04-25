package priv.king.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

/**
 * @author king
 * TIME: 2020/3/8 - 20:45
 **/
@Service
public class DemoService {
	DemoService2 demoService2;

	public DemoService(DemoService2 demoService2) {
		System.out.println(demoService2);
		this.demoService2=demoService2;
	}

	public void hello(){
		System.out.println("hello");
		System.out.println(demoService2);

	}
	@PostConstruct
	public void init(){
		System.out.println("demo1init");
	}
	@PreDestroy
	public void destory(){
		System.out.println("demo1destory");
	}
}
