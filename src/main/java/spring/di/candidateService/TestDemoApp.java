package spring.di.candidateService;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestDemoApp {
	
	private AnnotationConfigApplicationContext ctx = null;
	private CandidateService service = null;
	
	@Before
	public void setup() {
		ctx = new AnnotationConfigApplicationContext();
		ctx.register(DemoSpringConfig.class);
		ctx.refresh();
		service = ctx.getBean(CandidateService.class);
	}

	@Test
	public void testDemoApp() {
		boolean result = service.candidateIdExists("Test");
		Assert.assertEquals(true, result);
	}
}
