package com.company;

import javax.swing.*;

public class Mathx {
    public static void main(String[] args) {
        swap(132);
    }
    public static int swap(int input){
        System.out.println(input);
        System.out.println(input-(input % 100) +10* (input % 10)+0.1*(input % 1)+(0.1*((input-(input % 10))-(input-(input % 100)))));
        int un= input-(input % 100) +10* (input % 10);
        int do= 10*(input % 10)+(input % 1)/10;
        return input;
    }
}
