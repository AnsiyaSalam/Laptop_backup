import java.util.*;

class Exercise9{
public static void main(String []args){
int n1,n2,n3;
System.out.println("Enter the numbers");
Scanner sc=new Scanner(System.in);
n1=sc.nextInt();
n2=sc.nextInt();
n3=sc.nextInt();

if(n1>n2 && n1>n3){
System.out.println("n1 is greater");
}
else if(n2>n1 && n2>n3){
System.out.println("n2 is greater");
}
else{
System.out.println("n3 is greater");
}
}
}
