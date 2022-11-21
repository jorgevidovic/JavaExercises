package proposedExercises.topic6;

public class Stadium {
	String name;
	int capacity;
	String city;
	
	public Stadium(String name, int capacity, String city) {
		super();
		this.name = name;
		this.capacity = capacity;
		this.city = city;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Stadium [name=" + name + ", capacity=" + capacity + ", city=" + city + "]";
	}
	
	
	
	
	
}
