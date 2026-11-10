import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class WebServer {

    private int port;
    private PageProvider pageProvider;

    public WebServer(int port, PageProvider pageProvider) {

        this.port = port;
        this.pageProvider = pageProvider;

    }

    public void start() {

        try (ServerSocket serverSocket = new ServerSocket(port)) {

            System.out.println("Sunucu başlatıldı!");
            System.out.println("Port: " + port);
            System.out.println("http://localhost:" + port);

            while (true) {

                Socket clientSocket = serverSocket.accept();

                System.out.println("Yeni istemci bağlandı!");

                ClientHandler handler =
                        new ClientHandler(clientSocket, pageProvider);

                handler.handle();

            }

        } catch (IOException e) {

            System.out.println("Sunucu hatası: " + e.getMessage());

        }
    }
}