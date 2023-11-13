import java.util.*;

class Prime{
public static void main(String []args){
int num;
System.out.println("Enter the number");
Scanner sc=new Scanner(System.in);
num=sc.nextInt();

for(int i=2; i<=num/2; i++){
if(num%i ==0){
System.out.println("Not prime");
break;
}
else{
System.out.println("Prime");
break;
}
}
}
}