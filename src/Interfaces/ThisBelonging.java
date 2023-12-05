package Interfaces;

public interface ThisBelonging<Something>{
    String belonging= "Нечейное" ;
    void setThisBelongTo (Something other);

    default String getThisBelongTo (){
        return belonging;
    };

}
