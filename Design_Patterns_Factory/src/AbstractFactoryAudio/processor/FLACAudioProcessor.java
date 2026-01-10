package AbstractFactoryAudio.processor;

import AbstractFactoryAudio.MediaFormat;

public class FLACAudioProcessor extends AudioProcessor{
    public FLACAudioProcessor(byte[] audioData) {
        super(audioData);
    }

    @Override
    public MediaFormat supportsFormat() {
        return MediaFormat.FLAC;
    }

    @Override
    public byte[] process() {
        System.out.println("Processing FLAC audio data...");
        // Processing process
        return getAudioData();
    }
}
