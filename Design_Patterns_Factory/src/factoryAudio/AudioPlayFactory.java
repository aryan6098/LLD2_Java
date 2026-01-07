package factoryAudio;

public class AudioPlayFactory {

    public static AudioPlayer createAudioPlayer(MediaFormat mediaFormat, int volume, Double playBackRate) {
        switch (mediaFormat) {
            case MP3:
                return new MP3Player(volume, playBackRate);
            case WAV:
                return new WAVPlayer(volume, playBackRate);
            case FLAC:
                return new FLACPlayer(volume, playBackRate);
            default:
                throw new IllegalArgumentException(
                        "Unsupported media format: " + mediaFormat
                );
        }
    }
}
