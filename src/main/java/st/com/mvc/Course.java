package st.com.mvc;

public class Course {
	String name;
	int fee;

	public Course() {
		super();
	}

	public Course(String name, int fee) {
		super();
		this.name = name;
		this.fee = fee;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getFee() {
		return fee;
	}

	public void setFee(int fee) {
		this.fee = fee;
	}

}
