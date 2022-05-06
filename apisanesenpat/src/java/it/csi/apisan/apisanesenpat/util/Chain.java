/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanesenpat.util;

public interface Chain<T> {
    public final boolean CHAIN_OK = true;
    public final boolean CHAIN_KO = false;
    void handle(T t);
}
