package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int i = 1;
        int[] num = {1,1,2,2,1};
            for(i = i-1;i<=0;i++) {
                for (int j = 0; j < num.length; j++) {

                    System.out.println(Arrays.toString(num));
                }
            }
    }
}
