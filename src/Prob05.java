
import java.util.*;
import java.io.*;

/**
 * Created by chenc on 3/6/2017.
 */
public class Prob05
{
    public static void main(String[] args) throws IOException
    {
        Scanner in = new Scanner(new File("inputs/prob05.dat"));
        int sets = new Integer(in.nextLine());
        while(sets-->0)
        {
            String s = in.nextLine();
            double d = new Double(s.substring(1));
            System.out.println("Total of the bill: " + d);
            System.out.printf("%s = %1.2f%n", "15%",Math.round(d*15)/100.0);
            System.out.printf("%s = %1.2f%n", "18%", Math.round(d*18)/100.0);
            System.out.printf("%s = %1.2f%n", "20%", Math.round(d*20)/100.0);

        }
    }
}
