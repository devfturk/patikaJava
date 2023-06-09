
public abstract class Animal {
	String name;
	double weight;
	int age;
	
	
	public Animal() {
	}

	public Animal(String name, double weight, int age) {
		this.name = name;
		this.weight = weight;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	abstract int getDosage();
	
	abstract String getFeedSchedule();
}
