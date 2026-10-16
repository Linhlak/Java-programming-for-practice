Here are 10 distinct, practical code examples for each of the 4 core pillars of Object-Oriented Programming (Encapsulation, Inheritance, Polymorphism, and Abstraction) in Java, designed to show different angles, patterns, and use-cases for every concept.

1. Encapsulation (Data Hiding & Security)
1. Basic Getter and Setter
Java
public class Encapsulation01 {
    static class Person {
        private String name; // Hidden data

        public String getName() { return name; }
        public void setName(String name) { this.name = name; }
    }
    public static void main(String[] args) {
        Person p = new Person();
        p.setName("Alice");
        System.out.println("Name: " + p.getName());
    }
}
2. Read-Only Property (No Setter)
Java
public class Encapsulation02 {
    static class BankAccount {
        private String accountNumber = "ACC12345"; // Read-only

        public String getAccountNumber() { return accountNumber; }
    }
    public static void main(String[] args) {
        BankAccount acc = new BankAccount();
        System.out.println("Account: " + acc.getAccountNumber());
    }
}
3. Write-Only Property (No Getter)
Java
public class Encapsulation03 {
    static class User {
        private String password;

        public void setPassword(String password) {
            this.password = password;
            System.out.println("Password securely updated.");
        }
    }
    public static void main(String[] args) {
        User user = new User();
        user.setPassword("Secret@123");
    }
}
4. Validation Inside Setter
Java
public class Encapsulation04 {
    static class Student {
        private int age;

        public void setAge(int age) {
            if (age > 0 && age <= 120) {
                this.age = age;
            } else {
                System.out.println("Invalid age supplied!");
            }
        }
        public int getAge() { return age; }
    }
    public static void main(String[] args) {
        Student s = new Student();
        s.setAge(150); // Rejected
        s.setAge(20);  // Accepted
        System.out.println("Age: " + s.getAge());
    }
}
5. Bank Account Balance Protection
Java
public class Encapsulation05 {
    static class Account {
        private double balance = 500.0;

        public void deposit(double amount) {
            if (amount > 0) balance += amount;
        }
        public double getBalance() { return balance; }
    }
    public static void main(String[] args) {
        Account acc = new Account();
        acc.deposit(250.0);
        System.out.println("Balance: $" + acc.getBalance());
    }
}
6. Temperature Range Control
Java
public class Encapsulation06 {
    static class Thermostat {
        private int temperature = 22;

        public void setTemperature(int temp) {
            if (temp >= 16 && temp <= 30) this.temperature = temp;
        }
        public int getTemperature() { return temperature; }
    }
    public static void main(String[] args) {
        Thermostat t = new Thermostat();
        t.setTemperature(25);
        System.out.println("Temp: " + t.getTemperature() + "°C");
    }
}
7. Student GPA Bounded Property
Java
public class Encapsulation07 {
    static class GradeBook {
        private double gpa;

        public void setGpa(double gpa) {
            if (gpa >= 0.0 && gpa <= 4.0) this.gpa = gpa;
        }
        public double getGpa() { return gpa; }
    }
    public static void main(String[] args) {
        GradeBook gb = new GradeBook();
        gb.setGpa(3.8);
        System.out.println("GPA: " + gb.getGpa());
    }
}
8. Inventory Stock Protection (Non-Negative)
Java
public class Encapsulation08 {
    static class InventoryItem {
        private int stock = 10;

