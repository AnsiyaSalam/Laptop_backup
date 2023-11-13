Iimport java.util.*;

class Pattern{
public static void main(String []args){

int num;
Scanner sc=new Scanner(System.in);
num=sc.nextInt();

for(int row=1;row<=num;row++){
for(int col=1;col<=row;col++){

System.out.print(col + " ");
}
System.out.println();
}

}
}