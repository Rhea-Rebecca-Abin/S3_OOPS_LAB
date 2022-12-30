//Binary search
import java.util.Scanner;
class Binary_search{
   public static void main(String args[]){
   Scanner sc=new Scanner (System.in);
   System.out.println("Enter no of elements");
   int n=sc.nextInt();
   int []arr=new int[n];
   int []t=new int [n];
   System.out.println("Enter an array");
   
   for(int j=0;j<n;j++){
        arr[j]=sc.nextInt();
        t[j]=j+1;
        
      
        }
        
   //Sorting the array
   for(int k=0;k<n;k++){
       for (int l=0;l<n-k-1;l++){
            if (arr[l]>arr[l+1]){
                 int temp=arr[l];
                 int b=t[l];
                 arr[l]=arr[l+1];
                 t[l]=t[l+1];
                 arr[l+1]=temp;
                 t[l+1]=b;}}}
                 
   System.out.println("Sorted array :");
    for(int j=0;j<n;j++){
        System.out.println(arr[j]);}
       
        
        
        
   int mid,high,low,flag=0;
   low=0;high=n-1;
   System.out.println("Enter the element to be searched :");
   int key=sc.nextInt();
   
   while(low<=high){
       mid=(low+high)/2;
       if (arr[mid]==key){
             System.out.println("Found " +key+" at position "+t[mid]);
             flag=1;low=high=mid;
             break;
             }
              
   
       else if (key<=arr[mid])
              high=mid-1;
       else   
                 low=mid+1;}
   if (flag == 0){System.out.println("Element not found ");}
}}
