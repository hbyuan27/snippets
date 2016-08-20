package spring.di.autowiringAbstractClass;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestDemoApp {

	private AnnotationConfigApplicationContext ctx = null;
	private DemoApp demoApp = null;

	@Before
	public void setup() {
		ctx = new AnnotationConfigApplicationContext();
		ctx.register(AppConfig.class);
		ctx.refresh();
		demoApp = ctx.getBean(DemoApp.class);
	}

	@Test
	public void testDemoApp() {
		String result = demoApp.sayHello("Tester");
		Assert.assertEquals("MyService say hello to Tester", result);
	}
}