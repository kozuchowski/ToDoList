package pl.kozuchowski.todo;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class ToDoMain {

    public static void navigate(String str){
        Scanner scan = new Scanner(System.in);
        boolean exit = false;

       do {
           System.out.println(ConsoleColors.BLUE  + "Wybierz opcję:");
           System.out.println(ConsoleColors.GREEN + "1: Add, 2: Delete, 3: Show, 4: Exit");
           System.out.println(ConsoleColors.RESET);
           String option = scan.nextLine();

            switch (option){
                case "1":
                    Add.add(GetData.taskData());
                    break;
                case "2":
                    System.out.println("Which index to delete?");
                    Delete.delete(Read.read("data.txt"),scan.nextLine());
                    break;
                case "3":
                    Show.show(Read.read("data.txt"));
                    break;
                case "4":
                    exit = true;
                    break;
                default:
                    System.out.println("Wrong number");
            }

       }while(!exit);

    }


    public static void main(String[] args) {
        navigate("data.txt");

    }
}
