package Decorator.code;

/*
    Beverage是一个抽象类，有两个方法
    getDescription()
    cost()
 */
public abstract class Beverage {
    public String description = "Unknown Beverage";

    //getDescription()已经实现了，但是cost()必须在子类中实现
    public String getDescription(){
        return this.description;
    }

    public abstract double cost();
}
