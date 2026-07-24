package com.javaforfun.interfacetesting;

public class AuditLogger implements Log {

    @Override
    public boolean log() {
        // Deliberately not removed afterwards (unlike Logger.log()), so that
        // InterfaceTestingEx can show the mutation is visible through Log.lst -
        // proof that the static field is shared, not per-implementation.
        return lst.add("audit-entry");
    }
}
