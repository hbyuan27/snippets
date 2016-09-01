package spring.di.candidateService;

public enum BusinessEntityType {
	CANDIDATE("Candidate"),
	JOBREQUISITION("JobRequisition"),
	JOBAPPLICATION("JobApplication");

	private String name;

	private BusinessEntityType(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}
