
package com.example.saes2.model;

public class Subject {
  private String area;
  private String name;
  private String schedule;

    private int Calif1;
  private int Calif2;
  private int Calif3;
  private int FinalScore;

    public Subject() {}

    public Subject(String area, String name, String schedule, int calif1, int calif2, int calif3, int finalscore) {
        this.area = area;
        this.name = name;
        this.schedule = schedule;
        Calif1 = calif1;
        Calif2 = calif2;
        Calif3 = calif3;
        FinalScore = finalscore;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCalif1() {
        return Calif1;
    }

    public void setCalif1(int Calif1) {
        this.Calif1 = Calif1;
    }

    public int getCalif2() {
        return Calif2;
    }

    public void setCalif2(int Calif2) {
        this.Calif2 = Calif2;
    }

    public int getCalif3() {
        return Calif3;
    }

    public void setCalif3(int Calif3) {
        this.Calif3 = Calif3;
    }

    public int getFinalScore() {
        return FinalScore;
    }

    public void setFinalScore(int finalScore) {
        this.FinalScore = finalScore;
    }
  
}
