package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input day:");
        int day = scanner.nextInt();
        System.out.println("Input month:");
        String month = scanner.next();
        String sign = "";
        if (month.equals("January")) {
            if (day < 20)
                sign = "Capricorn";
            else
                sign = "Aquarius";
        }
        else if (month.equals("February")) {
            if (day < 19)
                sign += "Aquarius";
            else
                sign = "Pisces";
        }
        else if(month.equals("March")) {
            if (day < 21)
                sign = "Pisces";
            else
                sign = "Aries";
        }
        else if (month.equals("April")) {
            if (day < 20)
                sign = "Aries";
            else
                sign = "Taurus";
        }
        else if (month.equals("May")) {
            if (day < 21)
                sign = "Taurus";
            else
                sign = "Gemini";
        }
        else if( month.equals("June")) {
            if (day < 21)
                sign = "Gemini";
            else
                sign = "Cancer";
        }
        else if (month.equals("July")) {
            if (day < 23)
                sign = "Cancer";
            else
                sign = "Leo";
        }
        else if( month.equals("August")) {
            if (day < 23)
                sign = "Leo";
            else
                sign = "Virgo";
        }
        else if (month.equals("September")) {
            if (day < 23)
                sign = "Virgo";
            else
                sign = "Libra";
        }
        else if (month.equals("October")) {
            if (day < 23)
                sign = "Libra";
            else
                sign = "Scorpio";
        }
        else if (month.equals("November")) {
            if (day < 22)
                sign = "scorpio";
            else
                sign = "Sagittarius";
        }
        else if (month.equals("December")) {
            if (day < 22)
                sign = "Sagittarius";
            else
                sign ="Capricorn";
        }

        System.out.println("Your sign is " + sign);
    }
}
