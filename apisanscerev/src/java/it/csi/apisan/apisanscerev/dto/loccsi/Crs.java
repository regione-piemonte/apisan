/*******************************************************************************

* Copyright Regione Piemonte - 2022

* SPDX-License-Identifier: EUPL-1.2

******************************************************************************/
package it.csi.apisan.apisanscerev.dto.loccsi;

import org.codehaus.jackson.annotate.JsonProperty;

import io.swagger.annotations.ApiModelProperty;



public class Crs   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [] 
  private String type;
  private PropertiCrs properties = null;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("properties") 
 
  public PropertiCrs getProperties() {
    return properties;
  }
  public void setProperties(PropertiCrs properties) {
    this.properties = properties;
  }

  @ApiModelProperty(value = "")
  @JsonProperty("type") 
  public String getType() {
	  return type;
  }
  public void setType(String type) {
	  this.type = type;
  }
  


  @Override
public String toString() {
	return "Crs [type=" + type + ", properties=" + properties + "]";
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((properties == null) ? 0 : properties.hashCode());
	result = prime * result + ((type == null) ? 0 : type.hashCode());
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Crs other = (Crs) obj;
	if (properties == null) {
		if (other.properties != null)
			return false;
	} else if (!properties.equals(other.properties))
		return false;
	if (type == null) {
		if (other.type != null)
			return false;
	} else if (!type.equals(other.type))
		return false;
	return true;
}
/**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

