import java.io.*;
import java.util.*;

class frequency
{
  public static void main(String a[]){
  Scanner sc = new Scanner(System.in);
  
  String str;
  System.out.println("Enter the string:");
  str= sc.nextLine();
  int[] fr = new int[str.length()];  
     
  int count,i,j;
 
 
  char[] ch=str.toCharArray();  
  for(i=0;i<ch.length;i++){
       count=1;
       for(j=i+1;j<ch.length;j++)
             {if(ch[i]==ch[j])  
                  {
                  count++;
                  fr[j]=-1;  }}
       if (fr[i]!=-1)
            fr[i]=count;}
            
  System.out.println("Printing Character and Frequency");          
  for(i=0;i<ch.length;i++)
    if (fr[i]!=-1 && ch[i]!=' ')
    {   System.out.println(ch[i]+ "\t:\t"+fr[i]);}
    else if(fr[i]!=-1 && ch[i]==' ')
           {System.out.println("' '\t:\t"+fr[i]);}
   
}}
