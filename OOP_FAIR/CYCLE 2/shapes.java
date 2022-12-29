/*Write a java program to create an abstract class named Shape that contains an empty
method named numberOfSides( ). Provide three classes named Rectangle, Triangle and
Hexagon such that each one of the classes extends the class Shape. Each one of the class-
es contains only the method numberOfSides( ) that shows the number of sides in the giv-
en geometrical structures. (Exercise to understand polymorphism). */

//import java.io.*;
import java.util.Scanner;
abstract class Shape{
abstract void numberOfSides();}

class Rectangle extends Shape{
void numberOfSides(){
System.out.println("The number of sides of Rectangle is 4");}}

class Triangle extends Shape{
void numberOfSides(){
System.out.println("The number of sides of Triangle is 3");}}

class Hexagon extends Shape{
void numberOfSides(){
System.out.println("The number of sides of Hexagon is 6");}}

class shapes{
	public static void main (String args[]){
	
        Rectangle r=new Rectangle();
        Triangle t=new Triangle();
        Hexagon h = new Hexagon();
        r.numberOfSides();
        t.numberOfSides();
        h.numberOfSides();
        }}
