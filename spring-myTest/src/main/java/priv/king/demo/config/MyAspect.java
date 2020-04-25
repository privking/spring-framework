package priv.king.demo.config;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author king
 * TIME: 2020/4/8 - 19:00
 **/
@Component
@Aspect
public class MyAspect {
    @Pointcut("execution(* priv.king.demo.service.DemoService2.*(..))")
    public void pointCut(){

    }
    @Before("pointCut()")
    public void before(){
        System.out.println("before");
    }

    @Pointcut("execution(* priv.king..*(..))")
    public void pointAround(){

    }
    @Around("pointAround()")
    public void around(ProceedingJoinPoint pjp){
        System.out.println("around1");
        try {
            pjp.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        System.out.println("around2");
    }
}
