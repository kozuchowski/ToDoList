package pl.kozuchowski.todo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Save {

    //Dostaje tablicę stringów i zapisuje ją do pliku o nazwie str
    public static void save(String str, String[] arr) throws IOException {
        String path = str;
        File file = new File(path);
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        FileWriter writer = new FileWriter(file);
        BufferedWriter bw = new BufferedWriter(writer);

        for (int i = 0; i < arr.length; i++) {
            bw.write(arr[i]);
            bw.newLine();
        }

        bw.close();

    }
}
