# Exception Handling

If unhandled exceptions occur in run time then:

1. The program is terminated abnormally.
2. Rest of the application is not executed.

To overcome the above problem we handle the exception using:

1. try-catch-finally or try-catch
2. throws

To handle exception using try-catch or try-catch-finally block we follow the following syntax:

```java
    try{
        //code that is may raise exception(s)
    } catch (Exception e){
        //logic that needs to be executed once the exception is raised.
    }
```

```java
    try{
        //code that is may raise exception(s)
    } catch (Exception e){
        //logic that needs to be executed once the exception is raised.
    } finally {
        //logic that needs to be run irrespective the exception is raised or not
    }
```

Try block can have 3 valid syntax

1. try with catch
    - try with multiple catch (make sure that the catch block order is child --> parent i.e first handling should be done for child then parent).
    - we can use the "pipe" (|) symbol to handle multipule exception in a single catch. (while using this approach we should not keep parent child exception in the same catch).
2. try with finally
3. try with resource declarations

> Note:  
> All other are invalid syntax

### Printing:
- printStackTrace(): We can use the method to directly print exception data.
- getMessage(): We can use this method to directly print the message but not the stack trace.  

### ***Checked Exceptions*** 
are generally those from which a program can recover & it might be a good idea to recover from such exceptions programmatically. Examples include `FileNotFoundException`, `ParseException`, etc. A programmer is expected to check for these exceptions by using the try-catch block or throw it back to the caller

### ***Unchecked Exceptions*** 
are those exceptions that might not happen if everything is in order, but they do occur. Examples include `ArrayIndexOutOfBoundsException`, `ClassCastException`, etc. Many applications will use try-catch or throws clause for RuntimeExceptions & their subclasses but from the language perspective it is not required to do so. Do note that recovery from a RuntimeException is generally possible but the guys who designed the class/exception deemed it unnecessary for the end programmer to check for such exceptions.

### ***Errors*** 
are also unchecked exception & the programmer is not required to do anything with these. In fact it is a bad idea to use a try-catch clause for Errors. Most often, recovery from an Error is not possible & the program should be allowed to terminate. Examples include `OutOfMemoryError`, `StackOverflowError`, etc.


## Some Examples of try-catch

***Case 1:*** try-catch direct case

```java
    try{
        return new Exception();
    } catch (Exception e){
        //logic that needs to be executed once the exception is raised.
    }
```

***Case 2:*** try with not matching catch. In this case code will terminate abnormally

```java
    try{
        //code raises NullPointerException
        return new NullPointerException();
    } catch (IOException e){
        //catch handles IOException
    }
```

***Case 3:*** if there is no exception in try block, catch blocks are not checked

```java
    try{
        //code with no exception
    } catch (Exception e){
        //this code will not be executed
    }
```

***Case 4:*** independent try blocks are not allowed

```java
    try{
        //this is a syntax error
    }
```

***Case 5:*** statements in between try and catch are invalid syntax

```java
    try{
        //code that is may raise exception(s)
    } 
    System.out.println(""); //syntax error
    catch (Exception e){
        //logic that needs to be executed once the exception is raised.
    }
```

***Case 6:*** if exception is raised in catch block the program will end abnormally

```java
    try{
        return new Exception();
    } catch (Exception e){
        //if here also exception is raised
        10/0;
    }
```

***Case 7:*** if exception is raised in try block the remaining code of the try block is not executed

```java
    try{
        10/0;
        System.out.println("");
    } catch (Exception e){
        //logic that needs to be executed once the exception is raised.
    }
```

***Case 8:*** if exception is raised in try block the remaining code of the try block is not executed

```java
    try{
        10/0;
        System.out.println("");
    } catch (Exception e){
        //logic that needs to be executed once the exception is raised.
    }
```

***Case 9:*** if exception is raised in catch block the finally will still get executed then will end abnormally

```java
    try{
        return new Exception();
    } catch (Exception e){
        //if here also exception is raised
        10/0;
    } finally {
        // close the connection
    }
```

***Case 10:*** if exception is raised in finally block the program will end abnormally

```java
    try{
        return new Exception();
    } catch (Exception e){
        //if here also exception is raised
        10/0;
    } finally {
        10/0;
    }
```

***Case 11:*** if system exit is done jvm is exited then finally is not executed.

```java
    try{
        10/1;
        System.exit(0);
    } finally {
        // not executed
    }
```