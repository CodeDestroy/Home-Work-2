package ru.dataart.academy.java.figures;

public class Calculator {
    public static double sumOfAreas (Figure[] arr)
    {
        double sum = 0;
        for (int i = 0; i < arr.length; i++)
            sum += arr[i].findArea();
        return sum;
    }
}
