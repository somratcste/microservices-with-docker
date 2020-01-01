package com.nazmul.microservices.currencyconversionservice.resource;

public class CurrencyConversionBean {

	private String from;

	private String to;

	private Integer unit;

	protected CurrencyConversionBean() {}

	public CurrencyConversionBean(String from, String to, Integer unit) {
		super();
		this.from = from;
		this.to = to;
		this.unit = unit;
	}


	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public Integer getUnit() {
		return unit;
	}

	public void setUnit(Integer unit) {
		this.unit = unit;
	}


}
