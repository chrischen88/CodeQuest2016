import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by 18chenc on 3/8/2017.
 */
public class Prob09
{
    public static void main(String[] args)throws IOException
    {
        Scanner in = new Scanner(new File("inputs/prob09.dat"));
        int sets = new Integer(in.nextLine());
        while(sets-->0)
        {
            String [] arr = in.nextLine().split(" ");
            int zoom = new Integer(arr[0]);
            double latitude = new Double(arr[1]);
            double longitude = new Double(arr[2]);
            int x = (int)Math.abs((longitude+180)/360 * Math.pow(2,zoom));
            int y = (int)Math.abs((1-Math.log(Math.tan(latitude*(Math.PI/180.0))+1.0/Math.cos(latitude*(Math.PI/180.0)))/Math.PI)
                    * Math.pow(2,zoom-1));
            System.out.println("http://tile.openstreetmap.org/"+zoom+"/"+x+"/"+y+".png");
        }
    }
}
