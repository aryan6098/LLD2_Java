package AbstractFactoryAudio;

import AbstractFactoryAudio.decoder.AudioDecoder;
import AbstractFactoryAudio.player.AudioPlayer;
import AbstractFactoryAudio.processor.AudioProcessor;

public class Main {
    public static void main(String[] args) {
        byte[] audioData = new byte[]{1, 2, 3, 4, 5};

        AudioFactory factory = new MP3AudioFactory();
        AudioDecoder audioDecoder = factory.createAudioDecoder(audioData);
        AudioProcessor processor = factory.createProcessor(audioData);
        AudioPlayer player = factory.createAudioPlayer(75, 1.0);

        System.out.println("Audio Format: " + factory.supportFormat());
        System.out.println( audioDecoder.getAudioData());
        System.out.println(player.getPlaybackRate());

    }
}
