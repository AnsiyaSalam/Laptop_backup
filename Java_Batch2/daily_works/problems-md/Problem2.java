import java.util.*;

public class Problem2 {
    
    public static void countList(List<String> s)
    {
        List<String> newList = new ArrayList<>();
        int count = 0;
        {
            for(String str : s)
            {
                if(str.length()>3)
                {
                    count++;
                }
                if(str.length() != 0)
                {
                    newList.add(str);
                }
            }
            System.out.println("Count = "+count);
            System.out.println("Newlist = "+newList);
        }
    }
    public static void main(String args[])
    {
        List<String> str = new ArrayList<>(List.of("","laptop","mouse","pen"));
        Problem2.countList(str);
    }
}