        public void reduceStock(int qty) {
            if (qty <= stock) stock -= qty;
        }
        public int getStock() { return stock; }
    }
    public static void main(String[] args) {
        InventoryItem item = new InventoryItem();
        item.reduceStock(3);
        System.out.println("Remaining stock: " + item.getStock());
    }
}
9. Encapsulating Lists (Unmodifiable View)
Java
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Encapsulation09 {
    static class Course {
        private List<String> students = new ArrayList<>();

        public void addStudent(String s) { students.add(s); }
        public List<String> getStudents() {
            return Collections.unmodifiableList(students); // Protects internal list
        }
    }
    public static void main(String[] args) {
        Course c = new Course();
        c.addStudent("Bob");
        System.out.println("Students: " + c.getStudents());
    }
}
10. Immutable Object Pattern
Java
public class Encapsulation10 {
    static final class ImmutablePoint {
        private final int x, y;
        public ImmutablePoint(int x, int y) { this.x = x; this.y = y; }
        public int getX() { return x; }
        public int getY() { return y; }
    }
    public static void main(String[] args) {
        ImmutablePoint pt = new ImmutablePoint(5, 10);
        System.out.println("Point: (" + pt.getX() + ", " + pt.getY() + ")");
    }
}
2. Inheritance (Reusability)
1. Single Inheritance
Java
public class Inheritance01 {
    static class Animal { void eat() { System.out.println("Eating..."); } }
    static class Dog extends Animal { void bark() { System.out.println("Barking..."); } }

    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat(); d.bark();
    }
}
2. Multilevel Inheritance
Java
public class Inheritance02 {
    static class LivingBeing { void breathe() { System.out.println("Breathing..."); } }
    static class Mammal extends LivingBeing { void feedMilk() { System.out.println("Feeding milk..."); } }
    static class Cat extends Mammal { void meow() { System.out.println("Meow!"); } }

    public static void main(String[] args) {
        Cat c = new Cat();
        c.breathe(); c.feedMilk(); c.meow();
    }
}
3. Hierarchical Inheritance
Java
public class Inheritance03 {
    static class Vehicle { void start() { System.out.println("Vehicle starting..."); } }
    static class Car extends Vehicle { void drive() { System.out.println("Car driving..."); } }
    static class Bike extends Vehicle { void pedal() { System.out.println("Bike pedaling..."); } }

    public static void main(String[] args) {
        new Car().start();
        new Bike().start();
    }
}
4. Using super for Constructors
Java
public class Inheritance04 {
    static class Person {
        String name;
        Person(String name) { this.name = name; }
    }
    static class Employee extends Person {
        int empId;
        Employee(String name, int empId) {
            super(name); // Calls parent constructor
            this.empId = empId;
        }
    }
    public static void main(String[] args) {
        Employee e = new Employee("John", 101);
        System.out.println(e.name + " - ID: " + e.empId);
    }
}
5. Using super for Parent Methods
Java
public class Inheritance05 {
    static class Parent {
        void show() { System.out.println("Parent show()"); }
    }
    static class Child extends Parent {
        void show() {
            super.show(); // Calls parent version
            System.out.println("Child show()");
        }
    }
    public static void main(String[] args) {
        new Child().show();
    }
}
6. Method Overriding in Inheritance
Java
public class Inheritance06 {
    static class Shape { void draw() { System.out.println("Drawing generic shape"); } }
    static class Circle extends Shape {
        @Override
        void draw() { System.out.println("Drawing a circle"); }
    }
    public static void main(String[] args) {
        Shape s = new Circle();
        s.draw();
    }
}
7. Protected Access Modifier
Java
public class Inheritance07 {
    static class Bank {
        protected double interestRate = 4.5;
    }
    static class SavingsAccount extends Bank {
        void showRate() {
            System.out.println("Rate: " + interestRate + "%"); // Accessible via inheritance
        }
    }
    public static void main(String[] args) {
        new SavingsAccount().showRate();
    }
}
8. instanceof with Inheritance
Java
public class Inheritance08 {
    static class Device {}
    static class Phone extends Device {}

