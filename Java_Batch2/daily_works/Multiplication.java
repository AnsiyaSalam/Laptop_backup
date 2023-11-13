import java.util.*;

class Multiplication{
public static void main(String []args){

int num;
int count=1;
System.out.println("Enter the number");
Scanner sc=new Scanner(System.in);
num=sc.nextInt();

while(count<=10){
int result=num*count;
System.out.println(num+"*"+count+"="+result);
count++;
}
}
}