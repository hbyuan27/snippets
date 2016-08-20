package spring.di.autowiringAbstractClass;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class DemoApp {

	@Autowired
	@Qualifier(value = "myService")
	private AbstractService service;

	public String sayHello(String name) {
		return service.greeting(name);
	}
}
