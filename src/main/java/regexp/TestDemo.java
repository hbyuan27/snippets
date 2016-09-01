package regexp;

import org.junit.Assert;
import org.junit.Test;

public class TestDemo {

	@Test
	public void testGetRegExpString() {
		Demo demo = new Demo();
		
		String testStr = "        TESTABC";
		String result = demo.getRegExpString(testStr);
		
		Assert.assertEquals("TESTABC", result);
	}
}
