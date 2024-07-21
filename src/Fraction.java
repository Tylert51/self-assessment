public class Fraction {
    private int numerator;
    private int denominator; 

    public Fraction (int num, int den) {
        numerator = num;
        denominator = den;
    }

    public static Fraction addFrac (Fraction a , Fraction b) {
        int den = a.getDenominator() * b.getDenominator();
        int num = (a.getNumerator() * b.getDenominator()) + (b.getNumerator() * a.getDenominator());

        int gcd = findGCD(num, den);
        num /= gcd;
        den /= gcd;

        Fraction sum = new Fraction(num, den);

        return sum;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public String printFrac() {
        return (getNumerator() + "/" + getDenominator());
    }

    private static int findGCD (int a, int b) {
        
        int gcd;
        
        if (a < b) {
            gcd = a;
        } else if (b < a) {
            gcd = b;
        } else {
            return a;
        }

        while ( ((a % gcd != 0) || (b % gcd != 0)) && gcd > 1) {
            gcd--;
        }

        return gcd;
    }
}