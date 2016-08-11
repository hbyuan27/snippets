package ut.finalMock;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.exceptions.misusing.MissingMethodInvocationException;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

@RunWith(PowerMockRunner.class)
@PrepareForTest(Dependency.class)
public class TestClassUnderTest {
	private ClassUnderTest underTest;
	private Dependency dependency;

	@Before
	public void setup() {
		underTest = new ClassUnderTest();
	}

	@Test(expected = MissingMethodInvocationException.class)
	public void testCallFinalMethodWithError() {
		Dependency di = new Dependency();
		// call real method
		Dependency spy = Mockito.spy(di);
		Assert.assertEquals("Default", underTest.callFinalMethod(spy));
		// try to mock the final method and get an exception
		Mockito.when(spy.doSomethingFinal()).thenReturn("Mocked");
	}

	@Test
	public void testCallFinalMethodWithPowerMock() {
		dependency = PowerMockito.mock(Dependency.class);
		PowerMockito.when(dependency.doSomethingFinal()).thenReturn("Mocked");
		Assert.assertEquals("Mocked", underTest.callFinalMethod(dependency));
	}
}
