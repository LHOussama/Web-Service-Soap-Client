package ma.enset;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
@WebService(serviceName = "BanqueWs")
public class BanqueService {
    @WebMethod(operationName = "convertoToEuro")
    public double conversion(@WebParam double montant){
        return montant*10;
    }
    @WebMethod()
    public Compte getCompte(@WebParam(name = "code") long id){
        return  new Compte(id,Math.random()*100, new Date());
    }
    @WebMethod()
    public List<Compte> compteList(){
        return  List.of(
                new Compte(1,Math.random()*100, new Date()),
                new Compte(2,Math.random()*100, new Date()),
                new Compte(3,Math.random()*100, new Date())
        );
    }
}
