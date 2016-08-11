package ut.staticMock;

public class ClassUnderTest {

	public boolean callStaticMethod() {
		return ClassDependency.isValid();
	}
}
