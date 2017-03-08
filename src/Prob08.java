import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by chenc on 3/8/2017.
 */
public class Prob08 {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("inputs/prob08.dat"));
        int sets = new Integer(in.nextLine());
        while(sets-->0) {
            int num = new Integer(in.nextLine());
            Song[]arr = new Song[num];
            for (int i = 0; i < arr.length; i++)
            {
                String [] s = in.nextLine().split(" - ");
                arr[i] = new Song(s[0],s[1]);
            }
            Arrays.sort(arr);
            for (Song s:arr)
            {
                System.out.println(s);
            }
        }
    }
}

class Song implements Comparable
{
    private String name;
    private String artist;

    public Song(String n, String a)
    {
        name = n;
        artist = a;
    }

    public int compareTo(Object o)
    {
        Song s = (Song)o;
        String s1 = this.artist;
        String s2 = s.artist;
        if(s1.contains("The ")) s1 = s1.substring(4);
        if(s2.contains("The ")) s2 = s2.substring(4);
        int byArtist = s1.toLowerCase().compareTo(s2.toLowerCase());
        int byName = this.name.toLowerCase().compareTo(s.name.toLowerCase());
        if(byArtist < 0) return -1;
        else if(byArtist > 0) return 1;
        else
        {
            if(byName<0)return -1;
            else if(byName>0)return 1;
            else return 0;
        }
    }

    public String toString()
    {
        return name + " - " + artist;
    }
}
