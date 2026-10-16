
10 basic codes for Java to practice

1. Hello World
The classic starting point for any programming language.

Java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
2. Add Two Numbers
Demonstrates taking user input and performing basic arithmetic.

Java
import java.util.Scanner;

public class AddTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        
        int sum = num1 + num2;
        System.out.println("Sum: " + sum);
        scanner.close();
    }
}
3. Check Even or Odd
Uses conditional if-else statements and the modulus operator (%).

Java
import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();
        
        if (num % 2 == 0) {
            System.out.println(num + " is Even.");
        } else {
            System.out.println(num + " is Odd.");
        }
        scanner.close();
    }
}
4. Find the Largest of Three Numbers
Practices nested conditions and logical operators (&&).

Java
public class LargestOfThree {
    public static void main(String[] args) {
        int a = 10, b = 25, c = 15;
        
        if (a >= b && a >= c) {
            System.out.println(a + " is the largest.");
        } else if (b >= a && b >= c) {
            System.out.println(b + " is the largest.");
        } else {
            System.out.println(c + " is the largest.");
        }
    }
}
5. Check Leap Year
Practices complex boolean expressions.

Java
public class LeapYearCheck {
    public static void main(String[] args) {
        int year = 2024;
        boolean isLeap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        
        if (isLeap) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
}
6. Factorial of a Number
Introduces the for loop to compute sequential products.

Java
public class Factorial {
    public static void main(String[] args) {
        int num = 5;
        long factorial = 1;
        
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        
        System.out.println("Factorial of " + num + " is " + factorial);
    }
}
7. Fibonacci Series (First N terms)
Practices variable updating inside loops.

Java
public class Fibonacci {
    public static void main(String[] args) {
        int n = 10, t1 = 0, t2 = 1;
        System.out.print("First " + n + " terms: ");
        
        for (int i = 1; i <= n; ++i) {
            System.out.print(t1 + " ");
            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }
    }
}
8. Check Prime Number
Combines loops and conditions to test for divisors.

Java
public class PrimeCheck {
    public static void main(String[] args) {
        int num = 29;
        boolean isPrime = true;
        
        if (num <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        
        if (isPrime) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }
}
9. Reverse a Number
Uses a while loop and arithmetic extraction (/ and %).

Java
public class ReverseNumber {
    public static void main(String[] args) {
        int num = 12345, reversed = 0;
        
        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        
        System.out.println("Reversed Number: " + reversed);
    }
}
10. Simple Calculator Using Switch Statement
Practices control flow with switch-case blocks.

Java
public class SimpleCalculator {
    public static void main(String[] args) {
        char operator = '+';
        double n1 = 10.5, n2 = 5.5, result;
        
        switch (operator) {
            case '+':
                result = n1 + n2;
                break;
            case '-':
                result = n1 - n2;
                break;
            case '*':
                result = n1 * n2;
                break;
            case '/':
                result = n1 / n2;
                break;
            default:
                System.out.println("Invalid operator!");
                return;
        }
        System.out.println("Result: " + result);
    }
}
10 code of oop

1. Class and Object
The fundamental building block of OOP. A class is a blueprint, and an object is an instance of that class.

Java
public class CarDemo {
    // Class definition
    static class Car {
        String color;
        String model;
        
        void drive() {
            System.out.println("The " + color + " " + model + " is driving.");
        }
    }

    public static void main(String[] args) {
        // Creating an object
        Car myCar = new Car();
        myCar.color = "Red";
        myCar.model = "Sedan";
        myCar.drive();
    }
}
2. Constructors
Special methods used to initialize objects. This example shows default and parameterized constructors.

Java
public class StudentDemo {
    static class Student {
        String name;
        int age;

        // Parameterized constructor
        Student(String n, int a) {
            name = n;
            age = a;
        }

        void display() {
            System.out.println("Name: " + name + ", Age: " + age);
        }
    }

    public static void main(String[] args) {
        Student s1 = new Student("Alice", 20);
        s1.display();
    }
}
3. Encapsulation
Hiding internal data and providing controlled access via getters and setters.

Java
public class EncapsulationDemo {
    static class Person {
        private String name; // Private data

        // Getter
        public String getName() {
            return name;
        }

        // Setter
        public void setName(String newName) {
            this.name = newName;
        }
    }

