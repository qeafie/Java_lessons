
public class Fraction {
    
    int numerator;
    int denominator;
    
    public Fraction(int numerator, int denominator){
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction addition(int number){
        return new Fraction( numerator + (number * denominator), denominator);
    }
    public Fraction addition(Fraction secondFraction){
        if(denominator == secondFraction.denominator){
            return new Fraction(numerator + secondFraction.numerator,denominator);
        }
        else
            return new Fraction((numerator * secondFraction.denominator) + (secondFraction.numerator * denominator),
                    denominator * secondFraction.denominator);
    }

    public Fraction subtraction(int number){
        return new Fraction((numerator - (number * denominator)), denominator);
    }

    public Fraction subtraction(Fraction secondFraction){
        if(denominator == secondFraction.denominator){
            return new Fraction(numerator - secondFraction.numerator, denominator);
        }
        else
            return new Fraction((numerator * secondFraction.denominator) - (secondFraction.numerator * denominator),
                    denominator * secondFraction.denominator);
    }


    public Fraction multiplication(int number){
        return new Fraction(numerator * number, denominator);
    }

    public Fraction multiplication(Fraction secondFraction){
        return new Fraction(numerator * secondFraction.numerator, denominator * secondFraction.denominator);
    }

    public Fraction division(int number){
        return new Fraction(numerator,denominator * number);
    }

    public Fraction division(Fraction secondFraction){
        return new Fraction(numerator * secondFraction.denominator,denominator * secondFraction.numerator);
    }
    @Override
    public String toString(){
        return numerator + "/" + denominator; 
    }
}
