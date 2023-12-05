package Alive;

import Other.City;
import enums.Mood;

public class Human extends Alive  {
    private Mood mood;
    private final City hometown;
    private String job = "Безработный";
    public Human(String name){
        super(name);
        this.hometown = new City("Неизвестно");
    }
    public Human(String name, City hometown){
        super(name);
        this.hometown = hometown;
    }
    public String getHometown(){
        return "Родной город - "+hometown.toString();
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getJob() {
        return job;
    }

    @Override
    public void say(String phrase) {
        System.out.println(super.getName()+" говорит: "+phrase);
    }
    public void setMood(Mood mood){
        this.mood = mood;
    }
    public String getMood(){
        return this.getName() +" - "+mood.toString();
    }
    @Override
    public String toString(){
        return this.getName();
    }

}
