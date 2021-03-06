package de.blogspot.wrongtracks.prost.ejb.transfer.impl;

import java.io.Serializable;
import java.util.Date;

import de.blogspot.wrongtracks.prost.ejb.transfer.HistoricFormPropertyInfo;

/**
 * Clazz for historical data, which has been entered as formproperties
 * 
 * @author Ronny Bräunlich
 * 
 */
public class HistoricFormPropertyInfoImpl implements Serializable,
		HistoricFormPropertyInfo {

	private static final long serialVersionUID = -7089132808797477417L;
	private String id;
	private String propertyId;
	private String value;
	private Date time;

	@Override
	public String getId() {
		return id;
	}

	@Override
	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String getPropertyId() {
		return propertyId;
	}

	@Override
	public void setPropertyId(String propertyId) {
		this.propertyId = propertyId;
	}

	@Override
	public String getValue() {
		return value;
	}

	@Override
	public void setValue(String value) {
		this.value = value;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		HistoricFormPropertyInfoImpl other = (HistoricFormPropertyInfoImpl) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public void setTime(Date time) {
		this.time = time;
	}

	@Override
	public Date getTime() {
		return time;
	}
}
