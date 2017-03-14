package com.hackerrank;

import java.util.Scanner;

/**
 * Created by magpiehoon on 2017. 3. 13..
 */
public class TimeConversion {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String date = s.next();

        int hr = Integer.parseInt(date.substring(0,2));
        int min = Integer.parseInt(date.substring(3,5));
        int sec = Integer.parseInt(date.substring(6,8));
        String ap = date.substring(8,10);

        if(ap.equals("PM") && hr!=12)
            hr+=12;
        else if(ap.equals("AM") && hr==12)
            hr-=12;
        System.out.printf("%02d:%02d:%02d",hr,min,sec);
    }

}
