public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }
    public void info(){
        System.out.println("plate: " + food);
    }
    public boolean decreaseFood(int n){
        boolean isEat = false;
        if ((food - n) >= 0){
            food -=n;
            isEat = true;
        }
        return isEat;
    }
    public void addFood(int food){
        this.food = +food;
    }
}
