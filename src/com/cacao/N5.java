package com.cacao;

import java.util.*;

/**
 * Created by magpiehoon on 2017. 9. 16..
 */
public class N5 {
    public static void main(String[] args) {
        String str1 = "aa1+aa2";
        String str2 = "AAAA12";

        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();

        for (int i = 0; i < str1.length() - 1; i++) {
            String s1 = str1.substring(i, i + 2);

            if (((s1.charAt(0) >= 0x61 && s1.charAt(0) <= 0x7A)
                    || (s1.charAt(0) >= 0x41 && s1.charAt(0) <= 0x5A))
                    && ((s1.charAt(1) >= 0x61 && s1.charAt(1) <= 0x7A)
                    || (s1.charAt(1) >= 0x41 && s1.charAt(1) <= 0x5A))) {
                list1.add(s1.toLowerCase());
            }


        }

        for (int i = 0; i < str2.length() - 1; i++) {
            String s2 = str2.substring(i, i + 2);
            if (((s2.charAt(0) >= 0x61 && s2.charAt(0) <= 0x7A)
                    || (s2.charAt(0) >= 0x41 && s2.charAt(0) <= 0x5A))
                    && ((s2.charAt(1) >= 0x61 && s2.charAt(1) <= 0x7A)
                    || (s2.charAt(1) >= 0x41 && s2.charAt(1) <= 0x5A))) {
                list2.add(s2.toLowerCase());
            }
        }
        System.out.println(list1);
        System.out.println(list2);

        if(list1.size() == 0 && list2.size() == 0){
            System.out.println(65536+"^^");
            return;
        }



        int num = list1.size() + list2.size();
        int cnt = 0;
        for (int i = 0; i < list1.size(); i++) {
            if (list2.contains(list1.get(i))) {
                list2.remove(list1.get(i));
                cnt++;
            }
        }
        int s = (int)((double)cnt / (double)(num-cnt )* 65536);

        System.out.println(s);
    }
}
