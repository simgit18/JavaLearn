package javaClasses.src.Classes;

public class Dog extends Animals{

    private int eyes;
    private int tail;
    private int teeth;
    private String coat;

    public Dog(String name, int legs, int brain, int body, int size, int weight, int eyes, int tail, int teeth,String coat) {
        super(name,legs, 1, 1, size, weight);
        this.coat = coat;
        this.eyes = eyes;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    @Override
    public void eat(){
        super.eat();
    }
}
