/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanesenpat.middleware;

import it.csi.apisan.apisanesenpat.middleware.exceptions.MiddlewareException;
import it.csi.apisan.apisanesenpat.util.LogUtil;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.OutputStream;

import static it.csi.apisan.apisanesenpat.util.Chain.CHAIN_OK;

public class ProcessPDFMiddleware extends BaseMiddleware {
    protected static LogUtil log = new LogUtil(ProcessPDFMiddleware.class);

    public ProcessPDFMiddleware(MiddlewareInvocation middlewareInvocation) {
        super(middlewareInvocation);
    }

    @Override
    boolean executeMiddleware() throws MiddlewareException {
        HttpServletRequest  httpServletRequest  = this.middlewareInvocation.getServletRequest();
        HttpServletResponse httpServletResponse = this.middlewareInvocation.getServletResponse();

        //TODO prelevare dalla response entity il body (!=null) controllare la presenza della proprietà "documentazione allegata".
        //Se contiene il PDF l'oggetto stringa deve essere mappata in JSON. Dal JSON prendere proprietà del docuemnto e generarlo in pdf
        //(genera un output stream. Prenderlo e rigirarlo alla servlet. Dare contentype tipo PDF e nome file documento.pdf
        //(genera base 64, mettere in servlet responce, contentype application pdf in apisanvac "stampaPromemoria")
        //
        //creare nuovo elemento della chain che chiude->
        /*servletResponse.getWriter().write((String) response.getBody());
            servletResponse.getWriter().flush();
            servletResponse.getWriter().close();*/

        /* Execute Call To Service Appuntamento */
        /* Invocazione con REST Template */


        byte[] streamPDF = null;


        /* Response */
        try {

            if (middlewareInvocation.getIsPdf()) {
                String nameOutput = this.middlewareInvocation.getSettingFileNameToDownload();

                httpServletResponse.setHeader("Content-Type", "application/pdf");
                
                httpServletResponse.setHeader("Content-Disposition", this.middlewareInvocation.getHeaderResponseGiallo("Content-Disposition"));

                OutputStream output = httpServletResponse.getOutputStream();
                output.write(this.middlewareInvocation.getResponseAsByte().getBody());
                output.close();

                this.middlewareInvocation.setStreamClosed(true);

            }

            if (middlewareInvocation.isZip()) {
                String nameOutput = this.middlewareInvocation.getSettingFileNameZipToDownload();

              httpServletResponse.setHeader("Content-Type", "application/zip");
              httpServletResponse.setHeader("Content-Disposition", this.middlewareInvocation.getHeaderResponseGiallo("Content-Disposition"));
//              httpServletResponse.setHeader("Content-Disposition", "attachment; filename=" + nameOutput);

              OutputStream output = httpServletResponse.getOutputStream();
              output.write(this.middlewareInvocation.getResponseAsByte().getBody());
              output.close();

              this.middlewareInvocation.setStreamClosed(true);

          }

        } catch (Exception e) {
            log.error("ProcessPDFMiddleware", e.getMessage());
            throw new MiddlewareException("Errore durante la creazione del PDF", e.getCause());
        }


        return CHAIN_OK;
    }
}
