package de.atcs.logger;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class RqRsLogger {
	
	private Logger logger = LoggerFactory.getLogger(RqRsLogger.class);
	
	@Before(value="execution(* de.atcs.validations.ValidationServiceImpl.enQueueAc(..))")
	public void doBookingcomLogging(JoinPoint joinPoint){
		logger.info("We can log the enqueu request here");
	}
	
}
