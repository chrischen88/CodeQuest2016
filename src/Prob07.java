import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by chenc on 3/7/2017.
 */
public class Prob07
{
    public static void main(String[] args) throws IOException
    {
        Scanner in = new Scanner(new File("inputs/prob07.dat"));
        int sets = new Integer(in.nextLine());
        while(sets-->0)
        {
            int lines = new Integer(in.nextLine());
            char[][] arr = new char[lines][];
            for (int i = 0; i < lines; i++)
            {
                arr[i] = in.nextLine().toCharArray();
            }
            String [] starting = in.nextLine().split(", ");
            int linesEncrypt = new Integer(in.nextLine());
            int row = new Integer(starting[0]);
            int col = new Integer(starting[1]);
            char[][]map = new char[linesEncrypt][];
            for (int i = 0; i < linesEncrypt; i++)
            {
                map[i] = in.nextLine().toCharArray();
            }

            String s = "";
            for (int i = 0; i < map.length; i++)
            {
                for (int j = 0; j < map[i].length; j++)
                {
                    if(map[i][j]=='O')
                    {
                        s+=""+arr[i+row][j+col];
                    }
                }
            }
            System.out.println(s);
        }
    }
}
