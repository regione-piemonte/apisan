/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanpresc.report;

import com.lowagie.text.pdf.Barcode;
import com.lowagie.text.pdf.Barcode39;
import com.lowagie.text.pdf.BarcodeEAN;
import it.csi.apisan.apisanpresc.util.LogUtil;
import it.csi.apisan.apisanpresc.util.NREUtils;
import org.apache.batik.ext.awt.geom.Linear;
import org.krysalis.barcode4j.BarcodeGenerator;
import org.krysalis.barcode4j.BarcodeUtil;
import org.krysalis.barcode4j.HumanReadablePlacement;
import org.krysalis.barcode4j.impl.code39.Code39Bean;
import org.krysalis.barcode4j.impl.int2of5.Interleaved2Of5Bean;
import org.krysalis.barcode4j.output.bitmap.BitmapCanvasProvider;
import org.krysalis.barcode4j.output.bitmap.BitmapEncoder;
import org.krysalis.barcode4j.output.bitmap.BitmapEncoderRegistry;
import org.krysalis.barcode4j.tools.MimeTypes;
import org.krysalis.barcode4j.tools.UnitConv;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;

public class Barcode39Custom {

    private static LogUtil _log = new LogUtil(NREUtils.class);

    private static final int DEFAULT_DPI_BARCODE = 200;

    public static byte[] generateBarcode39(String textMessageToEncode) {

        ByteArrayOutputStream baos = null;

        try {

            baos = new ByteArrayOutputStream();
/*
            *//* Impostazioni Codice *//*
            Code39Bean code39Bean = new Code39Bean();
            //code39Bean.setModuleWidth(UnitConv.in2mm(2.0f / DEFAULT_DPI_BARCODE));
            //code39Bean.setBarHeight(8.0D);
            code39Bean.setWideFactor(9.0D);
            code39Bean.setExtendedCharSetEnabled(false);
            code39Bean.doQuietZone(true);
            code39Bean.setQuietZone(0);
            code39Bean.setMsgPosition(HumanReadablePlacement.HRP_NONE);

            *//* Impostazione canvas *//*
            String mime = MimeTypes.MIME_JPEG;
            baos = new ByteArrayOutputStream();
            BitmapCanvasProvider canvasProvider = new BitmapCanvasProvider(baos, mime, DEFAULT_DPI_BARCODE, BufferedImage.TYPE_BYTE_BINARY, true, 0);
            code39Bean.generateBarcode(canvasProvider, textMessageToEncode);
            canvasProvider.finish();

            *//* Genera barcode *//*
            final BitmapEncoder encoder = BitmapEncoderRegistry.getInstance(mime);
            encoder.encode(canvasProvider.getBufferedImage(), baos, mime, DEFAULT_DPI_BARCODE);*/

            Code39Bean bean39 = new Code39Bean();
            //bean39.setModuleWidth(UnitConv.in2mm(2.8f / DEFAULT_DPI_BARCODE));
            bean39.setModuleWidth(UnitConv.in2mm(2.4f / DEFAULT_DPI_BARCODE));
            bean39.setMsgPosition(HumanReadablePlacement.HRP_NONE);
            bean39.setHeight(8D);

            bean39.doQuietZone(false);

            BitmapCanvasProvider canvas = new BitmapCanvasProvider(
                    baos, "image/x-png", DEFAULT_DPI_BARCODE, BufferedImage.TYPE_BYTE_BINARY, true, 0);

            //Generate the barcode
            bean39.generateBarcode(canvas, textMessageToEncode);

            //Signal end of generation
            canvas.finish();

        } catch (Exception e) {
            _log.error("generateBarcode39()", e.getMessage(), e);
        }


        return baos.toByteArray();
    }
}

