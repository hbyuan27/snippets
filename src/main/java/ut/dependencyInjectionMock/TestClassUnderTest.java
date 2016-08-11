package ut.dependencyInjectionMock;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.mockito.Spy;

public class TestClassUnderTest extends BaseTest {

	// the target class who has a dependency injection to be mocked
	@InjectMocks
	private ClassUnderTest underTest;

	// the di class to be injected into the target class
	@Spy
	// @Mock - if use @Mock here, the real method of dependency won't be called
	private Dependency dependency;

	@Before
	public void setup() {
		// Note: required step "MockitoAnnotations.initMocks(this)" has been moved into super class
	}

	@Test
	public void testDoSomethingWithRealMethod() {
		// use mocked dependency instance by using @Mock so the real method
		// diService() won't be called
		// Assert.assertNull(underTest.doSomething());

		// call real method of diService() by using @Spy
		Assert.assertEquals("Default_Value", underTest.doSomething());
	}

	@Test
	public void testDoSomethingWithMockedResult() {
		// mock the return value of dependency service
		Mockito.when(dependency.diService()).thenReturn("Mocked_Value");
		Assert.assertEquals("Mocked_Value", underTest.doSomething());
	}
	
	@Test
	public void testDoSomethingInAlternativeWay() {
		// di.diService() returns null since the instance is mocked
		Dependency di = Mockito.mock(Dependency.class);
		ClassUnderTest cut = new ClassUnderTest(di);
		Assert.assertNull(cut.doSomething());
		
		// mock return value of di method
		Dependency di1 = Mockito.mock(Dependency.class);
		Mockito.when(di1.diService()).thenReturn("Mocked_Value");
		ClassUnderTest cut1 = new ClassUnderTest(di1);
		Assert.assertEquals("Mocked_Value", cut1.doSomething());
		
		// call real di method by using spy
		Dependency di2 = new Dependency();
		Dependency spy = Mockito.spy(di2);
		ClassUnderTest cut2 = new ClassUnderTest(spy);
		Assert.assertEquals("Default_Value", cut2.doSomething());
		// spy will call real methods unless they are stubbed
		Mockito.when(spy.diService()).thenReturn("Mocked_Value");
		ClassUnderTest cut22 = new ClassUnderTest(spy);
		Assert.assertEquals("Mocked_Value", cut22.doSomething());
	}
}
