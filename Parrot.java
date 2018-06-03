
public class Parrot extends Bird implements Soundable, Flyable {
	private String says;

	public String getSays() {
		return says;
	}

	public void setSays(String says) {
		this.says = says;
	}
	public Parrot(String says){
		this.says = says;
	}

	@Override
	public void says() {
		System.out.println("Parrot says : "+says);
		
	}

	@Override
	public void fly() {
		System.out.println("I am flying");
		
	}
	
	
}
