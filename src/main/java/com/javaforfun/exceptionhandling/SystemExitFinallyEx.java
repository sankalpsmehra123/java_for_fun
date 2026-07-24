package com.javaforfun.exceptionhandling;

/**
 * Case 11: if System.exit() is called inside a try block, the JVM terminates
 * immediately - the finally block does NOT run. This is kept in its own class
 * since it ends the JVM process; run it standalone to observe the behavior.
 */
public class SystemExitFinallyEx {
    public static void main(String[] args) {
        try {
            System.out.println("Inside try, about to call System.exit(0)");
            System.exit(0);
            System.out.println("This line is unreachable");
        } finally {
            System.out.println("This finally block is NEVER printed");
        }
    }
}
