public class Principal {

    public static void main(String[] args) {
        Cancion reproductor = new Cancion("Baby hotline - Jack Stauber.wav");
        reproductor.start();

        // Agregar aquí cualquier otra tarea que se desee ejecutar mientras se reproduce la música
        System.out.println("Reproduciendo música...\n");

        LectorDeLetra lector = new LectorDeLetra("C:\\Users\\nerrg\\Downloads\\Tarea\\letra.txt");
        lector.start();

        Curl hilo = new Curl();
        hilo.start();

        String url = "https://www.youtube.com/shorts/RRrR2OlTxGc";
        AbrirPaginaWeb hiloWeb = new AbrirPaginaWeb(url);
        hiloWeb.start();

    }

}