    public static void main(String[] args) {
        Person p = new Person();
        p.setName("Bob");
        System.out.println("Name: " + p.getName());
    }
}
4. Inheritance
A mechanism where a child class acquires the properties and behaviors of a parent class using the extends keyword.

Java
public class InheritanceDemo {
    static class Animal {
        void eat() {
            System.out.println("This animal eats food.");
        }
    }

    static class Dog extends Animal {
        void bark() {
            System.out.println("The dog barks.");
        }
    }

    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.eat(); // Inherited method
        myDog.bark(); // Own method
    }
}
5. Polymorphism (Method Overloading)
Having multiple methods with the same name but different parameters within the same class.

Java
public class OverloadingDemo {
    static class MathUtils {
        int add(int a, int b) {
            return a + b;
        }

        double add(double a, double b) {
            return a + b;
        }
    }

    public static void main(String[] args) {
        MathUtils math = new MathUtils();
        System.out.println("Sum of ints: " + math.add(5, 10));
        System.out.println("Sum of doubles: " + math.add(5.5, 10.2));
    }
}
6. Polymorphism (Method Overriding)
A subclass provides a specific implementation of a method that is already defined in its parent class.

Java
public class OverridingDemo {
    static class Animal {
        void sound() {
            System.out.println("Animal makes a sound.");
        }
    }

    static class Cat extends Animal {
        @Override
        void sound() {
            System.out.println("Cat meows.");
        }
    }

    public static void main(String[] args) {
        Animal myCat = new Cat();
        myCat.sound(); // Calls Cat's version due to runtime polymorphism
    }
}
7. Abstraction
Hiding implementation details and showing only functionality using abstract classes and methods.

Java
public class AbstractionDemo {
    abstract static class Shape {
        abstract void draw(); // Abstract method
    }

    static class Rectangle extends Shape {
        void draw() {
            System.out.println("Drawing a rectangle.");
        }
    }

    public static void main(String[] args) {
        Shape s = new Rectangle();
        s.draw();
    }
}
8. Interfaces
A contract that classes can implement to enforce a specific set of methods, enabling multiple-inheritance-like behavior.

Java
public class InterfaceDemo {
    interface Flyable {
        void fly();
    }

    static class Bird implements Flyable {
        public void fly() {
            System.out.println("Bird is flying high.");
        }
    }

    public static void main(String[] args) {
        Flyable b = new Bird();
        b.fly();
    }
}
9. Composition ("Has-A" Relationship)
Building complex classes by combining objects of other classes as member variables.

Java
public class CompositionDemo {
    static class Engine {
        void start() {
            System.out.println("Engine started.");
        }
    }

    static class Car {
        private Engine engine = new Engine(); // Composition

        void startCar() {
            engine.start();
            System.out.println("Car is ready to move.");
        }
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.startCar();
    }
}
10. The Static Keyword
Demonstrates class-level variables and methods that belong to the class rather than individual instances.

Java
public class StaticDemo {
    static class Counter {
        static int count = 0; // Shared across all instances

        Counter() {
            count++;
        }

        static void showCount() {
            System.out.println("Total objects created: " + count);
        }
    }

    public static void main(String[] args) {
        new Counter();
        new Counter();
        Counter.showCount(); // Called directly using the class name
    }
}
10 for loops

Here are 10 different examples showcasing the versatility of for loops in Java, ranging from basic counting to pattern printing and array iteration.

1. Simple Counter (1 to 10)
The classic for loop structure to count from a starting value to an ending value.

Java
public class SimpleCounter {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
    }
}
2. Countdown (10 to 1)
Shows how to decrement the loop control variable.

