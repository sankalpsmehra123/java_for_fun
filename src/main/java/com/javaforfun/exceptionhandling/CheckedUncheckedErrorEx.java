package com.javaforfun.exceptionhandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CheckedUncheckedErrorEx {

    // ----- Checked Exception -----
    // FileNotFoundException is checked: the compiler forces the caller to either
    // catch it or declare it with `throws`, because the program CAN recover from it
    // (e.g. by asking the user for a different file path). The try-with-resources
    // close() also declares IOException, so the method must own that too.
    static void readFileDeclaringThrows(String path) throws IOException {
        try (FileInputStream in = new FileInputStream(path)) {
            in.available();
        }
    }

    public static void main(String[] args) {
        // Caller chooses to catch the checked exception rather than propagate it further.
        // FileNotFoundException is caught first (child), IOException second (parent) -
        // same child-before-parent ordering rule multiple catch blocks must follow.
        try {
            readFileDeclaringThrows("this-file-does-not-exist.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Checked exception handled: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Checked exception handled (IOException): " + e.getMessage());
        }

        // ----- Unchecked Exception (RuntimeException subclasses) -----
        // The compiler does NOT force handling of these, but recovery is still possible,
        // it's just left to the programmer's discretion.
        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[5]); // ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Unchecked exception handled: " + e.getMessage());
        }

        try {
            Object text = "I am a String";
            Integer number = (Integer) text; // ClassCastException
            System.out.println(number);
        } catch (ClassCastException e) {
            System.out.println("Unchecked exception handled: " + e.getMessage());
        }

        // ----- Error -----
        // Errors are unchecked too, but recovery is generally NOT possible and the
        // program should be allowed to terminate. Catching an Error is bad practice;
        // this is done here purely to observe the behavior, not as a recommended pattern.
        try {
            triggerStackOverflow(0);
        } catch (StackOverflowError e) {
            System.out.println("Error observed (should normally NOT be caught in real code): "
                    + e.getClass().getSimpleName());
        }
    }

    private static void triggerStackOverflow(long depth) {
        triggerStackOverflow(depth + 1); // uncontrolled recursion -> StackOverflowError
    }
}
