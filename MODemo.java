// A Simple Java program to demonstrate application of overriding in Java
 
// Base Class
class Employee {
    public static int base = 10000;
    int salary() {
        return base;
    }
}
 
// Inherited class
class Manager extends Employee {
    // This method overrides show() of Parent
    int salary() {
        return base + 20000;
    }
}
 
// Inherited class
class Clerk extends Employee {
    // This method overrides show() of Parent
    int salary(){
        return base + 10000;
    }
}
 
// Driver class
class MODemo {
    // This method can be used to print salary of any type of employee using base class refernce
    static void printSalary(Employee e) {
        System.out.println(e.salary());
    }
 
    public static void main(String[] args)
    {
        Employee obj1 = new Manager();
        System.out.print("Manager's salary : ");
        printSalary(obj1);
 
        Employee obj2 = new Clerk();
        System.out.print("Clerk's salary : ");
        printSalary(obj2);
    }
}
