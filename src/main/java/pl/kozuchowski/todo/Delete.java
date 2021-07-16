package pl.kozuchowski.todo;

import org.apache.commons.lang3.math.NumberUtils;

import java.io.IOException;


public class Delete {
    public static void delete(String[] arr, String index) {
        int ind;
    if((NumberUtils.isParsable(index))){
        ind = Integer.parseInt(index);
        String[] shortArr = new String[arr.length - 1];
        arr[ind] = null;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != null){
                shortArr[count] = arr[i];
                count++;
            }

        }
        try {
            Save.save("data.txt",shortArr);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    }

}
