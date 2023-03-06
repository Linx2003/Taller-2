import java.nio.file.Files;
import java.nio.file.Paths;

public class LectorDeLetra extends Thread {

    private String rutaLetra;

    public LectorDeLetra(String rutaLetra) {
        this.rutaLetra = rutaLetra;
    }

    @Override
    public void run() {
        try {
            String contenido = new String(Files.readAllBytes(Paths.get(rutaLetra)));
            System.out.println(contenido);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
