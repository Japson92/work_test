package com;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scaner = new Scanner(System.in);
        int n = scaner.nextInt();
        ArrayList<Integer> list = new ArrayList<>();

        System.out.println("Insert data ");
        for(int i = 0; i< n; i++) {
            int A = scaner.nextInt();
            list.add(i, A);
        }
        for (int j = 0; j <n; j++ ) {

                list.get(j);

                if (j % 2 == 0) {
                    int addit = list.get(j) + list.get(j + 1);
                    System.out.println(addit);
                } else {
                    int multi = list.get(j) * list.get(j + 1);
                    System.out.println(multi);
                }

            }


       int sum = list.get(0)+ list.get(1)* list.get(2);
        System.out.println("result of alternating addition and multiplication");
        System.out.println(sum);

        list.sort(Comparator.reverseOrder());
        System.out.println(list);
    }


}


