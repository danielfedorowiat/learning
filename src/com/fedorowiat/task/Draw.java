package com.fedorowiat.task;

import java.util.Scanner;

public class Draw {

    public void drawAChritmasTree(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj wielkośc choinki: ");
        int hight = scanner.nextInt();
        char tab[] = new char[2 * hight - 1];


        for (int i = 0; i < tab.length; i++) {
            tab[i] = '*';
        }
        for (int i = 1; i <= hight; i++) {
            if (i == 1) {
                System.out.print(tab[i]);
            } else {
                System.out.println("");
                for (int k = 0; k < (2 * i - 1); k++) {
                    System.out.print(tab[i]);
                }
            }
        }

    }


}
