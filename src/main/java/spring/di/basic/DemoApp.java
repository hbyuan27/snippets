package spring.di.basic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DemoApp {

	@Autowired
	private DemoService demoService;

	public String sayHello(String name) {
		return demoService.greeting(name);
	}
}
