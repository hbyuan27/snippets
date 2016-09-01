package spring.di.candidateService.integration.sf;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import spring.di.candidateService.integration.CandidateIntegrationService;

/**
 * @author I075908 SAP
 */
@Service
@Lazy
public class SFCandidateService implements CandidateIntegrationService {

	public Long getCandidateId(String key) {
		return 123L;
	}

}
