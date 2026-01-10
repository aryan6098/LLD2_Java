package AbstractFactoryAudio;

import AbstractFactoryAudio.decoder.AudioDecoder;
import AbstractFactoryAudio.decoder.FLACDecoder;
import AbstractFactoryAudio.player.AudioPlayer;
import AbstractFactoryAudio.player.FLACPlayer;
import AbstractFactoryAudio.processor.AudioProcessor;
import AbstractFactoryAudio.processor.FLACAudioProcessor;

public class FLACAudioFactory extends AudioFactory{
    @Override
    public MediaFormat supportFormat() {
        return MediaFormat.FLAC;
    }

    @Override
    public AudioDecoder createAudioDecoder(byte[] audioData) {
        return new FLACDecoder(audioData);
    }

    @Override
    public AudioPlayer createAudioPlayer(int volume, double playbackRate) {
        return new FLACPlayer(volume, playbackRate);
    }

    @Override
    public AudioProcessor createProcessor(byte[] audioData) {
        return new  FLACAudioProcessor(audioData);
    }
}