Java
public class Countdown {
    public static void main(String[] args) {
        for (int i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println("Liftoff!");
    }
}
3. Printing Even Numbers
Demonstrates changing the increment step (adding 2 each time instead of 1).

Java
public class EvenNumbers {
    public static void main(String[] args) {
        System.out.print("Even numbers up to 20: ");
        for (int i = 2; i <= 20; i += 2) {
            System.out.print(i + " ");
        }
    }
}
4. Sum of First N Numbers
Accumulating a total value inside a loop.

Java
public class SumOfNumbers {
    public static void main(String[] args) {
        int n = 10;
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 1 to " + n + " is: " + sum);
    }
}
5. Multiplication Table
Generates the multiplication table for a specific number.

Java
public class MultiplicationTable {
    public static void main(String[] args) {
        int number = 5;
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }
}
6. Iterating Through an Array
Using a for loop with an array's length property to traverse elements.

Java
public class ArrayIteration {
    public static void main(String[] args) {
        String[] fruits = {"Apple", "Banana", "Cherry", "Date"};
        for (int i = 0; i < fruits.length; i++) {
            System.out.println("Fruit at index " + i + ": " + fruits[i]);
        }
    }
}
7. Enhanced For-Loop (For-Each)
A specialized cleaner syntax for iterating through collections and arrays without using indices.

Java
public class EnhancedForLoop {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        for (int num : numbers) {
            System.out.println("Number: " + num);
        }
    }
}
8. Nested For-Loops (Star Pattern)
A loop inside another loop, often used for grids, matrices, and patterns.

Java
public class StarPattern {
    public static void main(String[] args) {
        int rows = 4;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println(); // New line after each row
        }
    }
}
9. Loop with Multiple Variables
Demonstrates initializing and updating more than one variable in a single for loop header.

Java
public class MultipleVariables {
    public static void main(String[] args) {
        for (int i = 1, j = 10; i <= j; i++, j--) {
            System.out.println("i = " + i + ", j = " + j);
        }
    }
}
10. Infinite Loop with Break
Shows how a for loop can run indefinitely (omitting conditions) and exit early using a break statement.

Java
public class InfiniteLoopWithBreak {
    public static void main(String[] args) {
        int count = 1;
        for (;;) { // Infinite loop
            System.out.println("Running... count: " + count);
            if (count == 3) {
                System.out.println("Breaking out of the loop.");
                break;
            }
            count++;
        }
    }
}
Advance java 20 codes

1. ArrayList with Generics
Java
import java.util.ArrayList;
import java.util.List;

public class AdvancedArrayList {
    public static void main(String[] args) {
        List<String> tech = new ArrayList<>();
        tech.add("Java");
        tech.add("Spring Boot");
        tech.forEach(t -> System.out.println(t));
    }
}
2. HashMap Operations
Java
import java.util.HashMap;
import java.util.Map;

public class AdvancedMap {
    public static void main(String[] args) {
        Map<String, Integer> scores = new HashMap<>();
        scores.put("Alice", 95);
        scores.putIfAbsent("Alice", 90); // Won't overwrite
        scores.forEach((k, v) -> System.out.println(k + ": " + v));
    }
}
3. HashSet for Unique Elements
Java
import java.util.HashSet;
import java.util.Set;

public class AdvancedSet {
    public static void main(String[] args) {
        Set<Integer> numbers = new HashSet<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(10); // Duplicate, ignored
        System.out.println("Unique elements: " + numbers);
    }
}
4. Lambda Expressions
Java
import java.util.List;

public class LambdaDemo {
    public static void main(String[] args) {
        List<String> names = List.of("Java", "Python", "C++");
        // Using a lambda expression inside forEach
        names.forEach(name -> System.out.println("Language: " + name));
    }
}
5. Streams API (Filter & Map)
Java
import java.util.List;

public class StreamApiDemo {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6);
        list.stream()
            .filter(n -> n % 2 == 0) // Keep even numbers
            .map(n -> n * n)        // Square them
            .forEach(System.out::println);
    }
}
6. Optional Class (Null Safety)
Java
import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {
        String[] words = new String[10];
        Optional<String> checkNull = Optional.ofNullable(words[5]);
        
        if (checkNull.isPresent()) {
            System.out.println(checkNull.get());
        } else {
            System.out.println("Value is not available (null-safe).");
        }
    }
}
7. Sorting with Comparator
Java
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorDemo {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(List.of("Zack", "Alice", "Bob"));
        names.sort((a, b) -> b.compareTo(a)); // Descending order
        System.out.println(names);
    }
}
Part 2: Multithreading & Concurrency (8–11)
8. Extending the Thread Class
Java
public class MyThread extends Thread {
    public void run() {
        System.out.println("Thread running using Thread class.");
    }
    public static void main(String[] args) {
        new MyThread().start();
    }
}
9. Implementing the Runnable Interface
Java
public class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Thread running using Runnable interface.");
    }
    public static void main(String[] args) {
        new Thread(new MyRunnable()).start();
    }
}
10. Thread Synchronization
Java
class Counter {
    private int count = 0;
    public synchronized void increment() { count++; }
    public int getCount() { return count; }
}

