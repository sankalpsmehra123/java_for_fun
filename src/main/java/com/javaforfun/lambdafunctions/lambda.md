# Lambda

## Why Lambdas?

1. To reduce the amount of byte code
2. To introduce functional paradigm into Java
3. To enable support for parallel programming
4. Easier to use APIs and libraries

## Why Functional Programming?

1. We use it because it is easier and concise to use functional programming in certain situations.

## Problems of OOP

Everything is associated with an object. No function is possible without a class.

## Lambda Expression

A lambda expression is an inline value that is assigned to a variable. In a lambda expression we assign a method to a variable, i.e. the variable then contains the method.

### Format of lambda expression

``` java
<FunctionalInterfaceType> variableName = (parameters) -> {block_of_code} 
```
> Note:  
> All the interfaces mentioned in below examples are [***Functional Interfaces***](lambda.md#functional-interface).

#### Examples:
1. Lambda expression without an argument (parameter).
```java
    GreetingInterface greetingsFunction = () -> System.out.println();
```
2. Lambda expression with arguments (parameters).
```java
    DoubleInterface doubleNumberFunction = (int a) -> a*2;
    AddInterface addFunction = (int a, int b) -> a+b;
    // when passing the parameters to the lambda we can skip the type and the compiler will figure that out on its own using a concept called type inference
    DivisionInterface safeDivideFunction = (a, b) -> {
        if(b == 0 ) return 0;
        return a/b;
    };
    StringLengthInterface stringLengthCountFunction = (String s) -> s.length();
```

> Note:  
> The example `safeDivideFunction` is using a concept called ***type inference*** - using this concept the compiler is able to figure out the type of the passed parameter from the method signature defined in the functional interface.

we can also pass the lambda expression as the parameter directly to a function as shown in below code snippet

```java
//function which accepts lambda expression as input
greet(()-> System.out.println("hello"));

public void greet(_____){
    ________();
}
```

## Functional Interface

#### Annotation:
@FunctionalInterface: helps us identify that in this particular interface not more than one abstract method is allowed.

#### Definition (Java 7):
An interface with only one abstract method.

#### Definition (Java 8+):
An interface with only one abstract method. It might or might not have default methods.

> Note:  
> The definitions differ because of the `default` keyword, which was introduced to implement methods in interfaces (Java 8+).


## Anonymous Inner Class

Inline implementation of an interface by creating an anonymous class

```java
    //Example of anonymous inner class of GreetingInterface.
    GreetingInterface greetings = new GreetingInterface() {
        public void greet() {
            System.out.println("hello!");
        } 
    };

    greetings.greet();
```

### Why Lambda is of Functional Interface Type?
The reason behind this decision is backward compatibility. The advantage of using functional interface type is for all the older libraries using the interface in the method signatures we can now send the instance of this functional interface without rewriting them.

