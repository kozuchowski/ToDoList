package pl.kozuchowski.todo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Read {
    public static String[] read (String str) {
        File file = new File(str);
        Scanner scan = null;
        try {
            scan = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        String[] tasks = new String[0];
        String temp = "";


        //czyta i zwraca tablicę zadań:
        while(scan.hasNextLine()){
            tasks = Extande.extande(tasks);
            tasks[tasks.length - 1] = scan.nextLine();
        }
        return tasks;
    }
}
