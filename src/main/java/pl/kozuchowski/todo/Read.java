package pl.kozuchowski.todo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Read {
    public static String[] read (String str) throws FileNotFoundException {
        File file = new File(str);
        Scanner scan = new Scanner(file);
        String[] tasks = new String[0];
        String temp = "";

        while(scan.hasNextLine()){
            tasks = Extande.extande(tasks);
            tasks[tasks.length - 1] = scan.nextLine();
        }
        return tasks;
    }
}
