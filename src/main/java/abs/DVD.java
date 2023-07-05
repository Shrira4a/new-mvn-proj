package abs;

public class DVD extends Player implements Playable,Test
{

    @Override
    public void play() {
        System.out.println("Start playing DVD disk....");
    }

    @Override
    public void play(int numberOfSong) {

    }

    @Override
    public void stop() {
        System.out.println("Stop playing DVD disk....");

    }

    @Override
    public void test() {

    }
}
