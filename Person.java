package HouseholdManagement;

import java.util.Scanner;

public class Person {
	private String name;
	private String dob;
	private String job;
	private int CMND;

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person(String name, String dob, String job, int CMND) {
		super();
		this.name = name;
		this.dob = dob;
		this.job = job;
		this.CMND = CMND;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public void setCMND(int CMND) {
		this.CMND = CMND;
	}

	public int getCMND() {
		return CMND;
	}

}
