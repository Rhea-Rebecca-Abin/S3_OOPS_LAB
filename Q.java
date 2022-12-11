import java.io.*;
import java.util.*;
public class Q{
    String names[];
    int length;
    
    public static void main(String args[]){
    
    int n;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the no of names:");
    n=sc.nextInt();
    n=n+1;
    String stringsList[]=new String[n];
    System.out.println("Enter the names:");
    for (int i=0;i<n;i++){
            
             stringsList[i]=sc.nextLine();}
    Q obj=new Q();
    obj.sort(stringsList);
     for (String i : stringsList) {
            System.out.print(i);
            System.out.print(" ");
    }}
    void sort(String array[]){
            
            if(array ==null || array.length ==0){
                   return;}
            
            this.names=array;
            this.length=array.length;
            QuickSort(0,length-1);
            }
    void QuickSort(int lower,int higher){
    
    int i=lower;
    int j=higher;
    String pivot =this.names[lower+(lower-higher)/2];   
    while(i<=j){
         while(this.names[i].compareToIgnoreCase(pivot)<0){
                 i++;}
         while(this.names[i].compareToIgnoreCase(pivot)>0){
          
                  j--;}
         
         if (i<=j){
              exchangeNames(i,j);
              i++;
              j--;}}
    if (lower<j){
        QuickSort(lower,j);}
    if (i<higher){
        QuickSort(i,higher);
        }}
              
    void exchangeNames(int i,int j){
         String temp=this.names[i];      
         this.names[i]=this.names[j];
         this.names[j]=temp;}}
