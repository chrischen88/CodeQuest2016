import java.util.*;
import java.io.*;
/**
 * Created by chenc on 3/6/2017.
 */
public class Prob04
{
    public static void main(String[] args) throws IOException
    {
        Scanner in = new Scanner(new File("inputs/prob04.dat"));
        int sets = new Integer(in.nextLine());
        while(sets-->0)
        {
            String [] arr = in.nextLine().split("\\|");
            char [] word1 = arr[0].toCharArray();
            char [] word2 = arr[1].toCharArray();
            ArrayList<Character> word1_1 = new ArrayList<>();
            ArrayList<Character> word2_1 = new ArrayList<>();
            for (char c: word1)
            {
                word1_1.add(c);
            }
            for (char c: word2)
            {
                word2_1.add(c);
            }
            boolean anagram = arr[0].equals(arr[1])? false : true;
            for (int i = 0; i < word1_1.size(); i++)
            {
                if(word2_1.contains(word1_1.get(i)))
                {
                    word2_1.remove(word1_1.get(i));
                }
                else
                {
                    anagram = false;
                    break;
                }
            }
            if(anagram)
            {
                System.out.println(arr[0] + "|" + arr[1] + " = " + "ANAGRAM");
            }
            else System.out.println(arr[0] + "|" + arr[1] + " = " + "NOT AN ANAGRAM");
        }
    }
}
