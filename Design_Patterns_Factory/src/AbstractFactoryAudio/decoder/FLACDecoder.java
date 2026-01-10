package AbstractFactoryAudio.decoder;

import factoryAudio.MediaFormat;

public class FLACDecoder extends AudioDecoder{
    public FLACDecoder(byte[] audioData) {
        super(audioData);
    }

    @Override
    public MediaFormat supportsFormat() {
        return MediaFormat.FLAC;
    }

    @Override
    public byte[] decode() {
        System.out.println("Decoding FLAC audio data...");
        // Decoding process
        return getAudioData();
    }
}
