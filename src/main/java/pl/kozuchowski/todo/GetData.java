package pl.kozuchowski.todo;

import java.util.Scanner;

public class GetData {
    public static String taskData(){
        String task = "";
        Scanner scan = new Scanner(System.in);
        String quit = "";
        int count = 0;
        System.out.println("Add description");
        do {
            if(count == 1){
                System.out.println("Is important? : true/false");
                task += "Ważna?: ";
            }else if(count == 2){
                System.out.println("Add deadline : DD/MM/YYYY");
            }
            quit = scan.nextLine();
            task += count < 2 ?  quit + " - " :  quit;
            count++;
        }while(count < 3);
        return task;
    }
}
