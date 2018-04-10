package com.heatedline.cdp.model;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public class CacheInfoDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer duelistId;
	private Map<String, List<?>> calculatedMethodListMap;

	public Integer getDuelistId() {
		return duelistId;
	}

	public void setDuelistId(Integer duelistId) {
		this.duelistId = duelistId;
	}

	public Map<String, List<?>> getCalculatedMethodListMap() {
		return calculatedMethodListMap;
	}

	public void setCalculatedMethodListMap(Map<String, List<?>> calculatedMethodListMap) {
		this.calculatedMethodListMap = calculatedMethodListMap;
	}

}
