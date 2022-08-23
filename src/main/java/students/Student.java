package students;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class Student {
    private long id;
    private String name;
    private ArrayList<Integer> grades;

    public Student() {
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }

    // adds the given grade to the grades list
    public void addGrade(int grade){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter new grade: ");
        int userInput = scanner.nextInt();

        getGrades().add(userInput);
    }

    // returns the average of the students grades
    public double getGradeAverage(){
        DecimalFormat numberFormat = new DecimalFormat("#.0");

        double sum = 0;
        for (Integer integer : grades) {
            sum += integer;
        }
        return sum / grades.size();
    }



}
