public class q7 {
    public static void main(String[] args) {
        
        Fraction frac1 = new Fraction (3, 13); 
        Fraction frac2 = new Fraction (1, 157);

        Fraction sum = Fraction.addFrac(frac1, frac2);

        System.out.println(sum.printFrac());

    }
}