    public static void main(String[] args) {
        Device d = new Phone();
        if (d instanceof Phone) {
            System.out.println("Object is a Phone instance.");
        }
    }
}
9. Preventing Inheritance with final
Java
public class Inheritance09 {
    static final class SecureSystem {
        void run() { System.out.println("Secure system running."); }
    }
    // static class SubSystem extends SecureSystem {} // Compile error if uncommented
    public static void main(String[] args) {
        new SecureSystem().run();
    }
}
10. Abstract Class Base Inheritance
Java
public class Inheritance10 {
    abstract static class Worker {
        abstract void work();
    }
    static class Developer extends Worker {
        void work() { System.out.println("Writing Java code."); }
    }
    public static void main(String[] args) {
        Worker w = new Developer();
        w.work();
    }
}
3. Polymorphism (Many Forms)
1. Overloading - Number of Parameters
Java
public class Polymorphism01 {
    static class MathUtils {
        int add(int a, int b) { return a + b; }
        int add(int a, int b, int c) { return a + b + c; }
    }
    public static void main(String[] args) {
        MathUtils m = new MathUtils();
        System.out.println(m.add(2, 3));
        System.out.println(m.add(1, 2, 3));
    }
}
2. Overloading - Data Types
Java
public class Polymorphism02 {
    static class Printer {
        void print(int val) { System.out.println("Int: " + val); }
        void print(String val) { System.out.println("String: " + val); }
    }
    public static void main(String[] args) {
        Printer p = new Printer();
        p.print(100);
        p.print("Hello");
    }
}
3. Overloading - Parameter Sequence
Java
public class Polymorphism03 {
    static class Info {
        void display(String name, int age) { System.out.println(name + ", " + age); }
        void display(int age, String name) { System.out.println(age + ", " + name); }
    }
    public static void main(String[] args) {
        Info i = new Info();
        i.display("Alice", 25);
        i.display(30, "Bob");
    }
}
4. Runtime Polymorphism (Overriding)
Java
public class Polymorphism04 {
    static class Animal { void sound() { System.out.println("Animal sound"); } }
    static class Dog extends Animal { void sound() { System.out.println("Bark"); } }
    static class Cat extends Animal { void sound() { System.out.println("Meow"); } }

    public static void main(String[] args) {
        Animal a1 = new Dog();
        Animal a2 = new Cat();
        a1.sound();
        a2.sound();
    }
}
5. Polymorphic Collections
Java
import java.util.List;

public class Polymorphism05 {
    static class Employee { void work() { System.out.println("Working..."); } }
    static class Manager extends Employee { void work() { System.out.println("Managing team..."); } }
    static class Developer extends Employee { void work() { System.out.println("Coding..."); } }

    public static void main(String[] args) {
        List<Employee> staff = List.of(new Manager(), new Developer());
        for (Employee e : staff) {
            e.work(); // Polymorphic execution
        }
    }
}
6. Polymorphism in Method Parameters
Java
public class Polymorphism06 {
    static class PaymentGateway {
        void processPayment() { System.out.println("Generic payment"); }
    }
    static class PayPal extends PaymentGateway {
        void processPayment() { System.out.println("Processing via PayPal"); }
    }

    static void executeCheckout(PaymentGateway pg) {
        pg.processPayment();
    }

    public static void main(String[] args) {
        executeCheckout(new PayPal());
    }
}
7. Covariant Return Types
Java
public class Polymorphism07 {
    static class A { A getInstance() { return this; } }
    static class B extends A {
        @Override
        B getInstance() { return this; } // Covariant return type
    }
    public static void main(String[] args) {
        B b = new B().getInstance();
        System.out.println("Instance returned successfully.");
    }
}
8. Interface Polymorphism
Java
public class Polymorphism08 {
    interface Renderable { void render(); }
    static class WebPage implements Renderable { public void render() { System.out.println("Rendering HTML"); } }
    static class MobileApp implements Renderable { public void render() { System.out.println("Rendering UI"); } }

    public static void main(String[] args) {
        Renderable r = new MobileApp();
        r.render();
    }
}
9. Pattern Matching instanceof (Java 16+)
Java
public class Polymorphism09 {
    public static void process(Object obj) {
        if (obj instanceof String s) {
            System.out.println("String length: " + s.length());
        } else if (obj instanceof Integer i) {
            System.out.println("Squared: " + (i * i));
        }
    }
    public static void main(String[] args) {
        process("Polymorphism");
        process(5);
    }
}
10. Polymorphic Billing System
Java
public class Polymorphism10 {
    interface Taxable { double calculateTax(double amount); }
    static class USATax implements Taxable { public double calculateTax(double a) { return a * 0.08; } }
    static class EUTax implements Taxable { public double calculateTax(double a) { return a * 0.20; } }

