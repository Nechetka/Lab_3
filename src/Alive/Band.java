package Alive;

import java.util.ArrayList;

public class Band extends Alive{
    private ArrayList<Alive> inBand = new ArrayList<>();

    private String codename = null;
    public Band(String name) {
        super(name);
        codename = name;
    }
    public void setCodename(String codename) {
        this.codename = codename;
    }
    public String getCodename() {
        return codename;
    }
    public void addName(Alive newInBand) {
        this.inBand.add(newInBand);
    }

    public String getAllNames() {
        String x = "";
        for (Alive name : inBand) {
            x = x+name.getName()+", ";
        }
        return x.substring(0,x.length()-2);
    }

    @Override
    public int hashCode(){
        int x = 0;
        for (Alive person : inBand)
            x+=inBand.hashCode();
        return x;
    }

    @Override
    public boolean equals(Object otherObj){
        if (this == otherObj) return true;
        if (otherObj == null || getClass() != otherObj.getClass()) return false;
        Band other = (Band) otherObj;
        return this.hashCode() == other.hashCode();
    }

    @Override
    public String toString(){
        return this.getCodename()+": '"+this.getAllNames()+"'";
    }

    @Override
    public void say(String phrase) {
            System.out.println(getCodename() + " говорят: " + phrase);
    }
}
