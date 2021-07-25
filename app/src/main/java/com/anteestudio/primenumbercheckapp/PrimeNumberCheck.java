package com.anteestudio.primenumbercheckapp;

public class PrimeNumberCheck {
    public static boolean isPrimeNumber(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i < number - 1; i++) {
            if (number % 2 == 0) {
                return false;
            }
        }
        return true;
    }
}
