
public class Cat extends Animal implements Walkable, Soundable{

	@Override
	public void says() {
		System.out.println("Meow");
		
	}

	@Override
	public void walk() {
		System.out.println("I am walking");
	}

}
