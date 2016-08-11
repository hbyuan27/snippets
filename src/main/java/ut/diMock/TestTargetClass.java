package ut.diMock;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.mockito.Spy;

public class TestTargetClass extends BaseTestClass {

	// the target class who has a dependency injection to be mocked
	@InjectMocks
	private TargetClass target;

	// the di class to be injected into the target class
	@Spy
	// @Mock - if use @Mock here, the real method of dependency won't be called
	private DependencyClass dependency;

	@Before
	public void setup() {
		// you can use the mocks here since they have already been initialized
		// at super class
	}

	@Test
	public void testDoSomethingWithDefaultValue() {
		// use mocked dependency instance by using @Mock so the real method
		// diService() won't be called
		// Assert.assertNull(target.doSomething());

		// call real method of diService() by using @Spy
		Assert.assertEquals("Default_Value", target.doSomething());
	}

	@Test
	public void testDoSomethingWithMockedResult() {
		// mock the return value of dependency service
		Mockito.when(dependency.diService()).thenReturn("Mocked_Result");
		Assert.assertEquals("Mocked_Result", target.doSomething());
	}
}
