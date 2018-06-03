
public class Duck extends Bird implements Soundable, Swimable {
	@Override
	public void says() {
		System.out.println("Quack, quack");
	}

	@Override
	public void swim() {
		System.out.println("I am swiming");

	}

}
