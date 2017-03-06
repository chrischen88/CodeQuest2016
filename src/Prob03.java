import java.util.*;
import java.io.*;

/**
 * Created by 18chenc on 2/27/2017.
 */
public class Prob03
{
    public static void main(String[] args) throws IOException
    {
        Scanner in = new Scanner(new File("inputs/prob03.dat"));
        int sets = new Integer(in.nextLine());
        while(sets-->0)
        {
            String[] arr = in.nextLine().split(",\\s");
            ArrayList<Integer> sides = new ArrayList<>();
            for (String s: arr)
            {
                sides.add(new Integer(s));
            }
            if(sides.get(0)+sides.get(1) > sides.get(2))
            {
                if(sides.get(0).equals(sides.get(1)) && sides.get(0).equals(sides.get(2)))
                {
                    System.out.println("EQUILATERAL");
                }
                else if(sides.get(0).equals(sides.get(1)))
                {
                    System.out.println("ISOSCELES");
                }
                else System.out.println("SCALENE");
            }
            else System.out.println("NOT A TRIANGLE");
        }
    }
}