public class People implements Player {
    private int maxHeight = 1;
    private int maxLength = 10;

    public People() {

    }

    @Override
    public int getMaxLength() {
        return maxLength;
    }

    @Override
    public int getMaxHeight() {
        return maxHeight;
    }

    @Override
    public Player run() {
        System.out.println("People run!");
        return null;
    }

    @Override
    public Player jump() {
        System.out.println("People jump!");
        return null;
    }

}
