package ru.shonin.service;

import java.util.Objects;

public final class Fraction extends Number implements Cloneable {
    
    private final int numerator;
    private final int denominator;
    
    public Fraction(int numerator, int denominator){
        if (denominator == 0)
            throw new IllegalArgumentException("Знаменатель не может быть равен 0");

        if (denominator < 0){
            this.denominator = Math.abs(denominator);
            if (numerator > 0){
                numerator = -numerator;
            }
            else{
                numerator = Math.abs(numerator);
            }

        }else{
            this.denominator = denominator;
        }

        this.numerator = numerator;
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

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public int intValue(){
        if (numerator == denominator)
            return 1;

        if (numerator < denominator)
            return 0;

        return numerator/denominator;

    }
    public long longValue(){
        if (numerator == denominator)
            return 1;

        if (numerator < denominator)
            return 0;

        return numerator/denominator;
    }
    public double doubleValue(){
        return numerator / (double)denominator;
    }

    public float floatValue(){
        return numerator / (float)denominator;
    }

    @Override
    public String toString(){
        return numerator + "/" + denominator; 
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fraction fraction = (Fraction) o;
        return numerator == fraction.numerator && denominator == fraction.denominator;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numerator, denominator);
    }

    public Fraction clone(){
        return new Fraction(numerator,denominator);
    }
}
