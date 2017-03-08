import java.util.*;
import java.io.*;

/**
 * Created by chenc on 2/27/2017.
 */
public class Prob01 {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("inputs/prob01.dat"));
        int sets = new Integer(in.nextLine());
        while(sets-->0) {
            int num = new Integer(in.nextLine());
            for (int i = 0; i < num; i++) {
                String s = "";
                for (int j = 0; j < num; j++) {
                    s += "# ";
                }
                System.out.println(s.trim());
            }
        }

    }
}
