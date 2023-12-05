package Interfaces;

public interface Move {
    default String moveFromTo (String from ,String to){
        return this.getClass().getName()+" перемещаеться из "+ from + " в "+to;
    };
    default String moveTo (String to){
        return this.getClass().getName()+" перемещаеться в "+to;
    };
    default String moveFrom (String from){
        return this.getClass().getName()+" перемещаеться из "+ from;
    };
}