public class SyncDemo {
    public static void main(String[] args) throws InterruptedException {
        Counter c = new Counter();
        Thread t1 = new Thread(() -> { for(int i=0; i<1000; i++) c.increment(); });
        t1.start(); t1.join();
        System.out.println("Count: " + c.getCount());
    }
}
11. ExecutorService (Thread Pools)
Java
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorDemo {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(2);
        executor.submit(() -> System.out.println("Task 1 executed"));
        executor.submit(() -> System.out.println("Task 2 executed"));
        executor.shutdown();
    }
}
Part 3: Exception Handling & File I/O (12–14)
12. Custom Exception
Java
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) { super(message); }
}

public class CustomExceptionDemo {
    static void validate(int age) throws InvalidAgeException {
        if (age < 18) throw new InvalidAgeException("Not eligible");
    }
    public static void main(String[] args) {
        try { validate(15); } 
        catch (InvalidAgeException e) { System.out.println(e.getMessage()); }
    }
}
13. Try-With-Resources
Java
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResourcesDemo {
    public static void main(String[] args) {
        // Automatically closes the resource
        try (BufferedReader br = new BufferedReader(new FileReader("test.txt"))) {
            // System.out.println(br.readLine());
            System.out.println("Resource managed automatically.");
        } catch (IOException e) {
            System.out.println("File not found or error reading.");
        }
    }
}
14. Modern NIO File Reading
Java
import java.nio.file.Files;
import java.nio.file.Path;

public class NioDemo {
    public static void main(String[] args) {
        try {
            // Quick write and read using NIO
            Path path = Path.of("sample.txt");
            Files.writeString(path, "Hello Advanced Java NIO!");
            String content = Files.readString(path);
            System.out.println(content);
        } catch (Exception e) {
            System.out.println("IO Error: " + e.getMessage());
        }
    }
}
Part 4: Generics, Reflection, Annotations & JDBC (15–20)
15. Generic Class
Java
class Box<T> {
    private T item;
    public void set(T item) { this.item = item; }
    public T get() { return item; }
}

public class GenericDemo {
    public static void main(String[] args) {
        Box<String> box = new Box<>();
        box.set("Advanced Generics");
        System.out.println(box.get());
    }
}
16. Custom Annotation
Java
import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Important {}

public class AnnotationDemo {
    @Important
    public void testMethod() {}
    
    public static void main(String[] args) throws Exception {
        var method = AnnotationDemo.class.getMethod("testMethod");
        System.out.println("Has @Important: " + method.isAnnotationPresent(Important.class));
    }
}
17. Reflection API Basics
Java
public class ReflectionDemo {
    private String secret = "Hidden";
    public static void main(String[] args) throws Exception {
        Class<?> cls = Class.forName("ReflectionDemo");
        System.out.println("Class Name: " + cls.getName());
    }
}
18. JDBC Connection Template
Java
import java.sql.Connection;
import java.sql.DriverManager;

public class JdbcTemplate {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/mydb";
        try (Connection conn = DriverManager.getConnection(url, "user", "password")) {
            System.out.println("Connected to database successfully!");
        } catch (Exception e) {
            System.out.println("Connection failed (or driver missing): " + e.getMessage());
        }
    }
}
19. CompletableFuture (Asynchronous Programming)
Java
import java.util.concurrent.CompletableFuture;

public class AsyncDemo {
    public static void main(String[] args) {
        CompletableFuture.supplyAsync(() -> "Result from async task")
            .thenAccept(result -> System.out.println("Processed: " + result));
        
        // Sleep briefly to let async task finish printing
        try { Thread.sleep(500); } catch (Exception ignored) {}
    }
}
20. Simple Socket Client Setup (Networking)
Java
import java.net.Socket;

public class SocketClientDemo {
    public static void main(String[] args) {
        try {
            // Attempts connection to local server (if running)
            // Socket socket = new Socket("localhost", 8080);
            System.out.println("Socket client structure initialized.");
        } catch (Exception e) {
            System.out.println("Connection refused.");
        }
    }
}
20 ideas for Java programming used in real life with explanations and step-by-step code

1. ATM / Banking System (Account Withdrawal & Deposit)
Real-Life Context: Core banking software that handles user account operations securely.

