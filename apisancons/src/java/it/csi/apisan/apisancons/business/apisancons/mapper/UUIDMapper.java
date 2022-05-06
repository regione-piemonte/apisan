/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisancons.business.apisancons.mapper;

import java.util.UUID;



public class UUIDMapper extends BaseMapper<UUID, String> {
	

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
