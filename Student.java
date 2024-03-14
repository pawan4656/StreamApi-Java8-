package p1;

public class Student {

	private int id;
	private String name;
	private String dept;
	private long contact;

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", dept=" + dept + ", contact=" + contact + "]";
	}

	public Student(int id, String name, String dept, long contact) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.contact = contact;
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

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public long getContact() {
		return contact;
	}

	public void setContact(long contact) {
		this.contact = contact;
	}

}
