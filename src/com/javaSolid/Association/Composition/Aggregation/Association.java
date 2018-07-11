package com.javaSolid.Association.Composition.Aggregation;

/*
 * Association is relation between two separate classes which establishes
 * through their Objects. Association can be one-to-one, one-to-many,
 * many-to-one, many-to-many.
 */

public class Association {

	public static void main(String[] args) {
		Bank bank = new Bank("CitiBank");
		Employee emp = new Employee("Alex");

		System.out.println(emp.getEmployeeName() + " is employee of " + bank.getBankName());
	}

}

class Bank {
	private String name;

	// bank name
	Bank(String name) {
		this.name = name;
	}

	public String getBankName() {
		return this.name;
	}
}

// employee class
class Employee {
	private String name;

	// employee name
	Employee(String name) {
		this.name = name;
	}

	public String getEmployeeName() {
		return this.name;
	}
}
