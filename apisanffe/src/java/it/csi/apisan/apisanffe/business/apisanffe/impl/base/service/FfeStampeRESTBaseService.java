/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanffe.business.apisanffe.impl.base.service;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import it.csi.apisan.apisanffe.business.apisanffe.impl.base.FfeDelegheRESTBaseService;
import it.csi.gpr.LMSDettPraticaRicevutaType;
import it.csi.gpr.LMSGetRicevutaResponse;
import it.csi.gpr.LMSPraticaRicevutaType;
import it.csi.gpr.LMSRicevutaDettPraticaRicevutaType;

public abstract class FfeStampeRESTBaseService extends FfeDelegheRESTBaseService {

	public FfeStampeRESTBaseService(SecurityContext securityContext, HttpHeaders httpHeaders,
			HttpServletRequest httpRequest) {
		super(securityContext, httpHeaders, httpRequest);
		
	}

	protected boolean valorizzatoRicevutaStampaAsr(LMSPraticaRicevutaType pratica) {
		return (pratica.getELENCORICEVUTESTAMPAASR() != null && (
				(pratica.getELENCORICEVUTESTAMPAASR().getRIMBORSO() != null &&
				!pratica.getELENCORICEVUTESTAMPAASR().getRIMBORSO().isEmpty()) 
				|| (pratica.getELENCORICEVUTESTAMPAASR().getRICEVUTA() != null && ! pratica.getELENCORICEVUTESTAMPAASR().getRICEVUTA().isEmpty())
				)
				); 
	}
	
	protected boolean valorizzatoRicevuteTelematiche(LMSPraticaRicevutaType pratica) {
		return (pratica.getELENCORICEVUTETELEMATICHE() != null && 
				pratica.getELENCORICEVUTETELEMATICHE().getRICEVUTA() != null &&
				!pratica.getELENCORICEVUTETELEMATICHE().getRICEVUTA().isEmpty() );
	}
	
	protected boolean valorizzatoEsitiPagamento(LMSPraticaRicevutaType pratica) {
		return (pratica.getELENCOESITIPAGAMENTO() != null && 
				pratica.getELENCOESITIPAGAMENTO().getESITO() != null &&
				!pratica.getELENCOESITIPAGAMENTO().getESITO().isEmpty() );		
	}
	
	protected boolean valorizzatoRicevuteCortesia(LMSPraticaRicevutaType pratica) {
		return (pratica.getELENCORICEVUTECORTESIA() != null && (
				(pratica.getELENCORICEVUTECORTESIA().getRIMBORSO() != null &&
				!pratica.getELENCORICEVUTECORTESIA().getRIMBORSO().isEmpty()) 
				|| (pratica.getELENCORICEVUTECORTESIA().getRICEVUTA() != null && ! pratica.getELENCORICEVUTECORTESIA().getRICEVUTA().isEmpty())
				)
				); 
	}
	
	protected boolean valorizzatoRicevuteStampaRegionale(LMSPraticaRicevutaType pratica) {
		return (pratica.getELENCORICEVUTESTAMPAREGIONALE() != null && (
				(pratica.getELENCORICEVUTESTAMPAREGIONALE().getRIMBORSO() != null &&
				!pratica.getELENCORICEVUTESTAMPAREGIONALE().getRIMBORSO().isEmpty()) 
				|| (pratica.getELENCORICEVUTESTAMPAREGIONALE().getRICEVUTA() != null && ! pratica.getELENCORICEVUTESTAMPAREGIONALE().getRICEVUTA().isEmpty())
				)
				); 
	}
	
	
	
	protected boolean isNotEmptyRicevutaStampaAsrRimborso(LMSPraticaRicevutaType pratica) {
		return (pratica.getELENCORICEVUTESTAMPAASR() != null &&
				pratica.getELENCORICEVUTESTAMPAASR().getRIMBORSO() != null &&
				!pratica.getELENCORICEVUTESTAMPAASR().getRIMBORSO().isEmpty()); 
	}
	
	protected boolean isNotEmptyRicevuteCortesiaRimborso(LMSPraticaRicevutaType pratica) {
		return (pratica.getELENCORICEVUTECORTESIA() != null &&
				pratica.getELENCORICEVUTECORTESIA().getRIMBORSO() != null &&
				!pratica.getELENCORICEVUTECORTESIA().getRIMBORSO().isEmpty()); 	
	}
	
	
	protected boolean isResponseNotNull(LMSGetRicevutaResponse res) {
		return (res.getRISPOSTA() != null && res.getRISPOSTA().getPRATICA() != null);
	}
	
	
	protected boolean isRicevutaFromDettpraticaType(LMSDettPraticaRicevutaType praticaType) {
		return praticaType.getRICEVUTA() != null && praticaType.getRICEVUTA().size() > 0; 
	}

	
}