    public static void main(String[] args) {
        Taxable tax = new EUTax();
        System.out.println("Calculated Tax: $" + tax.calculateTax(100.0));
    }
}
4. Abstraction (Hiding Complexity)
1. Abstract Class with Abstract and Concrete Methods
Java
public class Abstraction01 {
    abstract static class Appliance {
        abstract void turnOn(); // Abstract
        void plugIn() { System.out.println("Plugged into power source."); } // Concrete
    }
    static class Fan extends Appliance {
        void turnOn() { System.out.println("Fan is spinning."); }
    }
    public static void main(String[] args) {
        Appliance a = new Fan();
        a.plugIn();
        a.turnOn();
    }
}
2. Template Method Pattern (Abstract Class)
Java
public class Abstraction02 {
    abstract static class Game {
        abstract void initialize();
        abstract void startPlay();
        // Template method
        public final void play() {
            initialize();
            startPlay();
        }
    }
    static class Chess extends Game {
        void initialize() { System.out.println("Setting up chess pieces."); }
        void startPlay() { System.out.println("Chess game started."); }
    }
    public static void main(String[] args) {
        Game g = new Chess();
        g.play();
    }
}
3. Basic Interface Implementation
Java
public class Abstraction03 {
    interface Flyable { void fly(); }
    static class Eagle implements Flyable {
        public void fly() { System.out.println("Eagle soaring high."); }
    }
    public static void main(String[] args) {
        Flyable f = new Eagle();
        f.fly();
    }
}
4. Multiple Interfaces (Multiple Inheritance via Interfaces)
Java
public class Abstraction04 {
    interface Printer { void printDoc(); }
    interface Scanner { void scanDoc(); }

    static class AllInOneMachine implements Printer, Scanner {
        public void printDoc() { System.out.println("Printing..."); }
        public void scanDoc() { System.out.println("Scanning..."); }
    }
    public static void main(String[] args) {
        AllInOneMachine m = new AllInOneMachine();
        m.printDoc();
        m.scanDoc();
    }
}
5. Interface with Default Methods
Java
public class Abstraction05 {
    interface Logger {
        void log(String msg);
        default void logError(String err) {
            log("ERROR: " + err); // Default implementation
        }
    }
    static class ConsoleLogger implements Logger {
        public void log(String msg) { System.out.println(msg); }
    }
    public static void main(String[] args) {
        Logger l = new ConsoleLogger();
        l.logError("Database timeout");
    }
}
6. Interface with Static Methods
Java
public class Abstraction06 {
    interface MathOperations {
        static int square(int x) { return x * x; }
    }
    public static void main(String[] args) {
        int result = MathOperations.square(6);
        System.out.println("Square: " + result);
    }
}
7. Interface Inheritance
Java
public class Abstraction07 {
    interface Animal { void eat(); }
    interface Pet extends Animal { void play(); }

    static class Dog implements Pet {
        public void eat() { System.out.println("Dog eating."); }
        public void play() { System.out.println("Dog fetching ball."); }
    }
    public static void main(String[] args) {
        Pet p = new Dog();
        p.eat(); p.play();
    }
}
8. Hiding Database Connection Complexity
Java
public class Abstraction08 {
    interface Database { void connect(); }
    static class MySQLDatabase implements Database {
        public void connect() { System.out.println("Connecting to MySQL cluster..."); }
    }
    public static void main(String[] args) {
        Database db = new MySQLDatabase();
        db.connect(); // User doesn't know about drivers, sockets, or auth strings
    }
}
9. Bank Transaction Abstraction
Java
public class Abstraction09 {
    interface Transaction { void execute(); }
    static class TransferTransaction implements Transaction {
        public void execute() { System.out.println("Executing secure fund transfer..."); }
    }
    public static void main(String[] args) {
        Transaction tx = new TransferTransaction();
        tx.execute();
    }
}
10. Service Layer Notification Abstraction
Java
public class Abstraction10 {
    interface NotificationService { void send(String msg); }
    static class SmsService implements NotificationService {
        public void send(String msg) { System.out.println("SMS sent: " + msg); }
    }
    public static void main(String[] args) {
        NotificationService service = new SmsService();
        service.send("Your verification code is 4829");
    }
}
