package com.javaforfun.exceptionhandling;

public class MultiCatchEx {
    public static void main(String[] args) {
        // ----- Multiple catch blocks -----
        // Must be ordered child -> parent. NumberFormatException is a subclass of
        // IllegalArgumentException, which is a subclass of RuntimeException.
        // Putting a parent catch before a child catch is a compile error (unreachable code).
        try {
            Integer.parseInt("abc"); // raises NumberFormatException
        } catch (NumberFormatException e) {
            System.out.println("Multi-catch (child first): caught NumberFormatException -> " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Multi-catch: caught IllegalArgumentException");
        } catch (RuntimeException e) {
            System.out.println("Multi-catch: caught RuntimeException");
        }

        // ----- Multi-catch with the pipe (|) operator -----
        // Handles multiple, unrelated exception types in a single catch block.
        // The exceptions combined with '|' must NOT be in a parent-child relationship
        // (e.g. combining IllegalArgumentException | NumberFormatException would not compile,
        // since one is already a subtype of the other).
        for (String input : new String[] {"10", "0", "xyz"}) {
            try {
                int divisor = Integer.parseInt(input);
                System.out.println("100 / " + divisor + " = " + (100 / divisor));
            } catch (ArithmeticException | NumberFormatException e) {
                System.out.println("Pipe multi-catch: caught " + e.getClass().getSimpleName()
                        + " -> " + e.getMessage());
            }
        }
    }
}
