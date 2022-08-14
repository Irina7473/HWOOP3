package org.example;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        //Задание 1
        Array str1 = new Array<String>(new String[]{"7a8", "fgdfg", "ds"});
        str1.Show();
        Array str2 = new Array<String>(3);
        str2.ArrayFilling();
        str2.Show();
        str2.SortAsc();
        str2.Show();
        str2.SortDesc();
        str2.Show();
        System.out.println("Min = " +  str2.Min());

        Array nums = new Array<Integer>(new Integer[]{5, 7, 4});
        nums.Show();
        // С числами не всегда правильно работает
        Array rund = new Array<Integer>(5);
        rund.ArrayRundom();
        rund.Show();
        rund.SortAsc();
        rund.Show();
        rund.SortDesc();
        rund.Show();
        System.out.println("Max = " +  rund.Max());
        System.out.println("Min = " +  rund.Min());
        System.out.println("AVG = " +  rund.AVG());

        System.out.println("---------------------------------");

        //Задание 2

        System.out.println("---------------------------------");
    }
}