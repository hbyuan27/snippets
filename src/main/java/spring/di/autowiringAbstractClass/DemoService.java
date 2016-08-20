package spring.di.autowiringAbstractClass;

import org.springframework.stereotype.Service;

@Service
public class DemoService extends AbstractService {

	@Override
	public String greeting(String name) {
		return "DemoService say hello to " + name;
	}

}
