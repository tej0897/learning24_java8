package org.learning24.java8.Lambdas;

public class RunnableLambdaExample {
    public static void main(String[] args) {
        /**
         * prior Java 8
         */
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Inside Runnable 1");
            }
        };
        new Thread(runnable).start();

        /**
         * java 8 lambdas
         */

        Runnable runnableLambda = () -> System.out.println("Inside Runnable 2");
        new Thread(runnableLambda).start();


    }
}
