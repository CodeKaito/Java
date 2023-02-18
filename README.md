# My learning progress about Java

### Index

1. [ Introduction. ](#introduction)
2. [ Java Quickstart. ](#start)
3. [ Java Syntax. ](#syntax)
    - [ Main() Method ](#main)
    - [ System.out.println() ](#print)

<a name="introduction"></a>
- ## Introduction
### What is Java?
Java is a popular programming language, created in 1995.

It is owned by Oracle, and more than 3 billion devices run Java.

It is used for:

Mobile applications (specially Android apps)
Desktop applications
Web applications
Web servers and application servers
Games
Database connection
And much, much more!

### Why Use Java?
Java works on different platforms (Windows, Mac, Linux, Raspberry Pi, etc.)
It is one of the most popular programming language in the world
It has a large demand in the current job market
It is easy to learn and simple to use
It is open-source and free
It is secure, fast and powerful
It has a huge community support (tens of millions of developers)
Java is an object oriented language which gives a clear structure to programs and allows code to be reused, lowering development costs
As Java is close to C++ and C#, it makes it easy for programmers to switch to Java or vice versa

<a name="start"></a>
- ## Java Quickstart
In Java, every application begins with a class name, and that class must match the filename.

Let's create our first Java file, called Main.java, which can be done in any text editor (like Notepad).

The file should contain a "Hello World" message, which is written with the following code:
````
Main.java
public class Main {
  public static void main(String[] args) {
    System.out.println("Hello World");
  }
}
````

Don't worry if you don't understand the code above - we will discuss it in detail in later chapters. For now, focus on how to run the code above.

Save the code in Notepad as "Main.java". Open Command Prompt (cmd.exe), navigate to the directory where you saved your file, and type "javac Main.java":
````
C:\Users\Your Name>javac Main.java
````

This will compile your code. If there are no errors in the code, the command prompt will take you to the next line. Now, type "java Main" to run the file:
````
C:\Users\Your Name>java Main
````
Output:
````
Hello World!
````

<a name="syntax"></a>
- ## Java Syntax
Every line of code that runs in Java must be inside a `class`. In our example, we named the class Main. A class should always start with an uppercase first letter.

Note: Java is case-sensitive: "MyClass" and "myclass" has different meaning.

The name of the java file must match the class name. When saving the file, save it using the class name and add ".java" to the end of the filename. To run the example above on your computer, make sure that Java is properly installed: Go to the Get Started Chapter for how to install Java. The output should be:

````
Hello World
````

<a name="main"></a>
### The main Method
The `main() method` is required and you will see it in every Java program:
````
public static void main(String[] args)
````

⚠️ Note: remember that every Java program has a class name which must match the filename, and that every program must contain the main() method.

<a name="print"></a>
### System.out.println()
Inside the main() method, we can use the println() method to print a line of text to the screen:
````
public static void main(String[] args) {
  System.out.println("Hello World");
}
````
