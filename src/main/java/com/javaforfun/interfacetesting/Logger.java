package com.javaforfun.interfacetesting;

public class Logger implements Log{

    @Override
    public boolean log() {
        lst.add("san");
        // lst is declared on the Log interface, so it is implicitly public static final:
        // this Logger and every other Log implementation share the exact same list instance.
        boolean wasLogged = lst.contains("san");
        lst.remove("san");
        return wasLogged;
    }

}
