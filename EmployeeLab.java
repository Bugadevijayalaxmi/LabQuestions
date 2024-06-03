package LabQuestins;

public class Employee25April {
	
	    private String name;
	    private int yearOfJoining;
	    private String salary;
	    private String address;

	    // Constructor
	    public Employee25April(String name, int yearOfJoining, String salary, String address) {
	        this.name = name;
	        this.yearOfJoining = yearOfJoining;
	        this.salary = salary;
	        this.address = address;
	    }

	    // Display method to print employee information
	    public void display() {
	        System.out.printf("%-10s %-20d %-20s%n", name, yearOfJoining, address);
	    }

	    public static void main(String[] args) {
	    	// TODO Auto-generated method stub
	        // Create instances of Employee class
	        Employee25April employee1 = new Employee25April("Arpita", 1996, "$5000", "64C- WallsStreat");
	        Employee25April employee2 = new Employee25April("Vijay", 2001, "$6000", "68D- WallsStreat");
	        Employee25April employee3 = new Employee25April("Ajay", 2002, "$8000", "26B- WallsStreat");

	        // Print the header
	        System.out.printf("%-10s %-20s %-20s%n", "Name", "Year of joining", "Address");

	        // Display information of each employee
	        employee1.display();
	        employee2.display();
	        employee3.display();
		
	}

}
