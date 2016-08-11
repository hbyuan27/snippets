package ut.diMock;

import org.junit.Before;
import org.mockito.MockitoAnnotations;

/**
 * to initialize annotated fields, put it into the super class of your test case
 * so you can still use setup() after annotated fields get initialized
 */
public class BaseTestClass {
	@Before
	public void initMocks() {
		MockitoAnnotations.initMocks(this);
	}
}