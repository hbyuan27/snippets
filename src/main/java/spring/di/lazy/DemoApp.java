package spring.di.lazy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class DemoApp {

	@Autowired
	@Lazy
	private DemoService demoService;
	
	public DemoApp() {
		System.out.println("1. DemoApp initialized.");
	}

	public String sayHello(String name) {
		System.out.println("2. DemoApp say hello.");
		return demoService.greeting(name);
	}
}
