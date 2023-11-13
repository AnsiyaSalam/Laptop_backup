import java.util.*;

class SumAvg{
public static void main(String []args){

int num,sum=0;
int count=0;
System.out.println("Enter the number");

Scanner sc=new Scanner(System.in);


while(count<5){
num= sc.nextInt();
if(num>=0){
 sum=sum+num;
}
count++;
}

System.out.println("Sum is "+sum);
int avg=sum/5;
System.out.println("Avg is "+avg);
}
}