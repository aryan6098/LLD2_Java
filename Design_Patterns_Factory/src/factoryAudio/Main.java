package factoryAudio;

import factory.uifactory.AndroidUIFactory;

public class Main {
    public static void main(String[] args) {
        AudioPlayer mp3Player = AudioPlayFactory.createAudioPlayer(MediaFormat.MP3, 23, 1.0);
        mp3Player.play();
        mp3Player.play();
        mp3Player.pause();
        mp3Player.stop();
        System.out.println("MP3 Volume: " + mp3Player.getVolume());
        System.out.println("MP3 Playback Rate: " + mp3Player.getPlayBackRate());

        // Create a WAV player
        AudioPlayer wavPlayer =
                AudioPlayFactory.createAudioPlayer(
                        MediaFormat.WAV, 80, 1.25);

        wavPlayer.play();
        wavPlayer.pause();
        wavPlayer.stop();
        System.out.println("WAV Volume: " + wavPlayer.getVolume());
        System.out.println("WAV Playback Rate: " + wavPlayer.getPlayBackRate());

        System.out.println("--------------------------------");

        // Create a FLAC player
        AudioPlayer flacPlayer =
                AudioPlayFactory.createAudioPlayer(
                        MediaFormat.FLAC, 60, 0.9);

        flacPlayer.play();
        flacPlayer.pause();
        flacPlayer.stop();
        System.out.println("FLAC Volume: " + flacPlayer.getVolume());
        System.out.println("FLAC Playback Rate: " + flacPlayer.getPlayBackRate());

    }
}
