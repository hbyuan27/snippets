package spring.di.candidateService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import spring.di.candidateService.integration.CandidateIntegrationServiceProxy;

@Component
public class CandidateService {

	@Autowired
	private CandidateIntegrationServiceProxy integrationService;

	public boolean candidateIdExists(String key) {
		Long candidateId = integrationService.getCandidateId(key);
		return (candidateId == null) ? false : true;
	}
}
