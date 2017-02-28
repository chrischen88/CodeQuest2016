import java.util.*;
import java.io.*;

/**
 * Created by 18chenc on 2/27/2017.
 */
public class Prob02
{
    public static void main(String[] args) throws IOException
    {
        Scanner in = new Scanner(new File("inputs/prob02.dat"));
        int sets = new Integer(in.nextLine());
        while(sets-->0)
        {
            String s = in.nextLine();
            System.out.println(s);
            int total = (int)(new Double(s.substring(1))*100);
            System.out.println("Quarters=" + (total / 25));
            total %= 25;
            System.out.println("Dimes=" + (total/10));
            total%=10;
            System.out.println("Nickels=" + (total/5));
            total%=05;
            System.out.println("Pennies=" + (total/1));
        }
    }
}
