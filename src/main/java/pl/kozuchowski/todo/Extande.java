package pl.kozuchowski.todo;

import java.util.Arrays;

public class Extande {
    public static String[] extande(String[] arr){
        return Arrays.copyOf(arr, arr.length + 1);
    }
}
