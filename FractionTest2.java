

public class FractionTest2 {
    public static void main(String[] args) {
        Fraction2 ab = new Fraction2(1, 2); 
        Fraction2 cd = new Fraction2(3, 4); 

        Fraction2.addFrac2(ab, cd);   // Class Fraction2 created the blueprint for me to use addFrac without using get.num. I defined the operations, so it calls on the method of addFrac2, runs (1, 2) and (2, 3) through it and prints output
        Fraction2.subFrac2(ab, cd);
        Fraction2.multFrac2(ab, cd);
        Fraction2.divFrac2(ab, cd);
    }
}
