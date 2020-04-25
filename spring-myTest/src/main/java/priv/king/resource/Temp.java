package priv.king.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.HashMap;

/**
 * @author king
 * TIME: 2020/4/11 - 19:19
 **/
// 准备一个Class类 作为Demo演示
@Service("serviceName")
@EnableAsync
class Temp extends HashMap<String, String> implements Serializable {
	private static class InnerClass {
	}

	@Autowired
	private String getName() {
		return "demo";
	}
}
