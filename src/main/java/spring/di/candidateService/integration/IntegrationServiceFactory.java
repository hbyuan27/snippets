package spring.di.candidateService.integration;

import spring.di.candidateService.BusinessEntityType;

public interface IntegrationServiceFactory {
	IntegrationService createIntegrationService(BusinessEntityType candidate);
}
