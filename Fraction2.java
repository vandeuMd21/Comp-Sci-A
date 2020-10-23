

public class Fraction2 {

    public int num, den;

    public Fraction2(int num, int den) {
        this.num = num;
        this.den = den;
    }
    public static void addFrac2(Fraction2 ab, Fraction2 cd) {
        System.out.print(ab.num + "/" + ab.den + " + " + cd.num + "/" + cd.den + " = ");
        int newNum = (ab.num * cd.den) + (cd.num * ab.den);
        int newDen = ab.den * cd.den;
        System.out.println(newNum + "/" + newDen);
    }
    public static void subFrac2(Fraction2 ab, Fraction2 cd) {                               //Since this is a separate method you can use  ab, and cd without an error
        System.out.print(ab.num + "/" + ab.den + " - " + cd.num + "/" + cd.den + " = ");
        int newNum = (ab.num * cd.den) - (cd.num * ab.den);
        int newDen = ab.den * cd.den;
        System.out.println(newNum + "/" + newDen);
    }
    public static void divFrac2(Fraction2 ab, Fraction2 cd){
        System.out.print(ab.num + "/" + ab.den + " / " + cd.num + "/" + cd.den + " = ");
        int newNum = ab.num * cd.den;
        int newDen = ab.den * cd.num;
        System.out.println(newNum + "/" + newDen);
    }
    public static void multFrac2(Fraction2 ab, Fraction2 cd) {
        System.out.print(ab.num + "/" + ab.den + " x " + cd.num + "/" + cd.den + " = ");
        int newNum = ab.num * cd.num;
        int newDen = ab.den * cd.den;
        System.out.println(newNum + "/" + newDen);

    }
  
}