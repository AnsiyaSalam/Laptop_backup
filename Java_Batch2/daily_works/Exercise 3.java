import java.util.*;

class Exercise3{
   public static void main(String []args){
   int n1,n2,n3,n4,n5;
   
   System.out.println("Enter five Numbers");
   Scanner sc=new Scanner(System.in);
   n1=sc.nextInt();
n2=sc.nextInt();
n3=sc.nextInt();
n4=sc.nextInt();
n5=sc.nextInt();

int sum=n1+n2+n3+n4+n5;
int avg=sum/5;
System.out.println("Sum is= "+sum);
System.out.println("Average is= "+avg);
}
}
