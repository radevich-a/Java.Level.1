public abstract class Animal {
    protected String name;
    protected int appetite;
    protected boolean isHunger;

    public Animal(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.isHunger = false;
    }

    protected abstract void setHunger(boolean isHunger);


    public void eat(Plate plate){
        boolean isEat = (plate.decreaseFood(appetite));
        setHunger(isEat);
    }

    public boolean getInfoHunger() {
        System.out.println(name+" "+ isHunger);
        return isHunger;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                '}';
    }
}
