package org.example;


import java.util.Scanner;

public class Average {
    private int[] data = new int[5];
    private double mean;

    Average() {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < data.length; i++) {
            System.out.printf("Please enter score %d: ", i + 1);
            int userNumber = scanner.nextInt();
            data[i] = userNumber;
        }

        scanner.close();

        calculateMean();
        selectionSort();
    }

    public void calculateMean() {
        double runningTotal = 0;

        for (int value : data) {
            runningTotal += value;
        }

        mean = runningTotal / data.length;
    }

    public String toString() {
        String string = "Values: ";

        for (int value : data) {
            string += value + " ";
        }

        string += "\nMean: " + mean;

        return string;
    }

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
