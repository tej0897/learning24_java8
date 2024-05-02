package org.learning24.java8.ImperativeVsDeclarative;

import java.util.stream.IntStream;

/**
 * Objective: summation of first 100 numbers
 */
public class ImperativeVsDeclarativeExample1 {
    public static void main(String[] args) {

        /**
         * Imperative - how style of programming
         */

        int sum = 0;
        for(int i=0; i<=100; i++){
            sum = sum+i;
        }
        System.out.println("Sum using Imperative Approach: "+sum);

        /**
         * Declarative - What style of programing
         */

        int sum1 = IntStream.rangeClosed(0, 100).sum();
        System.out.println("Sum using Declarative Approach: "+sum1);

    }









}
