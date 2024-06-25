package Decorator.code;


/*
    要让CondimentDecorator类能够取代Beverage，
    所以将CondimentDecorator继承自Beverage类
 */
public abstract class CondimentDecorator extends Beverage{
    public abstract String getDescription();
}
