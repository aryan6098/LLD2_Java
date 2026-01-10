package AbstractFactoryAudio;

import AbstractFactoryAudio.decoder.AudioDecoder;
import AbstractFactoryAudio.decoder.MP3Decoder;
import AbstractFactoryAudio.player.AudioPlayer;
import AbstractFactoryAudio.player.MP3Player;
import AbstractFactoryAudio.processor.AudioProcessor;
import AbstractFactoryAudio.processor.MP3AudioProcessor;

public class MP3AudioFactory extends AudioFactory{
    @Override
    public MediaFormat supportFormat() {
        return MediaFormat.MP3;
    }

    @Override
    public AudioDecoder createAudioDecoder(byte[] audioData) {
        return new MP3Decoder(audioData);
    }

    @Override
    public AudioPlayer createAudioPlayer(int volume, double playbackRate) {
        return new MP3Player(volume, playbackRate);
    }

    @Override
    public AudioProcessor createProcessor(byte[] audioData) {
        return new MP3AudioProcessor(audioData);
    }
}
