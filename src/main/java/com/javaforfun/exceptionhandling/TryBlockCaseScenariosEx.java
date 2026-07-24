package com.javaforfun.exceptionhandling;

/**
 * Demonstrates the behavioral edge cases documented in exception_handling.md.
 * Each case is isolated in its own method and invoked from main inside a
 * try-catch so one case's abnormal termination doesn't stop the others from running.
 */
public class TryBlockCaseScenariosEx {

    public static void main(String[] args) {
        System.out.println("--- Case 1: try-catch handles a matching exception ---");
        case1();

        System.out.println("--- Case 3: no exception raised, catch block is skipped ---");
        case3();

        System.out.println("--- Case 6: exception raised inside the catch block itself ---");
        try {
            case6();
        } catch (ArithmeticException e) {
            System.out.println("Caller observed: the exception from inside catch propagated out -> "
                    + e.getMessage());
        }

        System.out.println("--- Case 7: once an exception is raised, remaining try code is skipped ---");
        case7();

        System.out.println("--- Case 9: exception in catch still lets finally run, then propagates ---");
        try {
            case9();
        } catch (ArithmeticException e) {
            System.out.println("Caller observed: exception from catch propagated after finally ran -> "
                    + e.getMessage());
        }

        System.out.println("--- Case 10: exception in finally wins and propagates instead ---");
        try {
            case10();
        } catch (ArithmeticException e) {
            System.out.println("Caller observed: exception from finally propagated (masks the catch's exception) -> "
                    + e.getMessage());
        }
    }

    // Case 1: try-catch direct case - the raised exception matches the catch type.
    private static void case1() {
        try {
            throw new IllegalStateException("raised in try");
        } catch (IllegalStateException e) {
            System.out.println("Handled: " + e.getMessage());
        }
    }

    // Case 3: if there is no exception in the try block, the catch block is never entered.
    private static void case3() {
        try {
            System.out.println("No exception here, this line runs fine");
        } catch (Exception e) {
            System.out.println("This will never print");
        }
    }

    // Case 6: if the catch block itself raises an exception, it propagates to the caller
    // exactly like an uncaught exception from try would - this method ends abnormally.
    private static void case6() {
        try {
            throw new IllegalStateException("raised in try");
        } catch (IllegalStateException e) {
            System.out.println("Entered catch, but now raising a new exception from within it");
            int ignored = 10 / 0; // ArithmeticException escapes this method
        }
    }

    // Case 7 & 8 (identical in the docs): once an exception is thrown mid-try, every
    // statement after it in that try block is skipped - control jumps straight to catch.
    private static void case7() {
        try {
            int ignored = 10 / 0; // raises here
            System.out.println("This line is never reached");
        } catch (ArithmeticException e) {
            System.out.println("Handled: " + e.getMessage());
        }
    }

    // Case 9: finally always runs even when the catch block raises its own exception,
    // but once finally finishes, the exception from catch still propagates to the caller.
    private static void case9() {
        try {
            throw new IllegalStateException("raised in try");
        } catch (IllegalStateException e) {
            System.out.println("In catch, about to raise a new exception");
            int ignored = 10 / 0;
        } finally {
            System.out.println("finally still runs before the method ends abnormally");
        }
    }

    // Case 10: if finally itself raises an exception, that new exception replaces/masks
    // whatever exception was pending from try or catch, and THAT is what propagates.
    private static void case10() {
        try {
            throw new IllegalStateException("raised in try");
        } catch (IllegalStateException e) {
            System.out.println("In catch, about to raise a new exception");
            throw new NullPointerException("raised in catch, but about to be masked");
        } finally {
            System.out.println("finally raises its own exception, masking the catch's exception");
            int ignored = 10 / 0; // this is what the caller actually sees
        }
    }
}
