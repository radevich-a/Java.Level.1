public class Main {
    public static void main(String[] args) {


        Barrier[] barriers = {new RunningTrack(), new Wall()};
        Player[] players = {new Cat(), new Robot(), new People()};

        for (int i = 0; i < players.length; i++) {
                barriers[0].doJump(players[i].jump());
                barriers[1].doRun(players[i].run());
        }

    }
}
