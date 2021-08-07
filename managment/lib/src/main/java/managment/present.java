package managment;

import java.util.Scanner; 

public class present {
	
	private String printMenue() {
		
		Scanner myObj = new Scanner(System.in);
		System.out.println();
		System.out.println("Choose Option: ");
		System.out.println("1. Add Employee ");
		System.out.println("2. Add Head ");
		System.out.println("3. Print Employees ");
		System.out.println("4. Print Head Employees ");
		System.out.println("5. Close Application ");
		
		
		String option = myObj.nextLine();
		
				
		
		return option;
	}
	
	public static void main(String[] args) {
		
		Scanner myObj = new Scanner(System.in);
		
		present pres = new present();
		
		Database data = new Database();
		
		while(true) {
		
			String option = pres.printMenue();
			
			
			if (option.equals("1")) {
				
				System.out.print("Type Name: ");
				
				
				String name = myObj.nextLine();
				
				System.out.print("Type Employee id: ");
				
				
				String id = myObj.nextLine();
				
				
				data.addEmployee(name, id);
				
			}
			
			if (option.equals("2")) {
				
				System.out.print("Type Name: ");
				
				
				String name = myObj.nextLine();
				
				System.out.print("Type Department: ");
				
				
				String id = myObj.nextLine();
				
				
				data.addHead(name, id);
				
			}
			else if (option.equals("3")) {
				data.printEmployees();
			}
			
			else if (option.equals("4")) {
				data.printHeads();
			}
			
			else if (option.equals("5")) {
				
				break;
			}
			
		}

    }

}


