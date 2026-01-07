package factoryAudio;

public class FLACPlayer extends AudioPlayer{

    private int volume;
    private double playBackRate;

    public FLACPlayer(int volume, double playBackRate) {
        super(volume, playBackRate);
    }

    @Override
    public void play() {
        System.out.println("Playing FLAC audio");
    }

    @Override
    public void pause() {
        System.out.println("Pausing FLAC audio");
    }

    @Override
    public void stop() {
        System.out.println("Stopping FLAC audio");
    }

    @Override
    public MediaFormat supportType() {
        return MediaFormat.FLAC;
    }
}
