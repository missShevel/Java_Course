package com.kpi.view;

import java.util.Scanner;
public class UserSaveView {

    public static boolean saveMenu() {
            Scanner scan = new Scanner(System.in);
        while(true){
            System.out.print( "Do you want to save the result y/n : ");
            String answer = scan.nextLine();

            switch( answer ){
                case "n":
                {
                    return false;
                }
                case "y":
                {
                    return true;
                }
            }

        }

    }

}
