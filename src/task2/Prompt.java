package task2;

import java.util.Scanner;

public interface Prompt {


    static String prompt(String message){
        Scanner in=new Scanner(System.in);
        System.out.println(message);
        return  in.nextLine();
    }
}
