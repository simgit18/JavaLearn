package Classes;

public class Animals {
    private String name;
    private int legs;
    private int brain;
    private int body;
    private int size;
    private int weight;

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public void setBrain(int brain) {
        this.brain = brain;
    }

    public void setBody(int body) {
        this.body = body;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getLegs() {
        return legs;
    }

    public int getBrain() {
        return brain;
    }

    public int getBody() {
        return body;
    }

    public int getSize() {
        return size;
    }

    public int getWeight() {
        return weight;
    }

    public Animals(String name, int legs, int brain, int body, int size, int weight) {
        this.name = name;
        this.legs = legs;
        this.brain = brain;
        this.body = body;
        this.size = size;
        this.weight = weight;
    }

    public void eat(){
        System.out.println(this.name+" is eating");
    }
}
