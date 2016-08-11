package ut.diMock;

public class TargetClass {

	private DependencyClass dependency;

	// constructor
	TargetClass(DependencyClass dependency) {
		this.dependency = dependency;
	}

	// call service of dependency
	public String doSomething() {
		return dependency.diService();
	}
}
