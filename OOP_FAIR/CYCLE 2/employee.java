/*Write a Java program which creates a class named 'Employee' having the following
members: Name, Age, Phone number, Address, Salary. It also has a method named 'print-
Salary( )' which prints the salary of the Employee. Two classes 'Officer' and 'Manager'
inherits the 'Employee' class. The 'Officer' and 'Manager' classes have data members 'spe-
cialization' and 'department' respectively. Now, assign name, age, phone number, address
and salary to an officer and a manager by making an object of both of these classes and
print the same. (Exercise to understand inheritance). */

import java.io.*;
import java.util.*;
class Employee{
String Name;
int Age;
long Phone_number;
String Address;
double Salary;

double print_Salary(){
return Salary;}}

class Officer extends Employee{
String specialization;
}
class Manager extends Employee{
String Department;}

class employee{
	public static void main(String args[]){
	Scanner sc =new Scanner(System.in);
	Officer off=new Officer();
	Manager man=new Manager();
	
	System.out.println("----------Enter Details of Officer----------------------");
	System.out.print("Enter Name  :");
	off.Name=sc.nextLine();
	System.out.print("Enter Age  :");
	off.Age=sc.nextInt();
	System.out.print("Enter Phone number :");
	off.Phone_number=sc.nextLong();
	sc.nextLine();
	System.out.print("Enter Address :");
	off.Address=sc.nextLine();
	System.out.print("Enter specialization:");
	off.specialization=sc.nextLine();
	System.out.print("Enter Salary:");
	off.Salary=sc.nextDouble();
	
        System.out.println("------------Details of Officer----------------------");
	System.out.println("Name\t:\t"+off.Name);
	System.out.println("Age\t:\t"+off.Age);
	System.out.println("Phone number\t:\t"+off.Phone_number);
	System.out.println("Address\t:\t"+off.Address);
	System.out.println("Specialization\t:\t"+off.specialization);
	System.out.println("Salary\t:\t"+off.print_Salary());
	
	
	
	System.out.println("-------------------Enter Details of Manager--------------- ");
	sc.nextLine();
	System.out.print("Enter Name  :");
	man.Name=sc.nextLine();
	System.out.print("Enter Age  :");
	man.Age=sc.nextInt();
	System.out.print("Enter Phone number :");
	man.Phone_number=sc.nextLong();
	sc.nextLine();
	System.out.print("Enter Address :");
	man.Address=sc.nextLine();
	System.out.print("Enter Department:");
	man.Department=sc.nextLine();
	System.out.print("Enter Salary:");
	man.Salary=sc.nextDouble();
	
	System.out.println("-------------------Details of Manager--------------- ");
	
	
	System.out.println("Name\t:\t"+man.Name);
	System.out.println("Age\t:\t"+man.Age);
	System.out.println("Phone number\t:\t"+man.Phone_number);
	System.out.println("Address\t:\t"+man.Address);
	System.out.println("Department\t:\t"+man.Department);
	System.out.println("Salary\t:\t"+man.print_Salary());
	System.out.println("---------------------------------------------------");
	
	
	}}



