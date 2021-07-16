package pl.kozuchowski.todo;

import java.io.IOException;


public class Add {
    public static void add(String task) {
        String[] tasks = Read.read("data.txt");

        tasks = Extande.extande(tasks);
        tasks[tasks.length - 1] = task;
        try {
            Save.save("data.txt", tasks);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
