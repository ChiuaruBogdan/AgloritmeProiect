package org.fasttrackit;

/**
 * Hello world!
 *
 */

    public class AverageCalculator
    {

        public void displayAverage(double a, double b, double c){
            System.out.println("Numbers are :" + a + "," + b + "," + c);
            double average = (a+b+c)/3;
            System.out.println("Average is :" + average);

        }


        public static void main( String[] args )
        { AverageCalculator averageCalculator = new AverageCalculator();
            averageCalculator.displayAverage(2.5,3,5.5);


            TemperatureConverter temperatureConverter = new TemperatureConverter();
            temperatureConverter.Temperature(20.5);


        }




    }