import java.util.*;

class Mul{
public static void main(String []args){

int num;
System.out.println("Enter the number");
Scanner sc=new Scanner(System.in);
num=sc.nextInt();
for(int count=1; count<10; count++){
int result=num*count;
System.out.println(num+"*"+count+"="+result);
}
}
}
