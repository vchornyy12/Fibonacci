package com.vchornyy12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {


   private static long[] fibonacciCache;

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input number you wanna to know in Fibonacci sequence");
        int n = Integer.parseInt(reader.readLine());
        fibonacciCache = new long[n + 1];
        System.out.println("The " + n + "-th number in Fibonacci sequence is " + fibonacci(n));
        reader.close();

    }

    private static long fibonacci(int n) {
        if(n <= 1){
            return n;
        }
        if(fibonacciCache[n] != 0){
            return (fibonacciCache[n]);
        }
        long nFibonacciNumber = (fibonacci(n-1) + fibonacci(n-2));
        fibonacciCache[n] = nFibonacciNumber;
        return nFibonacciNumber;
    }
}
