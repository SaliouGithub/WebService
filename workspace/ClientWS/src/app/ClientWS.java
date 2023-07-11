package app;

import java.util.List;
import service.BanqueService;
import service.BanqueWS;
import service.Compte;
public class ClientWS {
	public static void main(String[] args) {
		BanqueService stub=new BanqueWS().getBanqueServicePort();
		System.out.println("Conversion");
		System.out.println(stub.conversionEuroToDh(9000));
		System.out.println("Consulter un compte");
		Compte cp=stub.getCompte(2L);
		System.out.println("Solde="+cp.getSolde());
		System.out.println("Liste des comptes");
		List<Compte> cptes=stub.getComptes();
		for(Compte c:cptes){
		System.out.println(c.getCode()+"----"+c.getSolde());
		}
	}
}
