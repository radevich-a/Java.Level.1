public class Cat extends Animal{

    public Cat(String name, int appetite) {
        super(name, appetite);
        isHunger = false;
    }


    @Override
    protected void setHunger(boolean isEat) {
        isHunger = isEat;

    }


    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}
