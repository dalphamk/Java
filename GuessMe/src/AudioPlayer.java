import javax.sound.sampled.*;
import java.io.File;
public class AudioPlayer {
    // attributs
    public Clip clip = null;

    // joue la musique se trouvant dans le chemin specifie
    public void playMusic(String filepath) {
        try {
            File musicPath = new File(filepath);

            if (musicPath.exists()) {
                AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicPath);
                clip = AudioSystem.getClip();
                clip.open(audioInput);
                FloatControl gainControl = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
                gainControl.setValue(-10.0f); // Lower volume
                clip.start();
                clip.loop(Clip.LOOP_CONTINUOUSLY); // Loop the clip indefinitely

            } else {
                System.out.println("Le fichier n'existe pas");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    // stoppe la musique
    public void stopMusic() {
        if (clip != null && clip.isRunning()) {
            clip.stop();
        }
    }
}
