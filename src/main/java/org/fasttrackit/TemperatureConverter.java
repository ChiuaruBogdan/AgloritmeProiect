package org.fasttrackit;

import java.util.Scanner;

public class TemperatureConverter {

//    double A;
//    double B;


//    Formula -->     C = (F - 32) x 5 / 9   "Celsius"
//         si -->     F = (C x 9 / 5) + 32

    public static void main(String[] args) {

    }

    public void Temperature(double C) {
        double F = (C * 9 / 5) + 32;
        System.out.println("Temperature in F is: " + F);
    }


    public void TempChanger(double number, String name) {


        if (name.equals("Celsius")) {

            number = (number * 9 / 5) + 32;
            System.out.println("Temperature in Fahreinheit is " + number);
        }  else{
                number = (number - 32) * 5 / 9;


            }

        }

//    {    Scanner input = new Scanner(System.in);
//
//        System.out.println("Input a degree in Fahreinheit: ");
//        double fahreinheit = input.nextDouble();
//
//        double celsius = ((5 *(fahreinheit - 32.0)) / 9.0);
//        System.out.println(fahreinheit + " degree Fahreinheit is equal to " + celsius + " in Celsius");
//        }


    }