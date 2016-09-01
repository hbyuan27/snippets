package spring.di.candidateService.integration.sf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import spring.di.candidateService.BusinessEntityType;
import spring.di.candidateService.integration.IntegrationService;
import spring.di.candidateService.integration.IntegrationServiceFactory;

@Component
@Lazy
public class SFIntegrationServiceFactory implements IntegrationServiceFactory {

	@Autowired
	@Lazy
	SFCandidateService sfCandidateService;

	public IntegrationService createIntegrationService(BusinessEntityType type) {
		return sfCandidateService;
	}

}
