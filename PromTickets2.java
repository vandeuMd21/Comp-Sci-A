package Conditinals;

import java.util.Scanner;

public class PromTickets2 {

	private String name;
	private String year;
	private String personCount;
	private int count;
	private String type;
	private String price;
	
	public PromTickets2(){
		name = studentName(name);
		year = grade(year);
		personCount = group(personCount);
		count = count();
		type = ticketType(count);
		price = ticketPrice(year, type);
		password();
		
	}
	
	public String studentName(String name) {
		
		String studentName;
		Scanner sc = new Scanner(System.in);
		System.out.println("What is your name? Please type first and last.");
		studentName = sc.nextLine();
		return studentName;
	}
	
	public String grade(String year) {
		
		String grade;
		Scanner sc = new Scanner(System.in);
		System.out.println("What class is the student in? For example type: Sophomore");
		grade = sc.nextLine();
		grade = grade.toLowerCase();
		return grade;
	}
	
	public String group(String personCount) {
		String group;
		Scanner sc = new Scanner(System.in);
		System.out.println("How many people will be on the ticket. Either 1, 2, 3 or 4?");
		group = sc.nextLine();
		return group;
	}
	
	public int count () {
		int count = Integer.parseInt(personCount);
		return count;
	}
	
	public String ticketType(int count) {
		String type = "";
		if(count == 1){
			type = "loner";
		}
		else if(count == 2) {
			type = "couple";
		}
		else   {
			type = "group";
		}
		
		return type;
	}
		public String ticketPrice(String grade, String type) {
			
			if(grade.equals( "freshman") && type.equals("loner")) {
				price = "65.00";
			}
			else if(grade.equals("sophomore") && type.equals("loner")) {
				price = "55.00";
			}
			else if (grade.equals("junior") && type.equals("loner")) {
				price = "45.00";
			}
			else if(grade.equals("senior") && type.equals("loner")) {
				price = "40.00";
			}
			else if(grade.equals("freshman") && type.equals("couple")) {
				price = "98.00";
			}
			else if (grade.equals("sophomore") && type.equals("couple")) {
				price = "83.00";
			}
			else if (grade.equals("junior") && type.equals("couple")) {
				price = "68.00";
			}
			else if (grade.equals("senior") && type.equals("couple")) {
				price = "60.00";
			}
			else if(grade.equals("freshman") && type.equals("group")) {
				price = "163.00";
			}
			else if (grade.equals("sophomore") && type.equals("group")) {
				price = "138.00";
			}
			else if (grade.equals("junior") && type.equals("group")) {
				price = "113.00";
			}
			else {
				price = "100.00";
			}
			return price;
		}
		
		public String password() {
			
			int count = 0;
			int rand = 0;
			String code = "";
			String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
			
			while(count <6){
				rand = (int) (Math.random() * characters.length());
				code += characters.substring(rand, rand + 1);
				
				count++; 
				}
    System.out.println(name + " has purchased a " + year + " " + type + " ticket for $" + price + ". Your confirmation number is " + code + ".");
    
    return code;
		}
}