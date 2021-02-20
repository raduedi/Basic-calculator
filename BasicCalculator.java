package com.company;

public class BasicCalculator {
    private double firstNumber;
    private double secondNumber;

    public BasicCalculator(double firstNumber, double secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public double getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    public void getAdditionResult() {
        System.out.println("The sum result is  : " + (this.firstNumber + this.secondNumber));
    }

    public void getSubtractionResult() {
        System.out.println("The subtraction result is : " + (this.firstNumber - this.secondNumber));
    }

    public void getMultiplicationResult() {
        System.out.println("The multiplication result is : " + (this.firstNumber * this.secondNumber));
    }

    public void getDivisionResult() {
        if (secondNumber == 0) {
            System.out.println("The division result is :" + 0 );
        } else {
            System.out.println("The division result is  : " + (this.firstNumber / this.secondNumber));
        }
    }
}
