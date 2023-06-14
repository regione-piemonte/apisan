package apisancod;

import it.csi.apisan.apisancod.util.ApisanCodUrl;

public class TestApisancod {

	public TestApisancod() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		String abilitazioneMedicoUrl = ApisanCodUrl.ABILITAZIONE.getUrlClient("AAAAAA00A11N000V", "NVDCRL46B04F839G");
		System.out.println("abilitazioneMedicoUrl: " + abilitazioneMedicoUrl);
		
		String infoUrlMedico = ApisanCodUrl.INFO_MEDICO.getUrlClient( "NVDCRL46B04F839G");
		System.out.println("infoUrlMedico: " + infoUrlMedico);
		
		String listaMessaggi = ApisanCodUrl.LISTA_MESSAGGI.getUrlClient("AAAAAA00A11N000V", "2");
		System.out.println("listaMessaggi: " + listaMessaggi);		

	}

}
