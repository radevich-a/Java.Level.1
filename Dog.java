public class Dog extends Animal{


    public Dog(String name, int appetite) {
        super(name, appetite);
    }


    @Override
    protected void setHunger(boolean isEat) {
        isHunger = isEat;
    }


    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }
}
