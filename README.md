# My learning progress about Java

## Java Basics

1. [ Introduction ](#introduction)
2. [ Java Quickstart ](#start)
3. [ Java Syntax ](#syntax)
    - [ Main() Method ](#main)
    - [ System.out.println() ](#print)
4. [ Java Output / Print ](#output)
    - [ Double quotes ](#quotes)
    - [ Java Output Numbers ](#outputnumbers)
5. [ Java Variables ](#variables)
    - [ Print Variables ](#printvariables)
    - [ Multiple Variables ](#multiplevariables)
    - [ Identifiers ](#identifiers)
6. [ Java If...Else ](#if)
    - [ Java Conditions and If Statements ](#if2)
    - [ Else Statement ](#else)
    - [ Else If Statement ](#elseif)
    - [ Short Hand If...Else](#shorthand)
7. [ Java While Loops ](#while)
    - [ The Do/While Loop ](#dowhile)
8. [ Java For Loops](#for)
    - [ For each loops ](#foreach)
9. [ Java Arrays ](#arrays)
---------------------------
## Java Method (functions)

1. [ Java Method ](#methods)
    - [ Java Parameters and Arguments](#parameters)
    - [ Java Method Overloading ](#overloading)
    - [ Java Scope ](#scope)
    - [ Java Recursion ](#recursion)
---------------------------
## Java Classes

1. [ Java OOP](#oop)
2. [ Java Classes/objects ](#classes)
    - [ Create a Class ](#createclass)
    - [ Create an Object ](#createobject)
    - [ Multiple Objects ](#multipleobject)
    - [ Using Multiple Classes ](#multipleclasses)
4. [ Java Class attributes](#attributes)
5. [ Java Class Method ](#classmethod)
6. [ Java Class Constructors ](#classconstructor)
7. [ Java Modifiers ](#modifiers)
8. [ Java Encapsulation ](#encapsulation)
9. [ Java Packages & API ](#packages)
10. [ Java Inheritance ](#inheritance)
11. [ Java Polymorphism ](#polymorphism)
12. [ Java Inner Classes ](#innerclasses)
13. [ Java Abstraction ](#abstraction)
14. [ Java Interface ](#interface)
15. [ Java Enums ](#enums)
16. [ Java User Input (Scanner) ](#input)
17. [ Java Dates ](#dates)
18. [ Java Arraylist ](#arraylist)
19. [ Java Hashmap ](#hashmap)
20. [ Java Hashset ](#hashset)
21. [ Java Iterator ](#iterator)
22. [ Java Wrapper Classes ](#wrapper)
23. [ Java Exceptions ](#exceptions)
24. [ Java RegEx ](#regex)
25. [ Java Threads ](#threads)
26. [ Java Lambda ](#lambda)
---------------------------
## Java File Handling

1. [Java Files](#files)
2. [Java Create/Write Files](#create)
4. [Java Read Files](#read)
6. [Java Delete Files](#delete)
---------------------------
## Java Notes

---------------------------

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

?????? Note: remember that every Java program has a class name which must match the filename, and that every program must contain the main() method.

<a name="print"></a>
### System.out.println()
Inside the main() method, we can use the println() method to print a line of text to the screen:
````
public static void main(String[] args) {
  System.out.println("Hello World");
}
````
?????? Note: The curly braces `{}` marks the beginning and the end of a block of code.

`System` is a built-in Java class that contains useful members, such as `out`, which is short for "output". The `println()` method, short for "print line", is used to print a value to the screen (or a file).

Don't worry too much about `System`, `out` and `println()`. Just know that you need them together to print stuff to the screen.

You should also note that each code statement must end with a semicolon (`;`).

<a name="output"></a>
### Java Output / Print
You can add as many println() methods as you want:
````
System.out.println("Hello World!");
System.out.println("I am learning Java.");
System.out.println("It is awesome!");
````

?????? Note: You can add as many println() methods as you want. Note that it will add a new line for each method.

<a name="quotes"></a>
### Double Quotes
When you are working with text, it must be wrapped inside double quotations marks `""`.

If you forget the double quotes, an error occurs:
````diff
+System.out.println("This sentence will work!");
-System.out.println(This sentence will produce an error);
````
### The Print() Method
There is also a print() method, which is similar to println().

The only difference is that it does not insert a new line at the end of the output:
````
System.out.print("Hello World! ");
System.out.print("I will print on the same line.");
````
Output:
````
Hello World! I will print on the same line.
````

<a name="outputnumbers"></a>
### Java Output Numbers
You can also use the println() method to print numbers.

However, unlike text, we don't put numbers inside double quotes:
````
System.out.println(3);
System.out.println(358);
System.out.println(50000);
````
You can also perform mathematical calculations inside the println() method:
````
System.out.println(3 + 3);
System.out.println(2 * 5);
````

<a name="variables"></a>
- ## Java Variables
Variables are containers for storing data values.
-`String` - stores text, such as "Hello". String values are surrounded by double quote
- `int` - stores integers (whole numbers), without decimals, such as 123 or -123
- `float` - stores floating point numbers, with decimals, such as 19.99 or -19.99
- `char` - stores single characters, such as 'a' or 'B'. Char values are surrounded by single quotes
- `boolean` - stores values with two states: true or false

### Declaring (Creating) Variables
To create a variable, you must specify the type and assign it a value:
````
type variablename = value
````
Where type is one of Java's types (such as int or String), and variableName is the name of the variable (such as x or name). The equal sign is used to assign values to the variable.

To create a variable that should store text, look at the following example:
````
String name = "John";
System.out.println(name);
````

To create a variable that should store a number, look at the following example:
````
int myNum = 15;
System.out.println(myNum);
````

You can also declare a variable without assigning the value, and assign the value later:
````
int myNum;
myNum = 15;
System.out.println(myNum);
````
??????Note: that if you assign a new value to an existing variable, it will overwrite the previous value:

A demonstration of how to declare variables of other types:
````
int myNum = 5;
````
````
float myFloatNum = 5.99f;
````
````
char myLetter = 'D';
````
````
boolean myBool = true;
````
````
String myText = "Hello";
````

<a name="printvariables"></a>
### Print Variables
The `println()` method is often used to display variables.

To combine both text and a variable, use the + character:
````
String name = "John";
System.out.println("Hello " + name);
````
You can also use the + character to add a variable to another variable:
````
String firstName = "John ";
String lastName = "Doe";
String fullName = firstName + lastName;
System.out.println(fullName);
````
For numeric values, the `+` character works as a mathematical operator (notice that we use `int` (integer) variables here):
````
int x = 5;
int y = 6;
System.out.println(x + y); // Print the value of x + y
````

<a name="multiplevariables"></a>
### Multiple Variables
To declare more than one variable of the same type, you can use a comma-separated list:
````diff
-int x = 5;
-int y = 6;
-int z = 50;
-System.out.println(x + y + z);
````
````diff
+int x = 5, y = 6, z = 50;
+System.out.println(x + y + z);
````
### One Value to Multiple Variables
You can also assign the same value to multiple variables in one line:
````
int x, y, z;
x = y = z = 50;
System.out.println(x + y + z);
````

<a name="identifiers"></a>
### Identifiers
All Java variables must be identified with unique names.

These unique names are called identifiers.

Identifiers can be short names (like x and y) or more descriptive names (age, sum, totalVolume).
````
// Good
int minutesPerHour = 60;

// OK, but not so easy to understand what m actually is
int m = 60;
````

?????? Note: The general rules for naming variables are:

- Names can contain letters, digits, underscores, and dollar signs
- Names must begin with a letter
- Names should start with a lowercase letter and it cannot contain whitespace
- Names can also begin with $ and _ (but we will not use it in this - tutorial)
- Names are case sensitive ("myVar" and "myvar" are different variables)
- Reserved words (like Java keywords, such as `int` or `boolean`) cannot be used as names

<a name ="if"></a>
- ## Java If Statement
You already know that Java supports the usual logical conditions from mathematics:

- Less than: `a < b`
- Less than or equal to: `a <= b`
- Greater than: `a > b`
- Greater than or equal to: `a >= b`
- Equal to `a == b`
- Not Equal to: `a != b`

Java has the following conditional statements:

Use `if` to specify a block of code to be executed, if a specified condition is true
Use `else` to specify a block of code to be executed, if the same condition is false
Use `else if` to specify a new condition to test, if the first condition is false
Use `switch` to specify many alternative blocks of code to be executed

<a name="if2"></a>
### The if Statement
Use the `if` statement to specify a block of Java code to be executed if a condition is `true`.
````
if (condition) {
  // block of code to be executed if the condition is true
}
````
Example:
````
int x = 20;
int y = 18;
if (x > y) {
  System.out.println("x is greater than y");
}
````
In the example above we use two variables, x and y, to test whether x is greater than y (using the > operator). As x is 20, and y is 18, and we know that 20 is greater than 18, we print to the screen that "x is greater than y".

?????? Note that if is in lowercase letters. Uppercase letters (If or IF) will generate an error.

<a name="else"></a>
### The else Statement
Use the `else` statement to specify a block of code to be executed if the condition is `false`.
````
if (condition) {
  // block of code to be executed if the condition is true
} else {
  // block of code to be executed if the condition is false
}
````
Example:
````
int time = 20;
if (time < 18) {
  System.out.println("Good day.");
} else {
  System.out.println("Good evening.");
}
// Outputs "Good evening."
````
In the example above, time (20) is greater than 18, so the condition is `false`. Because of this, we move on to the `else` condition and print to the screen "Good evening". If the time was less than 18, the program would print "Good day".

<a name="elseif"></a>
### The Else If Statement
Use the `else if` statement to specify a new condition if the first condition is `false`.
````
if (condition1) {
  // block of code to be executed if condition1 is true
} else if (condition2) {
  // block of code to be executed if the condition1 is false and condition2 is true
} else {
  // block of code to be executed if the condition1 is false and condition2 is false
}
````
Example:
````
int time = 22;
if (time < 10) {
  System.out.println("Good morning.");
} else if (time < 18) {
  System.out.println("Good day.");
} else {
  System.out.println("Good evening.");
}
// Outputs "Good evening."
````
In the example above, time (22) is greater than 10, so the first condition is false. The next condition, in the else if statement, is also false, so we move on to the else condition since condition1 and condition2 is both false - and print to the screen "Good evening".

However, if the time was 14, our program would print "Good day."

<a name="shorthand"></a>
### Shorthand (Ternary Operator)
There is also a short-hand if else, which is known as the ternary operator because it consists of three operands.

It can be used to replace multiple lines of code with a single line, and is most often used to replace simple if else statements:
````
variable = (condition) ? expressionTrue :  expressionFalse;
````
Example
````
int time = 20;
if (time < 18) {
  System.out.println("Good day.");
} else {
  System.out.println("Good evening.");
}
````
Become:
````
int time = 20;
String result = (time < 18) ? "Good day." : "Good evening.";
System.out.println(result);
````

<a name="while"></a>
- ## Java While Loop
Loops can execute a block of code as long as a specified condition is reached.

Loops are handy because they save time, reduce errors, and they make code more readable.

The `while` loop loops through a block of code as long as a specified condition is `true`:
````
while (condition) {
  // code block to be executed
}
````
In the example below, the code in the loop will run, over and over again, as long as a variable (i) is less than 5:
````
int i = 0;
while (i < 5) {
  System.out.println(i);
  i++;
}
````
?????? Note: Do not forget to increase the variable used in the condition, otherwise the loop will never end!

### The Do/While Loop
The `do/while` loop is a variant of the while loop. This loop will execute the code block once, before checking if the condition is true, then it will repeat the loop as long as the condition is true.
````
do {
  // code block to be executed
}
while (condition);
````
The example below uses a do/while loop. The loop will always be executed at least once, even if the condition is false, because the code block is executed before the condition is tested:
````
int i = 0;
do {
  System.out.println(i);
  i++;
}
while (i < 5);
````

<a name="oop"></a>
- ## Java OOP
OOP stands for `Object-Oriented Programming`.

Procedural programming is about writing procedures or methods that perform operations on the data, while object-oriented programming is about creating objects that contain both data and methods.

Object-oriented programming has several advantages over procedural programming:
- OOP is faster and easier to execute
- OOP provides a clear structure for the programs
- OOP helps to keep the Java code DRY `"Don't Repeat Yourself"`, and makes the code easier to maintain, modify and debug
- OOP makes it possible to create full reusable applications with less code and shorter development time

``
Tip: The "Don't Repeat Yourself" (DRY) principle is about reducing the repetition of code. You should extract out the codes that are common for the application, and place them at a single place and reuse them instead of repeating it.
``

Classes and objects are the two main aspects of object-oriented programming.

A class is a template for objects, and an object is an instance of a class.

When the individual objects are created, they inherit all the variables and methods from the class.

<a name="classes"></a>
- ## Java Classes/Objects
Java is an object-oriented programming language.

Everything in Java is associated with classes and objects, along with its attributes and methods. For example: in real life, a car is an object. The car has attributes, such as weight and color, and methods, such as drive and brake.

A Class is like an object constructor, or a "blueprint" for creating objects.

<a name="createclass"></a>
### Create a class:
To create a class, use the keyword `class`:
````
public class Main {
  int x = 5;
}
````
?????? Note: Remember from the Java Syntax chapter that a class should always start with an uppercase first letter, and that the name of the java file should match the class name.

<a name="createobject"></a>
### Create an object:

In Java, an object is created from a class. We have already created the class named `Main`, so now we can use this to create objects.

To create an object of `Main`, specify the class name, followed by the object name, and use the keyword `new`:
````
public class Main {
  int x = 5;

  public static void main(String[] args) {
    Main myObj = new Main();
    System.out.println(myObj.x);
  }
}
````

<a name="multipleobject"></a>
### Multiple Objects
You can create multiple objects of one class:
````
public class Main {
  int x = 5;

  public static void main(String[] args) {
    Main myObj1 = new Main();  // Object 1
    Main myObj2 = new Main();  // Object 2
    System.out.println(myObj1.x);
    System.out.println(myObj2.x);
  }
}
````

<a name="multipleclasses"></a>
### Multiple Objects

You can also create an object of a class and access it in another class. This is often used for better organization of classes (one class has all the attributes and methods, while the other class holds the `main()` method (code to be executed)).

Remember that the name of the java file should match the class name. In this example, we have created two files in the same directory/folder:
- Main.java
- Second.java

### `Main.java`
````
public class Main {
  int x = 5;
}
````
### `Second.java`
````
class Second {
  public static void main(String[] args) {
    Main myObj = new Main();
    System.out.println(myObj.x);
  }
}
````
The output will be:
````
5
````
