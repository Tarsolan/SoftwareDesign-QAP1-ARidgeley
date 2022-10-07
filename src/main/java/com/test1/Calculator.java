package com.test1;

public class Calculator {
    private double total;

    public double multiply(double num1, double num2) {
        return num1 * num2;
    }

    public double sum(double num1, double num2) {
        return num1 + num2;
    }

    public double subtract(double num1, double num2) {
        return num1 - num2;
    }

    public double divide(double num1, double num2) {
        if (num2 == 0) throw new ArithmeticException("Cannot divide by 0!");
        else return num1 / num2;
    }

    public void increaseTotal(double amount){
        if (amount < 0) throw new IllegalArgumentException("Invalid number! Number cannot be less than 0. Use reduceTotal instead.");
        else setTotal(total + amount);
    }

    public void reduceTotal(double amount) {
        if (amount < 0) throw new IllegalArgumentException("Invalid number! Number cannot be less than 0. Use increaseTotal instead.");
        if (total - amount < 0) throw new NumberFormatException("Total cannot go below 0.");
        else setTotal(total - amount);
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getTotal() {
        return total;
    }
}
