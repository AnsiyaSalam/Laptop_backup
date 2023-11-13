public class FunctionShortString{

    static public String ShortString(String name[]){

      int min = 999;
      String k="";
      for(int i=0; i<name.length; i++)
      {
          int s=name[i].length();
          if (s<min)
          {
             min=s;
          }   
      }
      for(int i=0; i<name.length; i++)
      {
          if(min==name[i].length())
          {
              k=name[i];
          }
      }
      return k;
    }

    public static void main(String []args){
        String arr[]={"Ansiya", "Sidhu", "Rohit"};
        System.out.println(ShortString(arr));
    }
}