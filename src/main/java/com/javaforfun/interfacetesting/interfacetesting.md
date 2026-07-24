# Interfaces

| Property | Description |
| --- | --- |
| Fields | Implicitly `public static final` - interfaces cannot hold instance state. |
| Methods | Abstract by default; can also have `default`, `static`, and `private` bodies. |
| Instantiation | Cannot be instantiated directly, only implemented by a class or a lambda (if it qualifies as a functional interface). |
| Multiple Inheritance | A class can implement multiple interfaces, gaining each one's abstract and default methods. |

## Files in this package

| File | Demonstrates |
| --- | --- |
| `TestInterface.java` | An abstract method (`isValidString`), a `default` method (`listToString`), and an implicitly `static final` field (`strLst`). |
| `Log.java` | A single abstract method (`log`) plus a field (`lst`) shared by every implementing class. |
| `Logger.java` | A `Log` implementation that mutates the shared field and returns a real result. |
| `AuditLogger.java` | A second `Log` implementation, used to prove `lst` is shared, not per-class. |
| `InterfaceTestingEx.java` | Runnable `main` that exercises all of the above. |

## Fields cannot hold per-instance state

```java
public interface TestInterface {
    List<String> strLst = List.of("sajkl", "sdjfsd", ":");
    // private String color = null; <-- not allowed: interfaces cannot declare instance fields
}
```

Any field declared in an interface is implicitly `public static final`. There is exactly
one copy of it, owned by the interface itself - not one copy per implementing class.

## The shared-static-field gotcha

`Log` declares `ArrayList<String> lst`. Because that field is static, **every** class
that implements `Log` is reading and writing the exact same list:

```java
public interface Log {
    ArrayList<String> lst = new ArrayList<>();
    boolean log();
}
```

`Logger.log()` adds `"san"` then immediately removes it, leaving the list empty.
`AuditLogger.log()` adds `"audit-entry"` and leaves it there. Because both classes
share the one static `lst`, calling `AuditLogger.log()` after `Logger.log()` makes
`"audit-entry"` visible through `Log.lst` even though `AuditLogger` never declared
its own list. See `InterfaceTestingEx.main` for the runnable proof.

> Note: using an interface purely to hold shared constants/state like this is known as
> the *constant interface antipattern* - it leaks implementation detail into a type's
> public API. Prefer a `final` class with `private static final` fields instead.

## Abstract vs default methods

- `isValidString(String)` and `log()` are abstract - every implementing class must
  provide a body.
- `listToString()` is a `default` method - it has a body in the interface itself, and
  is inherited for free by any implementer.

## Functional interfaces and lambdas

`TestInterface` has exactly one abstract method (`isValidString`), so it qualifies as
a functional interface even without an `@FunctionalInterface` annotation, and can be
implemented with a lambda:

```java
TestInterface validator = str -> str != null && !str.isBlank();
validator.isValidString("hello"); // true
validator.listToString();         // still works - default methods come along for free
```
