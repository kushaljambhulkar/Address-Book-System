package basic.addressbook.com;

import java.util.*;

class ContactDetails{
	ArrayList<String>list;
	String firstName,lastName,address,city,state,phoneNumber,zip,email;
public void Details() {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter Your First Name : ");
	firstName = scan.next();
	Scanner scan1 = new Scanner(System.in);
	System.out.println("Enter your Last Name : ");
	lastName = scan1.next();
	Scanner scan2 = new Scanner(System.in);
	System.out.println("Enter your Address : ");
	address = scan2.next();
	Scanner scan3 = new Scanner(System.in);
	System.out.println("Enter your City : ");
	city = scan3.next();
	Scanner scan4 = new Scanner(System.in);
	System.out.println("Enter your State : ");
	state = scan4.next();
	Scanner scan5 = new Scanner(System.in);
	System.out.println("Enter your Email : ");
	email = scan5.next();
	Scanner scan6 = new Scanner(System.in);
	System.out.println("Enter your contact number : ");
	phoneNumber = scan6.next();
	Scanner scan7 = new Scanner(System.in);
	System.out.println("Enter your city Zip Code Number : ");
	zip = scan7.next();
	list = new ArrayList();
	list.add(firstName);
	list.add(lastName);
	list.add(address);
	list.add(city);
	list.add(state);
	list.add(phoneNumber);
	list.add(email);
   }
}
public class Addressbook {
	public static void main(String[] args) {
		System.out.println("***Welcome to Address Book***");
		ContactDetails cd = new ContactDetails();
		int i = 0;
		if(cd == cd) {
			System.out.println("Enter Contact Details here");
		}else {
			System.out.println("Please Enter Contact Details");
		}
		Scanner scan8 = new Scanner(System.in);
		do {
			System.out.println("Enter 1 To Adding contacts");
			System.out.println("Enter 2 To Edit ");
			System.out.println("Enter 3 To Display ");
			System.out.println("Enter 4 To Delete ");
			int choice = scan8.nextInt();
		}while(i==0);
		System.out.println("EXITED");
	}
}
