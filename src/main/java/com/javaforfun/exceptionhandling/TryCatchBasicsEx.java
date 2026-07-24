package com.javaforfun.exceptionhandling;

public class TryCatchBasicsEx {
    public static void main(String[] args) {
        // ----- try-catch -----
        // Code that may raise an exception goes in try; the matching catch handles it.
        try {
            int result = 10 / 0; // raises ArithmeticException
            System.out.println("Result: " + result); // never reached
        } catch (ArithmeticException e) {
            System.out.println("try-catch: caught -> " + e.getMessage());
        }

        // ----- try-catch-finally -----
        // finally runs whether or not an exception was raised - typically used to release resources.
        try {
            System.out.println("try-catch-finally: opening resource");
            throw new RuntimeException("simulated failure");
        } catch (RuntimeException e) {
            System.out.println("try-catch-finally: caught -> " + e.getMessage());
        } finally {
            System.out.println("try-catch-finally: closing resource (always runs)");
        }

        // ----- printStackTrace() vs getMessage() -----
        try {
            Integer.parseInt("not-a-number");
        } catch (NumberFormatException e) {
            System.out.println("getMessage() -> " + e.getMessage());
            System.out.print("printStackTrace() -> ");
            e.printStackTrace(); // prints the full stack trace, not just the message
        }

        // ----- Invalid try/catch syntax (documented for reference, not compilable) -----
        // 1. An independent try block with no catch/finally is a syntax error:
        //        try { ... }
        // 2. Statements between try and catch blocks are a syntax error:
        //        try { ... }
        //        System.out.println("");
        //        catch (Exception e) { ... }
        // These are intentionally left as comments since they would fail to compile.
    }
}
