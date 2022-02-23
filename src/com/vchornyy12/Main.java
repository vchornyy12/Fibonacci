package com.vchornyy12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

   static int n;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input number you wanna to know in Fibonacci sequence");
        n = Integer.parseInt(reader.readLine());
        System.out.println("The " + n + " in Fibonacci sequence is " + fibonacci(n));
    }

    private static long fibonacci(int n) {
        if(n <= 1){
            return n;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }
}
