package com.example.saes2.model;
import java.util.HashSet;
import java.util.Set;
public class Student {
    private String name, fristsurname, secondsurname, curp, password;
    private int semester;
    private Set<Subject> subjects;

    public Student(String name, String fristsurname, String secondsurname, String curp, String password, int semester) {
        this.name = name;
        this.fristsurname = fristsurname;
        this.secondsurname = secondsurname;
        this.curp = curp;
        this.password = password;
        this.semester = semester;
        this.subjects = new HashSet<>();
    }
    public Student(){

    }
    public void inscribeSubjects(Subject subject) {
        if (subjects.size() < 8) {
            subjects.add(subject);
        } else {
            System.out.println("No se pueden inscribir más materias.");
        }
    }
    //Getter and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFristsurname() {
        return fristsurname;
    }

    public void setFristsurname(String fristsurname) {
        this.fristsurname = fristsurname;
    }

    public String getSecondsurname() {
        return secondsurname;
    }

    public void setSecondsurname(String secondsurname) {
        this.secondsurname = secondsurname;
    }

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }
}
