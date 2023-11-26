package com.galaxe.config;

import java.util.StringJoiner;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;


@EnableAspectJAutoProxy
@Aspect
@Configuration
public class LoggingAspect {

	Log logger = LogFactory.getLog(LoggingAspect.class);
	
	@Pointcut("execution(* com.galaxe.services.impl.*.*(..))")
	public void loggingPointCut() {
		//nothing
	}
	
//	@AfterReturning(pointcut="loggingPointCut()", returning="retVal")
//	public Object logafterReturning(JoinPoint jp, Object retVal) {
//		
//		String method = jp.getSignature().getName();
//		String clazz = jp.getTarget().getClass().getName();
//		Object[] args = jp.getArgs();
//		logger.info(clazz+" "+method+"("+getArgsString(args)+")"+" :returns :"+retVal.toString());
//		return retVal;
//	
//	}
	
	// now specify the advice -> when before or after the execution starts
	// get method details
	// details are present in joinpoint
	
//	@Before("loggingPointCut()")
//	public void logBefore(JoinPoint jp) {
//		String method = jp.getSignature().getName();
//		String clazz = jp.getTarget().getClass().getName();
//		Object[] args = jp.getArgs();
//		
//		logger.info(clazz+" "+method+"("+getArgsString(args)+")");
//	}
	
//	@Around("loggingPointCut()")
//	public Object logAround(ProceedingJoinPoint pjp) throws Throwable {
//		String method = pjp.getSignature().getName();
//		String clazz = pjp.getTarget().getClass().getName();
//		Object[] args = pjp.getArgs();
//		
//		logger.info(clazz+" "+method+"("+getArgsString(args)+")");
//		Object retVal = pjp.proceed();
//		logger.info(clazz+" "+method+"("+getArgsString(args)+")"+" :returns :"+retVal.toString());
//		return retVal;
//	}
//	
	
//	@AfterThrowing(pointcut="loggingPointCut()",throwing="ex")
//	public void logErr(Exception ex) {
//		logger.error(ex);
//	}
	
	private String getArgsString(Object[] args) {
		StringJoiner argsjoiner = new StringJoiner(",");
		for(Object arg : args) {
			argsjoiner.add(arg.toString());
		}
		return argsjoiner.toString();
	}
	
}