package com.basics.beginnerprograms;

import java.util.Scanner;

public class BasicOperations {
    // to check whether the given number is even or odd
    private String evenOrOdd(int num){
        return num%2==0?"even":"odd";
    }
    // to convert the temperature in Degree Centigrade to Fahrenheit
    private float CelsiusToFahrenheit(float celsius){
        return (celsius*9/5)+32;
    }
    // to find out the average of three integers
    private float getAverage(int num1, int num2, int num3){
        return (float)(num1+num2+num3)/3;
    }
    // to find the product of a set of real numbers
    private float getProduct(float[] numArr){
        float pdt = 1;
        for (int i = 0; i < numArr.length; i++) {
            pdt *= numArr[i];
        }
        return pdt;
    }
    // to find the circumference and area of a circle with a given radius
    private float[] circumferenceAndArea(float radius){
        float[] circleProperties = new float[2];
        circleProperties[0] = (float) (2*3.14*radius);
        circleProperties[1] = (float) (3.14*radius*radius);
        return circleProperties;
    }
    //  to check whether the given integer is a multiple of 5
    private boolean isMultipleOfFive(int num){
        return num%5==0;
    }
    // to check whether the given integer is a multiple of both 5 and 7
    private boolean isMultipleOfFiveAndSeven(int num){
        return num%5==0&&num%7==0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BasicOperations bo = new BasicOperations();
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        System.out.println("********* Even/Odd ***************");
        System.out.println(bo.evenOrOdd(num));
        System.out.println("********* Multiple of 5 ***************");
        System.out.println(bo.isMultipleOfFive(num));
        System.out.println("********* Multiple of both 5 and 7 ***************");
        System.out.println(bo.isMultipleOfFiveAndSeven(num));
        System.out.println("********* Celsius to Fahrenheit Converter ***************");
        System.out.println("Enter temperature in °C");
        float celsius = sc.nextFloat();
        System.out.println(celsius+"°C = "+bo.CelsiusToFahrenheit(celsius)+"F");
        System.out.println("********* Average of 3 numbers ***************");
        System.out.println("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter second number: ");
        int num2 = sc.nextInt();
        System.out.println("Enter third number: ");
        int num3 = sc.nextInt();
        System.out.println("Average: "+bo.getAverage(num1,num2,num3));
        System.out.println("********* Product of a set of real numbers ***************");
        System.out.println("Enter number of real numbers in the set ");
        int setLen = sc.nextInt();
        float[] numArr = new float[setLen];
        System.out.println("Enter real numbers one by one ");
        for (int i = 0; i < numArr.length; i++) {
            numArr[i] = sc.nextFloat();
        }
        System.out.println("Product: "+bo.getProduct(numArr));
        System.out.println("********* Circumference and Area ***************");
        System.out.println("Enter radius");
        float radius = sc.nextFloat();
        System.out.println("Circumference: "+bo.circumferenceAndArea(radius)[0]);
        System.out.println("Area: "+bo.circumferenceAndArea(radius)[1]);
    }
}
