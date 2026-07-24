package com.javaforfun.interfacetesting;

public class InterfaceTestingEx {
    public static void main(String[] args) {
        // ----- TestInterface: single abstract method + default method -----
        // Only one abstract method (isValidString) means TestInterface can be
        // implemented with a lambda, even without an @FunctionalInterface annotation.
        TestInterface validator = str -> str != null && !str.isBlank();

        System.out.println("isValidString(\"hello\"): " + validator.isValidString("hello"));
        System.out.println("isValidString(\"   \"): " + validator.isValidString("   "));

        // default method - shared implementation, available on every implementer for free
        System.out.println("listToString(): " + validator.listToString());

        // Interface fields are implicitly public static final, so they belong to the
        // interface itself and can be read without any implementing instance.
        System.out.println("TestInterface.strLst: " + TestInterface.strLst);

        // ----- Log: a static field shared across every implementing class -----
        System.out.println();
        System.out.println("Log.lst before any log() calls: " + Log.lst);

        Logger logger = new Logger();
        boolean logged = logger.log(); // adds "san" then removes it again
        System.out.println("logger.log() returned: " + logged);
        System.out.println("Log.lst after Logger.log(): " + Log.lst);

        AuditLogger auditLogger = new AuditLogger();
        auditLogger.log(); // adds "audit-entry" and leaves it in place
        // Note this is read through Log.lst, not auditLogger's "own" list - there is
        // only ever one list, because the field lives on the interface, not the class.
        System.out.println("Log.lst after AuditLogger.log(): " + Log.lst);
    }
}
