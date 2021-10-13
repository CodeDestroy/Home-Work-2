package ru.dataart.academy.java;

import ru.dataart.academy.java.figures.Calculator;
import ru.dataart.academy.java.figures.Cirlce;
import ru.dataart.academy.java.figures.Figure;
import ru.dataart.academy.java.figures.Rectangle;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        System.out.print("Task for Java OOP\n");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        Figure[] figures = new Figure[n];
        int choose = 0;
        boolean exit = false;
        for (int i = 0; i < n; i++)
        {
            do{
                System.out.println("1) Circle \n2) Rectangle");
                choose = scan.nextInt();
                switch (choose)
                {
                    case 1:
                        System.out.println("Enter radius");
                        double rad = scan.nextDouble();
                        figures[i] = new Cirlce(rad);
                        exit = true;
                        break;
                    case 2:
                        System.out.println("Enter sides");
                        double a,b;
                        a = scan.nextDouble();
                        b = scan.nextDouble();
                        figures[i] = new Rectangle(a,b);
                        exit = true;
                        break;
                    default:
                        System.out.println("Error!");
                        break;
                }
            }while(!exit);
        }
        System.out.println(Calculator.sumOfAreas(figures));
    }
}