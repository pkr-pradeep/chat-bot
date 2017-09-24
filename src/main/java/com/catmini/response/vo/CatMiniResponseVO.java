package com.catmini.response.vo;

import java.util.Map;

public class CatMiniResponseVO {

	private Map<String, String> responseObject;

	public CatMiniResponseVO() {
		super();
	}

	public CatMiniResponseVO(Map<String, String> responseObject) {
		super();
		this.responseObject = responseObject;
	}

	/**
	 * @return the responseObject
	 */
	public Map<String, String> getResponseObject() {
		return responseObject;
	}

	/**
	 * @param responseObject the responseObject to set
	 */
	public void setResponseObject(Map<String, String> responseObject) {
		this.responseObject = responseObject;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "CatMiniResponseVO [responseObject=" + responseObject + "]";
	}

}