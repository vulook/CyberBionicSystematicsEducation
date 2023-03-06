package homework016;

/**
 * FileName: Task03
 * Author:   Andriy Vulook
 * Date:     02.03.2023 16:28
 * Description: Playable and Recordable interfaces for SimpleAudioPlayer
 */

interface Playable {
    void play();

    void pause();

    void stop();
}

interface Recordable {
    void record();

    void pause();

    void stop();
}

class SimpleAudioPlayer implements Playable, Recordable {

    private boolean activated;

    public SimpleAudioPlayer() {
        activated = false;
    }

    public void activate() {
        activated = true;
        System.out.println("Player activated");
    }

    public void deactivate() {
        activated = false;
        System.out.println("Player deactivated");
    }

    @Override
    public void play() {
        if (!activated) {
            System.out.println("Player inactive");
            return;
        }

        System.out.println("=> playback");
    }

    @Override
    public void record() {
        if (!activated) {
            System.out.println("Player inactive");
            return;
        }

        System.out.println("=> recording");
    }

    @Override
    public void pause() {
        if (!activated) {
            System.out.println("Player inactive");
            return;
        }

        System.out.println("Pause");
    }

    @Override
    public void stop() {
        if (!activated) {
            System.out.println("Player inactive");
            return;
        }

        System.out.println("Stop");
    }

}

public class Task03 {

    public static void main(String[] args) {

        SimpleAudioPlayer player = new SimpleAudioPlayer();

        player.activate();
        player.play();
        player.pause();
        player.play();
        player.stop();

        player.record();
        player.pause();
        player.record();
        player.stop();
        player.deactivate();

        //when Player deactivated
        player.play();
        player.pause();
        player.play();
        player.stop();

    }

}
