package factoryAudio;

public class WAVPlayer extends AudioPlayer{

    private int volume;
    private double playBackRate;

    public WAVPlayer(int volume, double playBackRate) {
        super(volume, playBackRate);
    }

    @Override
    public void play() {
        System.out.println("Playing WAV audio");
    }

    @Override
    public void pause() {
        System.out.println("Pausing WAV audio");
    }

    @Override
    public void stop() {
        System.out.println("Stopping WAV audio");
    }

    @Override
    public MediaFormat supportType() {
        return MediaFormat.WAV;
    }
}
