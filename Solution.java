import java.util.Arrays;
import java.util.List;

public class Solution {
	public static void main(String[] args) {
		Animal[] animals = new Animal[] { 
				new Bird(), 
				new Duck(), 
				new Chicken(), 
				new Rooster(), 
				new Parrot("“Woof, woof"),
				new Parrot("Meow"),
				new Parrot("Cock-a-doodle-doo"),
				new Fish(), 
				new Shark(), 
				new Clownfish(), 
				new Dolhpin(), 
				new Frog(), 
				new Dog(), 
				new Butterfly(),
				new Cat() };
	List<Animal> animalList = Arrays.asList(animals);
	}
}