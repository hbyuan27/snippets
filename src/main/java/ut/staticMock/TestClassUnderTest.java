package ut.staticMock;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

@RunWith(PowerMockRunner.class)
@PrepareForTest({ ClassUnderTest.class, ClassDependency.class })
public class TestClassUnderTest {

	@Test
	public void testCallStaticMethodWithMockedResult() {
		ClassUnderTest underTest = new ClassUnderTest();
		PowerMockito.mockStatic(ClassDependency.class);
		PowerMockito.when(ClassDependency.isValid()).thenReturn(true);
		Assert.assertTrue(underTest.callStaticMethod());
	}

	@Test
	public void testCallStaticMethodWithRealResult() {
		ClassUnderTest underTest = new ClassUnderTest();
		Assert.assertFalse(underTest.callStaticMethod());
	}
}
