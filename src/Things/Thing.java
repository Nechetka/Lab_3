package Things;

import Alive.Alive;
import Interfaces.ThisBelonging;
import Enums.Prices;

public abstract class Thing implements ThisBelonging<Object>{
    private final Prices price;
    private final String name;
    public Thing (Prices price, String name) {
        this.price = price;
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public String getPrice() {
        return price.getPrices();
    }

    private String belonging= "Нечейное" ;
    public void setThisBelongTo (Object other){
        belonging = this.getName() + " принадлежит чему: " + other;
    }
    protected void setThisBelongTo (String other){
        belonging = other;
    }
    public void setThisBelongTo (Alive other){
        belonging = this.getName() + " принадлежит кому: " + other.getName();
    }

    public String getThisBelongTo (){
        return belonging;
    }
    public String toString(){
        return this.getPrice()+" "+ this.getName();
    }
}
