import java.util.Scanner;

public class FractionTest2 {
    public static void main(String[] args) {
    	Scanner keyboard = new Scanner(System.in);
    	System.out.println("Enter numerator and denominator of first fraction seperated by a space ");
    	int num1 = scan.nextInt();
    	int den1 = scan.nextInt();
    	
    	System.out.println("Enter numerator and denominator of second fraction seperated by a space");
    	int num2 = scan.nextInt();
    	int den2 = scan.nextInt();
    	
        Fraction2 ab = new Fraction2(num1, den1); 
        Fraction2 cd = new Fraction2(num2, den2); 

        Fraction2.addFrac2(ab, cd);   // Class Fraction2 created the blueprint for me to use addFrac without using get.num. I defined the operations, so it calls on the method of addFrac2, runs (1, 2) and (2, 3) through it and prints output
        Fraction2.subFrac2(ab, cd);
        Fraction2.multFrac2(ab, cd);
        Fraction2.divFrac2(ab, cd);
        
        keyboard.close();
    }
}
