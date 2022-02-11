package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// (x-1)^(n+1)/((n+1)(x+1)^(n+1))
        Scanner in = new Scanner(System.in);
        System.out.println("Введите колличество шагов n");
        int n = in.nextInt();
        while (n<0) {
            System.out.print("Вы ввели отрицательное число шагов, введите заново n= ");
            n = in.nextInt();
        }
        System.out.println("Введите значение х");
        double x = in.nextDouble();
        double s = 0;
        for (int i = 0; i<n+1;i++){
            double p = (Math.pow(x-1, n+1)/((n+1)*(Math.pow(n+1, x+1))));
            s +=p;
        }
        System.out.println(s);
    }
}