Explanation: Manages balances, handles deposit/withdrawal validations, and prevents negative balances.

Java
public class AtmSystem {
    static class BankAccount {
        private double balance = 1000.0;
        public void withdraw(double amount) {
            if (amount > balance) {
                System.out.println("Insufficient funds!");
            } else {
                balance -= amount;
                System.out.println("Withdrawn: $" + amount + ", New Balance: $" + balance);
            }
        }
    }
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.withdraw(250.0);
    }
}
2. E-Commerce Shopping Cart
Real-Life Context: Online retail platforms like Amazon or Shopify tracking cart totals.

Explanation: Sums up item prices dynamically using loops or streams.

Java
import java.util.List;

public class ShoppingCart {
    public static void main(String[] args) {
        List<Double> cartPrices = List.of(29.99, 15.50, 120.00);
        double total = 0;
        for (double price : cartPrices) {
            total += price;
        }
        System.out.println("Total Cart Value: $" + total);
    }
}
3. Hotel Room Reservation System
Real-Life Context: Hospitality software used by hotels to check room availability.

Explanation: Tracks status flags (isBooked) to manage occupancy.

Java
public class HotelBooking {
    static class Room {
        int roomNumber;
        boolean isBooked;
        Room(int roomNumber) { this.roomNumber = roomNumber; this.isBooked = false; }
    }
    public static void main(String[] args) {
        Room room101 = new Room(101);
        if (!room101.isBooked) {
            room101.isBooked = true;
            System.out.println("Room " + room101.roomNumber + " successfully booked.");
        }
    }
}
4. Smart Home IoT Device Controller
Real-Life Context: Home automation applications controlling smart thermostats or lighting.

Explanation: Uses object state changes to trigger physical actions.

Java
public class SmartLightDemo {
    static class SmartLight {
        boolean isOn = false;
        void toggle() {
            isOn = !isOn;
            System.out.println("Smart Light is now " + (isOn ? "ON" : "OFF"));
        }
    }
    public static void main(String[] args) {
        SmartLight light = new SmartLight();
        light.toggle(); // Turns ON
        light.toggle(); // Turns OFF
    }
}
5. Student Grading System
Real-Life Context: University portals calculating GPA and passing statuses.

Explanation: Evaluates numeric scores against threshold conditions to assign letter grades.

Java
public class GradingSystem {
    public static void main(String[] args) {
        int score = 85;
        char grade;
        if (score >= 90) grade = 'A';
        else if (score >= 80) grade = 'B';
        else if (score >= 70) grade = 'C';
        else grade = 'F';
        
        System.out.println("Score: " + score + " | Grade: " + grade);
    }
}
6. Ride-Sharing Fare Calculator (Uber/Lyft style)
Real-Life Context: Calculating dynamic ride prices based on distance and base fees.

Explanation: Multiplies distance by per-mile rates and adds base booking charges.

Java
public class RideFareCalculator {
    public static void main(String[] args) {
        double baseFare = 5.0;
        double ratePerKm = 2.5;
        double distanceKm = 12.0;
        
        double totalFare = baseFare + (distanceKm * ratePerKm);
        System.out.println("Calculated Ride Fare: $" + totalFare);
    }
}
7. Flight Ticket Seat Selector
Real-Life Context: Airline booking software mapping seating arrangements.

Explanation: Uses a 2D array matrix to represent cabin seating charts.

Java
public class SeatSelector {
    public static void main(String[] args) {
        String[][] seats = {
            {"1A", "1B", "1C"},
            {"2A", "2B", "2C"}
        };
        // Book seat at row 0, col 1 (1B)
        seats[0][1] = "BOOKED";
        System.out.println("Seat 1B status: " + seats[0][1]);
    }
}
8. Employee Payroll System
Real-Life Context: Enterprise HR platforms computing monthly net pay after deductions.

Explanation: Subtracts taxes and insurance from gross salary.

Java
public class PayrollSystem {
    public static void main(String[] args) {
        double grossSalary = 5000.0;
        double taxRate = 0.20; // 20% tax
        double insurance = 150.0;
        
        double netPay = grossSalary - (grossSalary * taxRate) - insurance;
        System.out.println("Employee Net Pay: $" + netPay);
    }
}
9. Library Book Management Tracker
Real-Life Context: Public or university libraries checking out books and setting due dates.

