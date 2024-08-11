package com.boot.aspect.elements;

//import org.apache.logging.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class BeforeCountryAccessAspect {

	
	private org.slf4j.Logger logger =  LoggerFactory.getLogger(this.getClass());
	
	
	//@Before("com.boot.aspect.service")
	@Before("execution(* com.boot.aspect.service.CountryFinder.findCountryDetails())")
	public void before(JoinPoint joinpoint) {
		//Advice
		logger.info(" Check for user access ");
        logger.info(" Allowed execution for {}", joinpoint);
	}
}
