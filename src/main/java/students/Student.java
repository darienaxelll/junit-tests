package students;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Student {
    private  long id;
    private  String name;
    private ArrayList<Integer> grades = new ArrayList<>();

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Student(ArrayList<Integer> grades) {
        this.grades = grades;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }

    public void addGrade(int grade){

        grades.add(grade);
    }

    public double getGradeAverage(){
        DecimalFormat numberFormat = new DecimalFormat("#.0");

        double sum = 0;
        for (Integer integer : grades) {
            sum += integer;
        }
        return sum / grades.size();
    }

    public boolean isEmpty() {
        return grades.size() == 0;
    }

    public static void main(String[] args) {
        Student student1 = new Student(1, "Darien");

        student1.addGrade(80);
        student1.addGrade(90);
        System.out.println(student1.getGradeAverage());
    }
}

