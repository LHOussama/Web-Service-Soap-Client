package ma.enset;
import proxy.BanqueService;
import proxy.BanqueWs;
import proxy.Compte;
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class ClientSoap {
    public static void main(String[] args) {
        //stub
        BanqueService banqueService=new BanqueWs().getBanqueServicePort();
        System.out.println(banqueService.convertoToEuro(123));
        Compte compte=banqueService.getCompte(1);
        System.out.println(compte.toString());
    }
}