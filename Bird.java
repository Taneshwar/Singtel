class Bird extends Animal implements Walkable {
	@Override
	public void walk() {
		System.out.println("I am walking");
	}
}
