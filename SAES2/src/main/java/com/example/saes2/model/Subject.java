package com.example.saes2.model;

public class Subject {
    private String name, area, horario;
    private int semester, score1, score2, score3;

    public Subject(String name, String area, String horario, int semester, int score1, int score2, int score3) {
        this.name = name;
        this.area = area;
        this.horario = horario;
        this.semester = semester;
        this.score1 = score1;
        this.score2 = score2;
        this.score3 = score3;
    }
    public Subject(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public int getScore1() {
        return score1;
    }

    public void setScore1(int score1) {
        this.score1 = score1;
    }

    public int getScore2() {
        return score2;
    }

    public void setScore2(int score2) {
        this.score2 = score2;
    }

    public int getScore3() {
        return score3;
    }

    public void setScore3(int score3) {
        this.score3 = score3;
    }
}
