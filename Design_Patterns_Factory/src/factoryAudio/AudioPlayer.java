package factoryAudio;

public abstract class AudioPlayer {

    protected int volume;
    protected double playBackRate;

    public AudioPlayer(int volume, double playBackRate) {
        this.volume = volume;
        this.playBackRate = playBackRate;
    }

    public int getVolume() {
        return this.volume;
    }
    public double getPlayBackRate() {
        return this.playBackRate;
    }
    public void setVolume(int volume) {
        if(volume >= 0 && volume <= 100) {
            this.volume = volume;
            System.out.println("Volume set to "+ volume);
        }else {
            System.out.println("Invalid volume level");
        }
    }

    public abstract void play();
    public abstract void pause();
    public abstract void stop();

    public abstract MediaFormat supportType();
}
