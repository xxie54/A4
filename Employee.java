public class Employee
{
	private String Name;
	private String ID;
	private String Title;
	private String Workhours;
	private String Hoursrate;

public Employee(String Name, String ID, String Title, String Workhours, String Hoursrate)
{
	this.Name=Name;
	this.ID =ID;
	this.Title=Title;
	this.Workhours=Workhours;
	this.Hoursrate=Hoursrate;

}

public void getName()
{
	return Name;
}


public void getID()
{
return ID;
}

public void getTitle()
{
return Title;
}

public void getWH()
{
return Workhours;
}

public void getHR()
{
return Hoursrate;
}


public void setName()
{
Name=Name;
}

public void setID()
{
ID=ID;
}


public void setTitle()
{
Title=Title;
}

public void setWorkHours()
{
Workhours=WH;
}

public void setHoursrate()
{
Hoursrate=HR;
}




public String toString()
{

	return String.format("%s,%s Hired: %s Birthday: %s", Name, ID, Title,Workhours, Hoursrate);

}


import java.util.Scanner;


public class Driver {      //this is the driver class with main to called the class Contact and Addressbook 

    public static void main(String[] args) {       //the main class 

        Contact one = new Contact("A", "A", "A", "A");   // I give it some contact information first.
        Contact two = new Contact("Bob", "Bob", "A", "A");

        Scanner scan = new Scanner(System.in);

        AddressBook book = new AddressBook();
        book.addNewContact(one);
        book.addNewContact(two);

        System.out.println("give me name? ");  //ask for name


        String name = scan.nextLine();  //take the input from the user and store is as as first name 
        System.out.println("Last name?");
        String lname = scan.nextLine();

        book.addNewContact(new Contact(name, lname, "123", "123")); /

        book.displayAllContacts(); //this method call displayAllContact is to display all it have from the address book





    }
}


 public void displayAllContacts() {      //display all contacts of first name, last name, phone number and address`

        for (int i = 0; i < contacts.size(); i ++) {

            Contact contact = contacts.get(i);

            System.out.println(" Name: " + contact.getName());
            System.out.println(" Title: " + contact.getTitle());
            System.out.println(" ID #: " + contact.getID());
            System.out.println(" Hoursrate: " + contact.getHoursrate());
            System.out.println(" Workhours " + contact.getWorkhours());
            System.out.println("-------------");



 Employee one = new Employee("A", "A", "A", "A");   // I give it some contact information first.
 Employee two = new Employee("Bob", "Bob", "A", "A");






}


//***************************************************************







