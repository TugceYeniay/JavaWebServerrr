public class Main {

    public static void main(String[] args) {

        PageProvider page = new HtmlPage();

        WebServer server = new WebServer(1989, page);

        server.start();

    }
}