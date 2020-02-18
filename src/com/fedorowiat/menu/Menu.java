package com.fedorowiat.menu;

import com.fedorowiat.task.Draw;

import java.util.Scanner;

public class Menu {
    Scanner scanner = new Scanner(System.in);
    Draw draw = new Draw();
    public void showMenu(){
        System.out.println("Select a task: \n" +
                "1.Draw a Christmas tree.");
        int choice = scanner.nextInt();
        switch (choice){
            case(1):
            draw.drawAChritmasTree();
            break;
            default:
                throw new IllegalStateException("Unexpected value: " + choice);
        }



    }


}
