package Dependency_Injection_Design_Another_Example;

public class CarImpl implements Car{
    private int speed;
    private String name;

    public CarImpl(int speed, String name) {
        this.speed = speed;
        this.name = name;
     }
     //setters & getters

    @Override
    public int getSpeed() {
        return speed;
    }
    @Override
    public String getName() {
        return name;
    }
}

