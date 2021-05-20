package com;

import java.util.ArrayList;

// simple object to test sorting objects
public class Student implements Comparable{
    private final String name;
    private ArrayList<Integer> grades = new ArrayList<>();

    public Student(String name){
        this.name = name;
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }

    public void addGrade(int grade) {
        this.grades.add(grade);
    }

    public void addGrades(ArrayList<Integer> grades) {
            this.grades.addAll(grades);
    }

    public int getAverageGrade(){
        int sum = 0;
        for (int value : getGrades()) {
            sum += value;
        }
        return sum/getGrades().size();
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", grades=" + grades + '}';
    }

    @Override
    public int compareTo(Object o) {
        Student other = (Student) o;
        if (getAverageGrade() > other.getAverageGrade()) {
            return 1;
        } else if (getAverageGrade() < other.getAverageGrade()) {
            return -1;
        }
        return 0;
    }
}
