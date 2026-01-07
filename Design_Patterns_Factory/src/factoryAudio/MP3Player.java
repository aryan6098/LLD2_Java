package factoryAudio;

public class MP3Player extends AudioPlayer{
    private int volume;
    private double playBackRate;
    public MP3Player(int volume, double playBackRate) {
        super(volume, playBackRate);
    }

    @Override
    public void play() {
        System.out.println("Playing MP3 audio");
    }

    @Override
    public void pause() {
        System.out.println("Pausing MP3 audio");
    }

    @Override
    public void stop() {
        System.out.println("Stopping MP3 audio");
    }

//    public int getVolume() {
//        return volume;
//    }
//
//    public double getPlayBackRate() {
//        return playBackRate;
//    }

    @Override
    public MediaFormat supportType() {
        return MediaFormat.MP3;
    }
}
