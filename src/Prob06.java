import java.util.*;
import java.io.*;

/**
 * Created by chenc on 3/7/2017.
 */
public class Prob06 {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("inputs/prob06.dat"));
        int sets = new Integer(in.nextLine());
        while(sets-->0) {
            String school = in.nextLine();
            int students = new Integer(in.nextLine());
            double greatestGPA = 0;
            String greatestName = "";
            int greatestCredits = 0;
            while(students-->0) {
                String [] student = in.nextLine().split(",|:");
                String name = student[0];
                int totalCredits = 0;
                double totalGpa = 0;
                for (int i = 1; i < student.length; i++) {
                    String [] grade = student[i].split("");
                    int gpa = grade[0].equals("A")? 4 : grade[0].equals("B")? 3 : grade[0].equals("C")? 2 : 1;
                    totalCredits+= new Integer(grade[1]);
                    totalGpa += gpa*new Integer(grade[1]);
                }
                totalGpa /= totalCredits;
                if(totalGpa > greatestGPA) {
                    greatestGPA = totalGpa;
                    greatestName = name;
                    greatestCredits = totalCredits;
                }
                else if(totalGpa == greatestGPA) {
                    greatestName = totalCredits > greatestCredits ? name : greatestName;
                }

            }
            System.out.println(school + " = " + greatestName);
        }
    }
}
