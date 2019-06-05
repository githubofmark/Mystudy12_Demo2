package com.config;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@Aspect
public class MyAspect {
    Logger logger= LoggerFactory.getLogger(MyAspect.class);
    public  void  After(JoinPoint joinPoint){
       logger.debug("<============After==============>");
       logger.debug("执行的方法:{}",joinPoint.getSignature().getName());
    }
}
