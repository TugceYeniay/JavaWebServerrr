import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class ClientHandler {

    private Socket clientSocket;
    private PageProvider pageProvider;

    public ClientHandler(Socket clientSocket, PageProvider pageProvider) {

        this.clientSocket = clientSocket;
        this.pageProvider = pageProvider;

    }

    public void handle() throws IOException {

        try (Socket socket = clientSocket;
             BufferedReader reader = new BufferedReader(
                     new InputStreamReader(
                             socket.getInputStream(),
                             StandardCharsets.UTF_8))) {

            String requestLine = reader.readLine();

            System.out.println("Gelen istek: " + requestLine);

            String line;

            while ((line = reader.readLine()) != null && !line.isEmpty()) {
                System.out.println(line);
            }

            String html = pageProvider.getHtml();

            HttpResponse response = new HttpResponse();

            response.send(socket, html);

        }
    }
}