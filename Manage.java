package HouseholdManagement;

import java.util.Scanner;

public class Manage {
	public static void main(String[] args) {
		int size = 0, choose, CMND, n;
		Scanner sc = new Scanner(System.in);
		Manage manage = new Manage();
		HouseHold[] holds = null;
		HouseHold[] holds2 = null;
		Person person = null;
		do {
			manage.Menu();
			System.out.println("choose:  ");
			choose = sc.nextInt();
			switch (choose) {
			case 1:
				System.out.println("Number of households: ");
				size = sc.nextInt();
				if (size > 0) {
					holds2 = manage.houseHolds(holds, size);
				} else {
					System.out.println("Please enter again ");
				}
				break;
			case 2:
				if (holds2 != null) {
					System.out.println("FOCUS INFORMATION : ");
					manage.showHouse(holds2);
				} else {
					System.out.println("Please enter again !");
				}
				break;
			case 3:
				do {

					System.out.println("Enter CMND: ");
					CMND = sc.nextInt();
					if (holds2 != null) {
						person = manage.seaching(holds2, CMND);
						if (person != null) {
							manage.showPerson(person);
							;
						} else {
							System.out.println("The CMND not exits");
						}
					}
					System.out.println("Select 1-Continue, 2-End");
					n = sc.nextInt();
				} while (n != 2);
			case 0:
				System.exit(0);
			default:
				break;
			}

		} while (choose != 0);
	}

	private void Menu() {
		System.out.println("Option 1: Enter the list of households");
		System.out.println("Option 2: Display the list of households ");
		System.out.println("Option 3: Search by CMND number");
		System.out.println("Option 0: Exit program");
	}

	private Person seaching(HouseHold[] houseHolds, int CMND) {
		Person[] persons = null;
		for (HouseHold houseHold : houseHolds) {
			persons = houseHold.getList();
			if (persons != null) {
				for (Person person : persons) {
					if (CMND == person.getCMND())
						;
					return person;
				}
			}
		}
		return null;
	}

	private HouseHold houseHold() {
		int numberPerson;
		Person[] persons = null;
		Person[] persons2 = null;

		Scanner s = new Scanner(System.in);
		HouseHold houseHold = new HouseHold();

		System.out.println("Enter the house number:  ");
		houseHold.setNumberHouse(s.nextLine());
		System.out.println("Enter the number of family members: ");
		numberPerson = Integer.parseInt(s.nextLine());
		System.out.println("Enter information family members");
		houseHold.setNumberPerson(numberPerson);
		persons2 = this.Persons(persons, numberPerson);
		houseHold.setList(persons2);

		return houseHold;

	}

	private void showHouse(HouseHold[] houseHold) {

		for (HouseHold houseHolds : houseHold) {
			System.out.println("\tNumberHouse: " + houseHolds.getNumberHouse());
			System.out.println("\tNumberPerson: " + houseHolds.getNumberPerson());
			this.showPersons(houseHolds.getList());
		}
	}

	private HouseHold[] houseHolds(HouseHold[] houseHolds, int size) {
		houseHolds = new HouseHold[size];
		for (int i = 0; i < houseHolds.length; i++) {
			houseHolds[i] = this.houseHold();
		}
		return houseHolds;

	}

	private Person person() {
		Scanner s = new Scanner(System.in);
		Person person = new Person();
		System.out.println("FullName: ");
		person.setName(s.nextLine());
		System.out.println("Date of birth: ");
		person.setDob(s.nextLine());
		System.out.println("Job ");
		person.setJob(s.nextLine());
		System.out.println("CMND:");
		person.setCMND(Integer.parseInt(s.nextLine()));

		return person;
	}

	private void showPerson(Person person) {
		System.out.println("\tFullname: " + person.getName());
		System.out.println("\tDate of Birth: " + person.getDob());
		System.out.println("\tJob: " + person.getJob());
		System.out.println("\tCMND: " + person.getCMND());

	}

	private void showPersons(Person[] persons) {
		int i = 0;
		for (Person person : persons) {
			System.out.println("Information of the person  " + (++i) + ":");
			this.showPerson(person);
			;
		}
	}

	private Person[] Persons(Person[] persons, int size) {
		persons = new Person[size];
		for (int j = 0; j < persons.length; j++) {
			persons[j] = this.person();
		}
		return persons;

	}

}
