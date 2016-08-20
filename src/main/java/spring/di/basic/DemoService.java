
package spring.di.basic;

import org.springframework.stereotype.Service;

@Service
public class DemoService {
	
	public String greeting(String name) {
		return "Hello, " + name;
	}
}
