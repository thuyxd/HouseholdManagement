package HouseholdManagement;

public class HouseHold {
	private String numberHouse;
	private int numberPerson;
	private Person[] List ;
	public HouseHold() {
		super();
		// TODO Auto-generated constructor stub
	}
	public HouseHold(String numberHouse, int numberPerson, Person[] list) {
		super();
		this.numberHouse = numberHouse;
		this.numberPerson = numberPerson;
		this.List = list;
	}
	public String getNumberHouse() {
		return numberHouse;
	}
	public void setNumberHouse(String numberHouse) {
		this.numberHouse = numberHouse;
	}
	public int getNumberPerson() {
		return numberPerson;
	}
	public void setNumberPerson(int numberPerson) {
		this.numberPerson = numberPerson;
	}
	public Person[] getList() {
		return List;
	}
	public void setList(Person[] list) {
		List = list;
	}
	
	
	
}
