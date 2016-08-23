package spring.di.lazy;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

@Service
@Lazy
public class DemoService {

	public DemoService() {
		System.out.println("3. DemoService initialized.");
	}

	public String greeting(String name) {
		System.out.println("4. DemoService say hello.");
		return "Hello " + name + ", this is DemoService";
	}
}
