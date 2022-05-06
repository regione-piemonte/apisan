/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanaut.business.mapper;

import java.util.UUID;

/**
 * Mapper UUID - String
 * 
 * @author Domenico
 *
 */
public class UUIDMapper extends BaseMapper<UUID, String>{

	@Override
	public String to(UUID uuid) {
		if(uuid == null) {
			return null;
		}
		return uuid.toString();
	}

	@Override
	public UUID from(String uuid) {
		if(uuid == null) {
			return null;
		}
		return UUID.fromString(uuid);
	}

}
