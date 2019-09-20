package student;

public class Studentinfo {
	private String Name;
	private int roll;
	private String address;
	private String Department;
	private Teacher ta;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public Teacher getTa() {
		return ta;
	}
	public void setTa(Teacher ta) {
		this.ta = ta;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDepartment() {
		return Department;
	}
	public void setDepartment(String department) {
		Department = department;
	}
	@Override
	public String toString() {
		return "Studentinfo [Name=" + Name + ", roll=" + roll + ", address=" + address + ", Department=" + Department
				+ ", ta=" + ta + "]";
	}
	

}
