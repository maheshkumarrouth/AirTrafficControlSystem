package de.atcs.timer;

import org.springframework.scheduling.annotation.SchedulingConfigurer;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;
import org.springframework.scheduling.config.ScheduledTaskRegistrar;
import org.springframework.context.annotation.Configuration;


@Configuration
public class SchedulerConfig implements SchedulingConfigurer{
	
	private final int POOL_SIZE = 1;

	public void configureTasks(ScheduledTaskRegistrar scheduledTaskRegistrar) {
		
		ThreadPoolTaskScheduler threadPoolTaskScheduler = new ThreadPoolTaskScheduler();
		threadPoolTaskScheduler.setPoolSize(POOL_SIZE);
		threadPoolTaskScheduler.setWaitForTasksToCompleteOnShutdown(true);
        threadPoolTaskScheduler.initialize();
        scheduledTaskRegistrar.setTaskScheduler(threadPoolTaskScheduler);
        
	}
	 
	 
}
