package spring.di.candidateService.integration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import spring.di.candidateService.integration.sf.SFIntegrationServiceFactory;

@Component
public class IntegrationServiceFactoryManager {

	@Autowired
	@Lazy
	SFIntegrationServiceFactory sfFactory;

	public IntegrationServiceFactory getFactory() {
		return sfFactory;
	}
}