Explanation: Manages book titles and inventory counts.

Java
import java.util.HashMap;
import java.util.Map;

public class LibraryInventory {
    public static void main(String[] args) {
        Map<String, Integer> bookStock = new HashMap<>();
        bookStock.put("Java Programming", 3);
        bookStock.put("Clean Code", 1);
        
        System.out.println("Copies available for 'Clean Code': " + bookStock.get("Clean Code"));
    }
}
10. Hospital Patient Triage Queue
Real-Life Context: Emergency room software prioritizing patients by severity level.

Explanation: Uses queues or sorted structures to handle urgent patients first.

Java
import java.util.PriorityQueue;

public class HospitalTriage {
    public static void main(String[] args) {
        PriorityQueue<String> emergencyQueue = new PriorityQueue<>();
        emergencyQueue.add("Patient B: Minor Cut");
        emergencyQueue.add("Patient A: Chest Pain"); // Processed first alphabetically in this basic example
        
        System.out.println("Attending to: " + emergencyQueue.poll());
    }
}
11. Weather Station Threshold Alert
Real-Life Context: Meteorological software sending warnings during extreme temperatures.

Explanation: Compares live sensor readings against safety limits.

Java
public class WeatherAlert {
    public static void main(String[] args) {
        double currentTempCelsius = 42.5;
        if (currentTempCelsius > 40.0) {
            System.out.println("HEATWAVE ALERT! Current temperature is " + currentTempCelsius + "C");
        }
    }
}
12. Cinema Movie Ticket Booking
Real-Life Context: Multiplex theater apps tracking ticket availability per showtime.

Explanation: Decrements available seat pools upon successful purchase.

Java
public class MovieBooking {
    public static void main(String[] args) {
        int availableSeats = 50;
        int requestedTickets = 4;
        
        if (availableSeats >= requestedTickets) {
            availableSeats -= requestedTickets;
            System.out.println("Booking confirmed! Remaining seats: " + availableSeats);
        } else {
            System.out.println("Not enough seats available.");
        }
    }
}
13. Parking Lot Vehicle Tracker
Real-Life Context: Automated parking garage systems tracking slots.

Explanation: Tracks incoming vehicles and counts free spaces.

Java
public class ParkingLot {
    public static void main(String[] args) {
        int totalSlots = 100;
        int parkedCars = 87;
        int freeSlots = totalSlots - parkedCars;
        
        System.out.println("Available parking slots: " + freeSlots);
    }
}
14. Food Delivery Order Status Tracker
Real-Life Context: Apps like DoorDash or Zomato updating users on order progression.

Explanation: Uses conditional states to trace food preparation stages.

Java
public class OrderTracker {
    public static void main(String[] args) {
        String[] statuses = {"Order Placed", "Preparing", "Out for Delivery", "Delivered"};
        String currentStatus = statuses[1]; // Preparing
        
        System.out.println("Current Order Status: " + currentStatus);
    }
}
15. Fitness Tracker / Step Counter
Real-Life Context: Smartwatches tracking daily steps against a goal.

Explanation: Compares accumulated daily counts with target milestones.

Java
public class FitnessTracker {
    public static void main(String[] args) {
        int goal = 10000;
        int stepsWalked = 7500;
        
        if (stepsWalked >= goal) {
            System.out.println("Goal achieved! Great job.");
        } else {
            System.out.println("You need " + (goal - stepsWalked) + " more steps to reach your goal.");
        }
    }
}
16. Bank Loan Eligibility Evaluator
Real-Life Context: Financial software checking criteria before approving loan applications.

Explanation: Evaluates multiple conditions (salary, credit score, age).

Java
public class LoanEvaluator {
    public static void main(String[] args) {
        double monthlySalary = 4500.0;
        int creditScore = 720;
        
        if (monthlySalary >= 3000.0 && creditScore >= 700) {
            System.out.println("Loan Approved!");
        } else {
            System.out.println("Loan Denied based on financial criteria.");
        }
    }
}
17. Warehouse Inventory Low-Stock Alert
Real-Life Context: Supply chain software triggering reorders when inventory drops.

Explanation: Monitors stock levels and flags items needing replenishment.

