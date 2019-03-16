package step03.before;

public  class ActionService {

	public  void doAction(String string) {
		if("cat".equals(string)) {
			Cat cat = new Cat();
			cat.cry();
		}else if("man".equals(string)) {
			Man man = new Man();
			man.say();
		}else {
			Dog dog = new Dog();
			dog.bite();
		}
	}

}
