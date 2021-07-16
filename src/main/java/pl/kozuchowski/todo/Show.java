package pl.kozuchowski.todo;

public class Show {
    public static void show(String[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println((i + 1) + ": " + arr[i]);
        }
    }
}
