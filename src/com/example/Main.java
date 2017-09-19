package com.example;

import com.example.common.Month;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        for(Month month: Month.values()) {
            System.out.println(month.getEnglishName());
        }

        System.out.println("Choose one of the months: ");
        String input = new Scanner(System.in).nextLine();

        ArrayList<String> theMonths = new ArrayList<>();

        switch (input) {
            case "January": theMonths.add("January");
            case "February": theMonths.add("February");
            case "March": theMonths.add("March");
            case "April": theMonths.add("April");
            case "May": theMonths.add("May");
            case "June": theMonths.add("June");
            case "July": theMonths.add("July");
            case "August": theMonths.add("August");
            case "September": theMonths.add("September");
            case "October": theMonths.add("October");
            case "November": theMonths.add("November");
            case "December": theMonths.add("December");

                break;
            default: break;
        }

        for(String mon: theMonths) {
            System.out.println(mon);
        }
    }
}
