package com.javarush.task.task15.task1522;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Закрепляем паттерн Singleton
*/

public class Solution {
    public static void main(String[] args) {

    }

    public static Planet thePlanet;

    static {
        readKeyFromConsoleAndInitPlanet();
    }

    public static void readKeyFromConsoleAndInitPlanet() {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        if (s.equals("sun")) {
            thePlanet = Sun.getInstance();
        } else if (s.equals("moon")) {
            thePlanet = Moon.getInstance();
        } else if (s.equals("earth")) {
            thePlanet = Earth.getInstance();
        } else {
            thePlanet = null;
        }
    }
}
