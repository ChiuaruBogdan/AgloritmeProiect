package org.fasttrackit;


public class LogicalOp {


    public void printNumbersLine (int startingNumber){
        for (int i = 1; i != 100; i++){
            System.out.print((startingNumber + i) + " ");
        }
    }


    public static void main(String[] args) {
        LogicalOp exercise = new LogicalOp();
        exercise.printNumbersLine(1);
    }


}
