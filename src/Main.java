import models.Person;
import models.Students;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Locale.setDefault(Locale.US);
        File file=new File("src/students.txt");
        Scanner sc=new Scanner(file);

        List<Students> students=new ArrayList<>();

        while (sc.hasNextLine()) {
            String name = sc.next();
            String surname = sc.next();
            int age = sc.nextInt();
            boolean gender = sc.nextBoolean();
            String gradesLine = sc.nextLine().trim(); //тк у нас оценки в листе, мы читаем весь лист а потом с помощью trim(), удаляем пробелы в начале и в конце строки, чтобы правильнее передавать оценки каждому ученику

            Students student = new Students(name, surname, age, gender);

            if (!gradesLine.isEmpty()) {
                String[] grades = gradesLine.split(",");
                for (String grade : grades) {
                    student.addGrade(Integer.parseInt(grade));
                }

            }
            students.add(student);
        }
        sc.close();

        for(Students student: students){
            System.out.println(student);
            System.out.println(student.getName() +"`s GPA: "+student.calculateGPA());

        }


    }
}