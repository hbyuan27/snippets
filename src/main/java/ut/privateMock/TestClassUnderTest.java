package ut.privateMock;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

// Note: if you're going to use private or static mock, you must add below two annotations
@RunWith(PowerMockRunner.class)
@PrepareForTest(ClassUnderTest.class)
public class TestClassUnderTest {

	private ClassUnderTest demo;

	@Before
	public void setup() {
		demo = new ClassUnderTest();
	}

	@Test
	public void testDoSomethingPrivateWithRealMethod() throws Exception {
		ClassUnderTest spy = PowerMockito.spy(demo);
		String result = spy.doSomethingPublic("R", 1);
		Assert.assertEquals("R1", result);
		PowerMockito.verifyPrivate(spy, Mockito.times(1)).invoke("doSomethingPrivate", "R", 1);
	}

	@Test
	public void testDoSomethingPrivateWithMockedMethod() throws Exception {
		ClassUnderTest spy = PowerMockito.spy(demo);
		PowerMockito.doReturn("MockedResult").when(spy, "doSomethingPrivate", "R", 1);
		String result = spy.doSomethingPublic("R", 1);
		Assert.assertEquals("MockedResult", result);
		PowerMockito.verifyPrivate(spy, Mockito.times(1)).invoke("doSomethingPrivate", "R", 1);
	}
}
