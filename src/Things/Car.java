package Things;

import Interfaces.Move;
import enums.Prices;

public class Car extends Thing implements Move {
    private final String engine;
    public Car(Prices price, String engine){
        super(price,"Машина");
        this.engine = engine;
    }

    public String getEngine() {
        return engine;
    }
    public void setThisBelongTo (Object other){
        super.setThisBelongTo(this.toString() + " принадлежит кому: " + other);
    }

    public String toString(){
        return "Машина с двигателем - " +  this.getEngine() + " и ценой " + this.getPrice();
    }
}
