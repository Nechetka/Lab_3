package Alive;

import Interfaces.BelongingToThis;
import Interfaces.Move;
import Interfaces.ThisBelonging;
import Enums.Actions;

public abstract class Alive implements ThisBelonging<Object>, BelongingToThis<Object>, Move {
    private String belongingto= "Нечейное" ;
    private String belonging= "Нечейное" ;
    private final String name;
    public Alive(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public String toString(){
        return getClass().getName()+" "+ this.getName();
    }
    public abstract void say(String x);

    public String doAction(Actions action){
        return this.toString()+" выполняет действие "+action.getAction();
    }
    public String doAction(Actions action, Object thing){
        return this.toString()+" выполняет действие "+action.getAction()+ " над " + thing.toString();
    }
    public String  doAction(Actions action,Alive obj){
       return this.toString()+" выполняет действие "+action.getAction()+ " над " + obj.getName();
    }
    @Override
    public String moveFromTo(String from, String to) {
        return getName()+" прибыть из "+from+" в "+to;
    }
    @Override
    public String moveTo (String to) {
        return getName()+" в "+to;
    }
    @Override
    public String moveFrom(String from) {
        return getName()+" прибыть из "+from;
    }
    @Override
    public void setBelongToThis(Object other) {
        belonging = other + " принадлежит кому: " + this.getName();
    }
    @Override
    public void setThisBelongTo (Object other){
        belongingto = this.getName() + " принадлежит кому: " + other;
    };
    @Override
    public String getThisBelongTo (){
        return belongingto;
    };
    @Override
    public String getBelongToThis() {
        return belonging;
    }
}
