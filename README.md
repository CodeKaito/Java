# My learning progress about Java

## Java Basics

1. [ Introduction. ](#introduction)
2. [ Java Quickstart. ](#start)
3. [ Java Syntax. ](#syntax)
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
8. [ Java For Loops](#for)
    - [ For each loops ](#foreach)
9. [ Java Arrays ](#arrays)
---------------------------
## Java Method (functions)

[ Java Method ](#methods)
  - [ Java Parameters and Arguments](#parameters)
  - [ Java Method Overloading ](#overloading)
  - [ Java Scope ](#scope)
  - [ Java Recursion ](#recursion)
---------------------------
## Java Classes


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

⚠️ Note: remember that every Java program has a class name which must match the filename, and that every program must contain the main() method.

<a name="print"></a>
### System.out.println()
Inside the main() method, we can use the println() method to print a line of text to the screen:
````
public static void main(String[] args) {
  System.out.println("Hello World");
}
````
⚠️ Note: The curly braces `{}` marks the beginning and the end of a block of code.

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

⚠️ Note: You can add as many println() methods as you want. Note that it will add a new line for each method.

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
⚠️Note: that if you assign a new value to an existing variable, it will overwrite the previous value:

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

⚠️ Note: The general rules for naming variables are:

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

⚠️ Note that if is in lowercase letters. Uppercase letters (If or IF) will generate an error.

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
