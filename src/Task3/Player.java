package Task3;

public class Player implements Playable, Recordable{
    @Override
    public void play() {
        System.out.println("Song is playing");
    }

    @Override
    public void pause() {
        System.out.println("Song is paused");
    }

    @Override
    public void stop() {
        System.out.println("Song is stopped");
    }

    @Override
    public void record() {
        System.out.println("Song is recording");
    }

    @Override
    public void recordPause() {
        System.out.println("Song recording is paused");
    }

    @Override
    public void recordStop() {
        System.out.println("Song recording is stopped");
    }
}
