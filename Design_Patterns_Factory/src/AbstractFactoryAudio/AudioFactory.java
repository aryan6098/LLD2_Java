package AbstractFactoryAudio;

import AbstractFactoryAudio.decoder.AudioDecoder;
import AbstractFactoryAudio.player.AudioPlayer;
import AbstractFactoryAudio.processor.AudioProcessor;

public abstract class AudioFactory {

    public abstract MediaFormat supportFormat();

    public abstract AudioDecoder createAudioDecoder(byte[] audioData);
    public abstract AudioPlayer createAudioPlayer(int volume, double playbackRate);
    public abstract AudioProcessor createProcessor(byte[] audioData);
}
