package spring.di.candidateService.integration;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spring.di.candidateService.BusinessEntityType;

@Service
public class CandidateIntegrationServiceProxy implements CandidateIntegrationService{

	@Autowired
	IntegrationServiceFactoryManager factoryManager;
	
	private CandidateIntegrationService integrationService;
	
	@PostConstruct
	private void init() {
		IntegrationServiceFactory factory = factoryManager.getFactory();
		integrationService = (CandidateIntegrationService) factory.createIntegrationService(BusinessEntityType.CANDIDATE);
	}

	public Long getCandidateId(String key) {
		return integrationService.getCandidateId(key);
	}
}
