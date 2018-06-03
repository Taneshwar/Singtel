
public class Dog extends Animal implements Walkable, Soundable{

	@Override
	public void says() {
		System.out.println("Woof, woof");
		
	}

	@Override
	public void walk() {
		System.out.println("I am walking");
	}

}
