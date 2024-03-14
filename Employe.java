package p1;

public class Employe {
	private int id;
	private String name;
	private String gender;
	private int age;
	private double salary;
	private int yearOfJoining;

	public Employe(int id, String name, String gender, int age, double salary, int yearOfJoining) {

		this.id = id;
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.salary = salary;
		this.yearOfJoining = yearOfJoining;
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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getYearOfJoining() {
		return yearOfJoining;
	}

	public void setYearOfJoining(int yearOfJoining) {
		this.yearOfJoining = yearOfJoining;
	}

	@Override
	public String toString() {
		return "Employe [id=" + id + ", name=" + name + ", gender=" + gender + ", age=" + age + ", salary=" + salary
				+ ", yearOfJoining=" + yearOfJoining + "]";
	}

}
