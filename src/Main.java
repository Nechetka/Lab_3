import Alive.*;
import Other.*;
import Things.*;
import Enums.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        var city = new City("Город");
        var Krabs = new Human("Крабс");
        var Skuper = new Human("Скуперфильд",new City("Брехенвиль"));
        Skuper.setJob("скупец");
        Skuper.setMood(Mood.HAPPY);
        var someone = new Human("Unknow");
        var someone2 = new Human("Unknow evil");
        var Goats = new Band("Козлы");
        var cilinder = new Cylinder(Prices.UNKNOWN);
        cilinder.setThisBelongTo(Skuper);
        Goats.addName(Skuper); Goats.addName(someone);
        var They = new Band("Они");
        They.addName(Krabs); They.addName(Skuper);
        var Posl = new Consequence(Prices.UNKNOWN);
        Posl.setThisBelongTo(Krabs);
        var Letter = new Message(Krabs.getName(),"неизвестен");
        var car = new Car(Prices.LUXURIOUS,"восьмицилиндровый");
        car.setThisBelongTo(Krabs);
        var onecase = new Case(Prices.PROFITABLE);
        var fullText = new Message("MP","IFR");

        Letter.addText("Надо сделать: " +someone2.doAction(Actions.KILL, Goats));
        Letter.addText(Skuper.getHometown()+" "+Skuper.getJob()+" "+Skuper.doAction(Actions.RIDE)+" в "+city);
        Letter.addText("НЕ "+Posl.getThisBelongTo());
        fullText.addText(Letter.showFullLetter());
        fullText.addText(Skuper.doAction(Actions.WEAR, cilinder) + ". "+ cilinder.getThisBelongTo());
        fullText.addText("Через 5 минут "+They.doAction(Actions.RIDE,car));
        fullText.addText(car.getThisBelongTo());
        fullText.addText(Skuper.getMood()); ;
        fullText.addText(Skuper.doAction(Actions.JOY)+" так как "+Prices.FREE.getPrices()+" "+Skuper.doAction(Actions.RIDE, car));
        fullText.addText("И "+ Prices.FREE.getPrices()+" "+Skuper.doAction(Actions.EAT) +" (в будущем)" );
        fullText.addText("И "+Skuper.doAction(Actions.TALK, onecase)+" (в будущем)" );

        System.out.println(fullText.showOlyFullText());

    }
}