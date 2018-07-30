package de.atcs.timer;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import de.atcs.jpa.manager.AirTrafficControlManager;

@Component
public class BookingTimer {
	
	private static final Logger slf4jLogger = LoggerFactory.getLogger(BookingTimer.class);
	@Autowired
	private AirTrafficControlManager airTrafficControlManager;
	
	
	@Scheduled(cron = "0 */1 * * * ?")
	public void scheduleTaskWithFixedRate() {
		slf4jLogger.info("Fixed Rate Task :: Execution Time - {}",new Date());
		airTrafficControlManager.bootTheApplication();
	}
}
