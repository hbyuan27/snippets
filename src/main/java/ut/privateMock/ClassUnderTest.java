package ut.privateMock;

public class ClassUnderTest {
	public String doSomethingPublic(String s, int i) {
		return doSomethingPrivate(s, i);
	}

	private String doSomethingPrivate(String s, int i) {
		return s + String.valueOf(i);
	}
}
