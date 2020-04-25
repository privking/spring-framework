package priv.king.demo.config;

import ch.qos.logback.core.net.SyslogOutputStream;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.*;
import org.springframework.scheduling.annotation.EnableAsync;
import priv.king.demo.service.DemoService;
import priv.king.demo.service.DemoService2;

/**
 * @author king
 * TIME: 2020/3/8 - 20:44
 **/
@Configuration
@ComponentScan("priv.king")
@EnableAspectJAutoProxy
public class Config {


}
