import java.util.ArrayList;
import java.util.List;

public class leetsubstring {
    public static void main(String args[])
    {
        String s="abcabcbbc";
        int start=0;
        int end=0;
        int maxl=0;
        List<Character> list = new ArrayList<Character>();
        while(end<s.length())
        {
            if(!list.contains(s.charAt(end)))
            {
                list.add(s.charAt(end));
                end++;
                maxl=Math.max(maxl,list.size());

            }
            else
            {
                list.remove(Character.valueOf(s.charAt(start)));
                start++;

            }
        }
        System.out.println(maxl);

    }}


