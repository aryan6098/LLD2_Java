package AbstractFactoryAudio.decoder;

import factoryAudio.MediaFormat;

public abstract class AudioDecoder {

    private final byte[] audioData;

    public AudioDecoder(byte[] audioData) {
        this.audioData = audioData;
    }

    public byte[] getAudioData(){
        return this.audioData;
    }
    public  abstract MediaFormat supportsFormat();
    public abstract byte[] decode();
}
