//Doubly linked list
import java.util.*;
public class double_link{
      static class Node{
      int data;
      Node prev;
      Node next;
      
      Node(int data){
       this.data=data;
       this.prev=null;
       this.next=null;}}
      
      Node head=null;
      Node tail=null;
      int count =0;
      
      public void insertion(){
        Scanner sc=new Scanner(System.in);
      int c,data;
      System.out.println("Enter data:");
      data=sc.nextInt();
      Node new_node=new Node(data);
      
      
      if (head==null){
      
           head=new_node;
           tail=new_node;
           System.out.println("Inserted as head node");
           count++; 
           //System.out.println(count);
           }
      else{
      
      
          System.out.println("Choose Insertion operations \n1.Beginning\n2.Specific location\n3.The end");

          c=sc.nextInt();
          switch(c){
          
          case 1: new_node.next=head;
                  head.prev=new_node;
                  head =new_node;
                  System.out.println("Inserted as head");
                  count++;
                  //System.out.println(count);
                  break;
          case 2:if (count >1){
                   
                    System.out.print("Enter position :");
                    int p=sc.nextInt();
                    if (p==1){
                    new_node.next=head;
                    head.prev=new_node;
                    head =new_node;
                    System.out.println("Inserted as head");
                    count++;}
                    else{
                    
                    
                    Node temp=head;
                    Node ptr=temp.next;
                    for(int i=1;i<p-1;i++){
                            temp=temp.next;
                            ptr=ptr.next;}
                    new_node.next=ptr;
                    new_node.prev=temp;
                    temp.next=new_node;
                    ptr.prev=new_node;
                    System.out.print("Inserted");
                    count ++;
                     //System.out.println(count);
                    }}
                    else
                       System.out.println("Cannot do this");
                 break;
          case 3:
                 tail.next=new_node;
                 new_node.prev=tail;
                 tail=new_node;
                 System.out.print("Inserted");
                 count ++;
                 //System.out.println(count);
                 break;}}}
      
      
      
      public void deletion(){
            Scanner sc =new Scanner(System.in);
            System.out.println("Enter position");
            int pos=sc.nextInt();
            if (pos<=count && pos!=-1){
            
            if (pos==1)
                     {
                     if (count>1){
                     
                     Node temp=head;
                     temp=temp.next;
                     temp.prev=null;
                     head.next=null;
                     head=temp;
                     System.out.println("Deleted");
                     count --;
                     // System.out.println(count);
                      }
                     else{
                          head=null;
                          tail=null;
                          count--;
                          System.out.println("Deleted");
                          //System.out.println(count);
                          }}
            else
                {
                Node temp2=head;
                Node ptr1=temp2.next;
                
                for (int i=1;i<pos-1;i++){
                    temp2=temp2.next;
                    ptr1=ptr1.next;}
                if (ptr1!=tail){
                 temp2.next=ptr1.next;
                 ptr1.next.prev=temp2;
                 System.out.println("Deleted");count --;
                  //System.out.println(count);
                  }
                
                else{
                      temp2.next=null;
                      tail.prev=null;
                      tail=temp2;
                      System.out.println("Deleted");
                      count--;
                       //System.out.println(count);
                       }}}
                else
                {System.out.println("Invalid position");}}
      
      
      
      
      
      
      
      
      
      
      
     public void traversal(){
          if(head==null){
                System.out.println("Linked list is empty");}
          
           else{
                Node temp=head;
                while(temp!=null){
                    if(temp.next!=null){
                         System.out.print(temp.data+"<->");
                         temp=temp.next;}
                     else
                         {System.out.print(temp.data);
                         temp=temp.next;}}}
         
       }
       
public static void main(String args[]){
       double_link dll=new double_link();
       Scanner sc=new Scanner(System.in);
       int choice,data;
       do{
        System.out.println("\nChoose operations\n1.Insertion\n2.Display\n3.Delete\n0.Exit\n");        
        choice=sc.nextInt();
        switch(choice){
             case 1:
             
             dll.insertion();break;
             
             case 2:dll.traversal();break;
             case 3:dll.deletion();break;
             case 0:System.out.println("Exiting");break;
             default:System.out.println("Wrong choice netr again");
                } }while(choice!=0);}}
                  
          
       
       
                 
      
