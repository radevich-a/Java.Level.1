public class Wall extends Barrier{
    int height = 1;

    public void doJump(Player player){
        boolean isJump = false;
        System.out.println("Jumping finish: "+ isJump);
    }

    @Override
    public void doRun(Player player) {
        boolean isRun = false;
        System.out.println("Running finish: "+ isRun);
    }
}
