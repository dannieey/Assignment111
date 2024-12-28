package models;

public class Person {
    String name;
    String surname;
    int age;
    boolean gender; //true-female

    public Person(String name, String surname, int age, boolean gender) {
        setName(name);
        setSurname(surname);
        setAge(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean getGender() {
        return gender; // true indicates Female
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getGenderAsString() {
        return gender ? "Female" : "Male";
    }


    @Override
    public String toString(){
        return "Hi, I am "+ name+" "+surname+"a "+age+"-year-old "+ gender;
    }


}
