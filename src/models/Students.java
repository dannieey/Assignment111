package models;

import java.util.ArrayList;

public class Students extends Person{
    private static int idCounter=1000;
    private int studentID;
    private ArrayList<Integer> grades;



    public Students(String name, String surname, int age, boolean gender) {
        super(name, surname, age, gender); //конструктор который получает доступ к метод с класса от которого наследуется
        this.studentID=idCounter++;
        this.grades=new ArrayList<>();

    }

    public void addGrade(int grade){
        this.grades.add(grade);
    }

    public double calculateGPA(){
        if(grades.isEmpty()){
            return 0.0;
        }
        int n=0;
        for(int grade: grades){
            n+=grade;
        }
        return n/(double) grades.size();
    }

    @Override
    public String toString(){
        return super.toString()+ "I am a student with ID [" + studentID+"].";
    }



}
