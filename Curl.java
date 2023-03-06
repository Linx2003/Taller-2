import java.io.IOException;

public class Curl extends Thread { 
    @Override
    public void run() {
        try {
            ProcessBuilder pb = new ProcessBuilder("cmd.exe", "/c", "start cmd.exe /k curl parrot.live");
            pb.inheritIO();
            pb.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
