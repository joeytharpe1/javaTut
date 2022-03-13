package com.codewithjoey;

//import java.text.NumberFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // number formatter
        String result = NumberFormat.getPercentInstance().format(0.2);

        //Scanner object for use
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is your name: ");
        String name = scanner.nextLine();
        System.out.println("name: " + name);


    }
}
