package spring.di.genericTypeAutowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DemoApp {
	@Autowired
	private Store<String> s1; // <String> qualifier, injects the stringStore bean

	@Autowired
	private Store<Integer> s2; // <Integer> qualifier, injects the integerStore bean

	public String getStoreName() {
		return s1.getStoreName() + "+" + s2.getStoreName();
	}
}
