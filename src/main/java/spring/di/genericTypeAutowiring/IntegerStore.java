package spring.di.genericTypeAutowiring;

import org.springframework.stereotype.Component;

@Component
public class IntegerStore implements Store<Integer>{

	public String getStoreName() {
		return "IntegerStore";
	}

}
