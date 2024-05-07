package ma.enset;
import jakarta.xml.ws.Endpoint;
public class ServerJwx {
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:9090/",new BanqueService());
        System.out.println("Start");

    }
}
