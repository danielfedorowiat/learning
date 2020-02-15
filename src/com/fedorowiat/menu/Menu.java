package com.fedorowiat.menu;

import java.util.Scanner;

public class Menu {
    Scanner scanner = new Scanner(System.in);

    public void showMenu(){
        System.out.println("Select a task: \n" +
                "1.Draw a Christmas tree.");
        int choice = scanner.nextInt();
        switch (choice){
            case(1):

            default:
                throw new IllegalStateException("Unexpected value: " + choice);
        }



    }


}
