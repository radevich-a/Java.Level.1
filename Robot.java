public class Robot implements Player {
    int maxHeight = 0;
    int maxLength = 20;

    public Robot() {

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
        System.out.println("Robot run!");
        return null;
    }

    @Override
    public Player jump() {
        System.out.println("Robot jump!");
        return null;
    }

}
