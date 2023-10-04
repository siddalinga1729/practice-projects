package interview_questions;

public class Employee {

	private String id;
	private String eName;
	private String eRole;
	private int age;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public String geteRole() {
		return eRole;
	}
	public void seteRole(String eRole) {
		this.eRole = eRole;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", eName=" + eName + ", eRole=" + eRole + ", age=" + age + "]";
	}
	public Employee(String id, String eName, String eRole, int age) {
		super();
		this.id = id;
		this.eName = eName;
		this.eRole = eRole;
		this.age = age;
	}
	
}
