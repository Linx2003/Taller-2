import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;


public class Cancion extends Thread {

    private String nombreArchivo; 
    
    public Cancion(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    @Override
    public void run() {
        try {
            File archivo = new File(nombreArchivo);
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(archivo);
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();

            // Esperar a que la canción termine antes de salir del hilo
            while (!clip.isRunning()) {
                Thread.sleep(10);
            }
            while (clip.isRunning()) {
                Thread.sleep(10);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
