package org.example;


import java.util.Scanner;

/**
 @author Jacques-Conrad Calagui-Painchaud 6298805
 This class contains an array of integers and its mean.
 */
public class Average {
    private int[] data;
    private double mean;

    /**
     Constructor
     Asks the user for 5 integers and places them into the data array.
     Then, it sorts the data from largest to smallest using selection sort and calculates the mean.
     */
    Average() {
        Scanner scanner = new Scanner(System.in);

        data = new int[5];

        for (int i = 0; i < data.length; i++) {
            System.out.printf("Please enter score %d: ", i + 1); // Humans start counting with 1 instead of 0
            int userNumber = scanner.nextInt();
            data[i] = userNumber;
        }

        scanner.close();

        calculateMean();
        selectionSort();
    }

    /**
     The calculateMean method
     Calculates the mean based on the values in data.
     */
    public void calculateMean() {
        double runningTotal = 0;

        for (int value : data) {
            runningTotal += value;
        }

        mean = runningTotal / data.length;
    }

    /**
     The toString method
     @return a string with the values stored in data and the mean.
     */
    public String toString() {
        String string = "Values: ";

        for (int value : data) {
            string += value + " ";
        }

        string += "\nMean: " + mean;

        return string;
    }

    /**
     The selectionSort method
     Uses selection sort to sort the values in data from largest to smallest.
     */
    public void selectionSort() {
        for (int i = 0; i < data.length - 1; i++) {
            int max = i;

            for (int j = i + 1; j < data.length; j++) {
                if (data[j] > data[max]) {
                    max = j;
                }
            }

            int temp = data[i];
            data[i] = data[max];
            data[max] = temp;
        }
    }
}
