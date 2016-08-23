package spring.di.genericTypeAutowiring;

import org.springframework.stereotype.Component;

@Component
public class StringStore implements Store<String>{

	public String getStoreName() {
		return "StringStore";
	}

}
