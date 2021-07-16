package pl.kozuchowski.todo;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class ToDoMain {


    public static void main(String[] args) {

        String[] arr = {"123","456","789"};

        try {
            Save.save("data.txt", arr);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            System.out.println(Arrays.toString(Read.read("data.txt")));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
