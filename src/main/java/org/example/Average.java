package org.example;

public class Average {
    private int[] data;
    private double mean;

    Average() {

    }

    public void calculateMean() {
        double runningTotal = 0;

        for (int value : data) {
            runningTotal += value;
        }

        mean = runningTotal / data.length;
    }

    public String toString() {

    }

    public void selectionSort() {

    }
}
