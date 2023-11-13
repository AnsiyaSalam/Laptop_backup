import java.util.*;
public class ArrayTest {
   public static void main(String []args){
       Scanner sc=new Scanner(System.in);
       int num[]= new int[5];
       int z=4;
       int count=0;
       System.out.println("insert element");

       for(int i=0; i<5; i++)
       {
           num[i]=sc.nextInt();
       }
       for(int i=0; i<5; i++)
       {
           if(num[i]==z)
           {
               count++;

           }

           
       }
       System.out.println("count "+count);
   } 
}
