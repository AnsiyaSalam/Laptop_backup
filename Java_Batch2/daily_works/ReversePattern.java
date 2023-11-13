import java.util.*;

class ReversePattern{
public static void main(String []args){
int num;
Scanner sc=new Scanner(System.in);
num=sc.nextInt();

for(int row=num;row>0;row--){
for(int col=num;col>=row;col--){

System.out.print(col + " ");
}
System.out.println();
}

}
}