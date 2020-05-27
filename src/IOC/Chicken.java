package IOC;

public class Chicken {

	private String name;
	private int id;
	
	public Chicken(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	
	public void displayInfo() {
		System.out.println(name + id);
	}
}
