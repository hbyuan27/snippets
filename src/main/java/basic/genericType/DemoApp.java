package basic.genericType;

public class DemoApp {

	public static void main(String[] args) {
		DemoTypeA typeA = new DemoTypeA();
		DemoTypeB typeB = new DemoTypeB();
		
		DemoService<DemoTypeA> serviceA = new DemoService<DemoTypeA>(typeA);
		DemoService<DemoType> serviceB = new DemoService<DemoType>(typeB);
		
		System.out.println(serviceA.getTypeName());
		System.out.println(serviceB.getTypeName());

		AgeService<String, Integer> nameAgeService = new AgeService<String, Integer>();
		nameAgeService.setT1("Kevin");
		nameAgeService.setT2(21);
		
		AgeService<Long, Integer> idAgeService = new AgeService<Long, Integer>();
		idAgeService.setT1(3721L);
		idAgeService.setT2(36);
		
		System.out.println(nameAgeService.getAge());
		System.out.println(idAgeService.getAge());
	}

}