Java
public class InventoryAlert {
    public static void main(String[] args) {
        String itemName = "Wireless Mouse";
        int stockLevel = 4;
        int threshold = 10;
        
        if (stockLevel <= threshold) {
            System.out.println("REORDER ALERT: " + itemName + " stock is low (" + stockLevel + " left).");
        }
    }
}
18. User Password Strength Validator
Real-Life Context: Security systems ensuring user accounts use robust passwords during registration.

Explanation: Checks password length and character requirements.

Java
public class PasswordValidator {
    public static void main(String[] args) {
        String password = "SecurePassword123";
        boolean isValid = password.length() >= 8 && password.matches(".*\\d.*");
        
        System.out.println("Is password valid? " + isValid);
    }
}
19. Currency Converter
Real-Life Context: Travel apps converting local currencies to foreign equivalents.

Explanation: Multiplies an amount by a fixed exchange rate.

Java
public class CurrencyConverter {
    public static void main(String[] args) {
        double usdAmount = 150.0;
        double exchangeRateEUR = 0.92; // 1 USD = 0.92 EUR
        
        double converted = usdAmount * exchangeRateEUR;
        System.out.println("$" + usdAmount + " USD is equal to €" + converted + " EUR");
    }
}
20. Online Quiz / Exam Portal
Real-Life Context: E-learning platforms automatically grading multiple-choice exams.

Explanation: Compares user answers against an answer key array.

Java
public class QuizPortal {
    public static void main(String[] args) {
        char[] answerKey = {'A', 'C', 'B', 'D'};
        char[] studentAnswers = {'A', 'B', 'B', 'D'};
        int score = 0;
        
        for (int i = 0; i < answerKey.length; i++) {
            if (answerKey[i] == studentAnswers[i]) {
                score++;
            }
        }
        System.out.println("Quiz Score: " + score + "/" + answerKey.length);
    }
}
5 for user input

1. Basic Text and Number Input (Scanner)
The standard way to capture strings and integers from the user via the console.

Java
import java.util.Scanner;

public class BasicInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        
        System.out.println("Hello, " + name + "! You are " + age + " years old.");
        scanner.close();
    }
}
2. Interactive Calculator Input
Taking decimal numbers from the user to perform arithmetic operations.

Java
import java.util.Scanner;

public class CalculatorInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        
        double sum = num1 + num2;
        System.out.println("The sum is: " + sum);
        
        scanner.close();
    }
}
3. Sentence Word Counter (String Parsing)
Taking a full sentence as input and analyzing its contents.

Java
import java.util.Scanner;

public class WordCounterInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        
        // Split by spaces to count words
        String[] words = sentence.trim().split("\\s+");
        System.out.println("Your sentence has " + words.length + " words.");
        
        scanner.close();
    }
}
4. Command-Line Arguments Input (args)
Taking input directly when running the program from the terminal (e.g., java AppName John 30).

Java
public class CommandLineInput {
    public static void main(String[] args) {
        if (args.length > 0) {
            System.out.println("Welcome, " + args[0] + "!");
            if (args.length > 1) {
                System.out.println("Additional argument received: " + args[1]);
            }
        } else {
            System.out.println("No command-line arguments provided. Run as: java CommandLineInput Name");
        }
    }
}
5. Secure Password Input (Console)
Using Java's Console class to read sensitive input without echoing characters on the screen (best run in a standard terminal/command prompt).

Java
import java.io.Console;

public class SecureInput {
    public static void main(String[] args) {
        Console console = System.console();
        
        if (console == null) {
            System.out.println("Console not available. Please run this in a real terminal.");
            return;
        }
        
        char[] password = console.readPassword("Enter your secret password: ");
        System.out.println("Password successfully captured! (Length: " + password.length + " characters)");
    }
}
convert all above to pdf and GitHub

Comprehensive Java Programming Guide

GitHub Repository Setup Guide
If you want to push all these files into a GitHub repository, follow these quick terminal steps:

Initialize Git inside your local project folder:

Bash
   git init
   
Stage all Java files and the generated documentation:

Bash
   git add .
   
Commit your changes with a descriptive message:

Bash
   git commit -m "Initial commit: Add Java fundamentals, OOP, loops, advanced code, and real-world examples"
   
Link your local repository to your remote GitHub repository:

Bash
   git branch -M main
   git remote add origin https://github.com/YOUR_USERNAME/YOUR_REPOSITORY_NAME.git
   
Push your code live to GitHub:

Bash
   git push -u origin main



