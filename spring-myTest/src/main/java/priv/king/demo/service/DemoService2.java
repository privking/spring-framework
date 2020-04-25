package priv.king.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

/**
 * @author king
 * TIME: 2020/3/28 - 15:53
 **/
@Service
public class DemoService2 {


	public DemoService2() {
		System.out.println("demoService2构造器调用");
	}

	@PostConstruct
	public void init(){
		System.out.println("demo2init");
	}
	@PreDestroy
	public void destory(){
		System.out.println("demo2destory");
	}
}
