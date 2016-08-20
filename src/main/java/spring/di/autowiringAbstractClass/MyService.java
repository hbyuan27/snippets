package spring.di.autowiringAbstractClass;

import org.springframework.stereotype.Service;

@Service
public class MyService extends AbstractService {

	@Override
	public String greeting(String name) {
		return "MyService say hello to " + name;
	}

}
