/*Write a file handling program in Java with reader/writer.*/

import java.io.*;
import java.util.*;
public class f{
  public static void main(String[]args) throws Exception{
    File inf = new File("i.txt");  
    File outf = new File("o.txt");
    FileReader ins = new FileReader(inf);
    FileWriter outs = new FileWriter(outf);
    int ch;
    Scanner sc =new Scanner(System.in);
    String str;
    System.out.println("Reading from the file and printing");
    while((ch=ins.read()) != -1){
    System.out.print((char) ch);
    outs.write(ch);
    
    }
    System.out.println("The above sentence has been written...Enter more data to be written to file");
    str=sc.nextLine();
    outs.write(str);
    if(outs != null)
      System.out.println("Content written Successfully");
    ins.close();
    outs.close();
  }
}
