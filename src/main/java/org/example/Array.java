package org.example;

import java.io.IOException;
import java.util.Scanner;

public class Array<T> {
    Object[] array;
    int amount=0;

    public Array(int amount){
        this.amount=amount;
        this.array =  new Object[this.amount];
    }
    public Array(T[] array){
        this.amount=array.length;
        this.array = new Object[this.amount];
        for (int i=0; i<amount; i++) this.array[i] = array[i];
    }

    public void ArrayFilling() throws IOException {
        Scanner in = new Scanner(System.in);
        array = new String[amount];
        for (int i = 0; i < amount; i++) {
            System.out.println("¬ведите элемент массива");
            array[i] = in.next();
        }
    }
    public void ArrayRundom(){
        array = new Integer[amount];
        for (int i=0; i<amount; i++) {
            int r = (int)(Math.random() * 100);
            array[i] = Integer.valueOf(r);
        }
    }
    public void Show(){
        System.out.print("[ ");
        for (Object i : array) System.out.print(i + " ");
        System.out.println("]");
    }

    public String Max() {
        String max = array[0].toString();
        for (int i=1; i<amount; i++) {
            String s = array[i].toString();
            if (s.compareTo(max) > 0) max = s;
        }
        return max;
    }

    public String Min() {
        String min = array[0].toString();
        for (int i=1; i<amount; i++) {
            String s = array[i].toString();
            if (s.compareTo(min) < 0) min = s;
        }
        return min;
    }

    public float AVG() {
        int sum=0;
        for (int i=1; i<amount; i++) sum += (Integer)array[i];
        return sum / amount;
    }

    public void SortAsc() {
        for(int i = amount-1 ; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++) {
                String s1 = array[j].toString();
                String s2 = array[j + 1].toString();
                if (s1.compareTo(s2) > 0) {
                    T temp = (T) array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public void SortDesc() {
        for (int i = amount - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                String s1 = array[j].toString();
                String s2 = array[j + 1].toString();
                if (s2.compareTo(s1) > 0) {
                    T temp = (T) array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
