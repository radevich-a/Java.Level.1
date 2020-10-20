public class RunningTrack extends Barrier{

    int length = 1;

    public void doRun(Player player){

        boolean isRun = false;
        if (player.getMaxLength() > length) {isRun = true;}
        System.out.println("Running finish: "+ isRun);
    }

    @Override
    public void doJump(Player player) {
        boolean isJump = false;
        if (player.getMaxHeight() > length) {isJump = true;}
        System.out.println("Jumping finish: "+ isJump);
    }
}
