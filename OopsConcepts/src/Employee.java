
public class Employee {
	private int id;            // Encapsulation 
	private String name;

	void display() {
		System.out.println(id);
		System.out.println(name);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}


