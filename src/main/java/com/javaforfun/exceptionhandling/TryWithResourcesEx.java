package com.javaforfun.exceptionhandling;

public class TryWithResourcesEx {

    // Any class implementing AutoCloseable can be declared in a try-with-resources block.
    static class Resource implements AutoCloseable {
        private final String name;

        Resource(String name) {
            this.name = name;
            System.out.println("Opening " + name);
        }

        void use() {
            System.out.println("Using " + name);
        }

        @Override
        public void close() {
            // close() is called automatically, even if an exception is thrown in the try block.
            System.out.println("Closing " + name);
        }
    }

    public static void main(String[] args) {
        // ----- try with a single resource declaration -----
        try (Resource r1 = new Resource("Resource-1")) {
            r1.use();
        }

        // ----- try with multiple resource declarations -----
        // Resources are closed automatically in the REVERSE order they were declared,
        // i.e. Resource-3 closes first, then Resource-2.
        try (Resource r2 = new Resource("Resource-2"); Resource r3 = new Resource("Resource-3")) {
            r2.use();
            r3.use();
        }

        // ----- try-with-resources combined with catch -----
        // Resources still get closed before the catch block runs, since close() happens
        // as part of the try block exiting, before control is handed to catch.
        try (Resource r4 = new Resource("Resource-4")) {
            r4.use();
            throw new RuntimeException("simulated failure while using Resource-4");
        } catch (RuntimeException e) {
            System.out.println("Caught -> " + e.getMessage());
        }
    }
}
