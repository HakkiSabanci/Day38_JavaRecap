package day38_JavaRecap;

import java.util.ArrayList;
import java.util.Arrays;

public class StudentGrades {
    public static void main(String[] args) {
        ArrayList<Integer> grades = new ArrayList<>(Arrays.asList(100,89,90,75,79,70,85,65,80,85,69,70,55,45,90,73,35,47));
        //A
        //90~100
        ArrayList<Integer> gradeOfA = new ArrayList<>(grades);
        gradeOfA.removeIf(p->p<90);
        System.out.println(gradeOfA.size()+" Student(s) are grade A and grades: "+gradeOfA);
        //B
        //80~89
        ArrayList<Integer> gradeOfB = new ArrayList<>(grades);
        gradeOfB.removeIf(p-> p<80||p>89);
        System.out.println(gradeOfB.size()+" Student(s) are grade B and grades: "+gradeOfB);
        //C
        //70~79
        ArrayList<Integer> gradeOfC = new ArrayList<>(grades);
        gradeOfC.removeIf(p->p<70||p>79);
        System.out.println(gradeOfC.size()+" Student(s) are grade C and grades: "+gradeOfC);
        //D
        //60-69
        ArrayList<Integer> gradeOfD = new ArrayList<>(grades);
        gradeOfD.removeIf(p->p<60||p>69);
        System.out.println(gradeOfD.size()+" Student(s) are grade D and grades: "+gradeOfD);

        //below 60
        ArrayList<Integer> gradeOfF = new ArrayList<>(grades);
        gradeOfF.removeAll(gradeOfA);
        gradeOfF.removeAll(gradeOfB);
        gradeOfF.removeAll(gradeOfC);
        gradeOfF.removeAll(gradeOfD);
        System.out.println(gradeOfF.size()+" Student(s) are grade F and grades: "+gradeOfF);


    }
}
