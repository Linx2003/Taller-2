import java.awt.Desktop;
import java.net.URI;

public class AbrirPaginaWeb extends Thread {
    private String url;

    public AbrirPaginaWeb(String url) {
        this.url = url;
    }

    @Override
    public void run() {
        try {
            Desktop desktop = Desktop.getDesktop();
            URI uri = new URI(url);
            desktop.browse(uri);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}