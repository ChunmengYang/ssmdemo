package ycm.town.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Logger {
	
	@Pointcut("execution(* ycm.town.controller.*.*(..))")
	public void info() {}
	
	@Before("info()")
    public void doBefore(JoinPoint joinPoint){
        System.out.println("===========AOP Before Advice...===========");
    }
    
    @After("info()")
    public void doAfter(JoinPoint joinPoint){
        System.out.println("===========AOP After Advice...===========");
    }
}
