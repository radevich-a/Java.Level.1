public class Cat implements Player {
    int maxHeight = 2;
    int maxLength = 2;

    public Cat() {

    }

    @Override
    public int getMaxHeight() {
        return maxHeight;
    }

    @Override
    public int getMaxLength() {
        return maxLength;
    }

    @Override
    public Player run() {
        System.out.println("Cat run!");
        return null;
    }

    @Override
    public Player jump() {
        System.out.println("Cat jump!");
        return null;
    }

}
