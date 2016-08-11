package ut.dependencyInjectionMock;

public class ClassUnderTest {

	private Dependency dependency;

	// constructor
	ClassUnderTest(Dependency dependency) {
		this.dependency = dependency;
	}

	// call service of dependency
	public String doSomething() {
		return dependency.diService();
	}
}
