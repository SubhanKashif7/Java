# Welcome to JAVA Repository of Subhan Kashif
where you can learn java

## What Is Java
Java is a compiled and also interpreted language and it is purely supports Object Oriented Programming (OOPS) It only Supports OOPS not POPS Unlike CPP which both support POPS AND OOPS

## Java is known for
its robustness and Verbose nature , Security , Scalablity , Compatibility

## Where it is Used
- Backend Development
- App Development (Will be replaced by Kotlin soon)
- Game Development
- Cloud Computing
- Big Data
- Artificial Intelligence
- IoT (Internet of Things)

## Installation
we will use Java jdk (Java Development Kit) we need to install it into out compiter
you can install it by this site

https://www.oracle.com/java/technologies/downloads/

if you are in Windows add the path to environment variables PATH

### Java Syntax
```Java
class Main{
    public static void main(String[] args){
        // Code here
    }
}
```

here Main will be the filename the it is a good practice to keep the Filename's first character UpperCase 
"Main" after class will be replaced by Filename

in this class it has a main() function 
the public keyword keeps the method public and static for running the function inside a class , void means it returns nothing as you can see it doesnt return anything

the extension for java files is .java


### Printing output in Java


```java
class Main{
    public static void main(String[] args){
        System.out.println("Hello World!");
    }
}

```

the text written after // is a comment and not executed 
we are using a comment /* this is a comment text */

### DataTypes in Java
```java
    short myShort; /* it stores 2 bytes , 16 bit of memory it can 
    take whole numbers from -32,768 to 32,767
    */
    int myInt; /* 
            it stores 4 bytes , 32 bits of memory , it can take whole numbers 
            int can store whole numbers within the range from -2,147,483,648 to 2,147,483,647123.

            To put it in perspective, consider that an int can hold approximately 2 billion different values. That’s quite a lot of numbers! 🌟
     */
    long myLong; /* 
            it stores 8 bytes , 64 bits of memory , it can 	Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
            
     */

    byte myByte;  // it is 1 byte  ,  8 bits it can store whole numbers from -128 to 127

    boolean myBool; // it takes 1 bit 

    double myDouble; // it is 8 bytes , 64 bits , Stores fractional numbers , Sufficient for 15 decimal digits
    char myChar; // takes 2 bytes , 16 bits of memory , Stores a single character / letter or ASCII values

    float myFloat; // it takes 4 bytes , 32 bits of memory , Stores fractional numbers , Sufficient for storing 6 to 7 decimal digits
    
```


initializing a variable

```java
    int myInt = 100;
    // like this
```


### outputting a variable
```java
    class Main{
         public static void main(String[] args){
             int marks = 100;
             System.out.println(marks);
         }
}

```
#

