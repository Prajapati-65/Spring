package com.bridgeit.AutowireNo;

public class City {

	private String cityName;
	private String stateName;
	private int noOfCity;
	
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public String getStateName() {
		return stateName;
	}
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	public int getNoOfCity() {
		return noOfCity;
	}
	public void setNoOfCity(int noOfCity) {
		this.noOfCity = noOfCity;
	}
	
	@Override
	public String toString() {
		return "City [cityName=" + cityName + ", stateName=" + stateName + ", noOfCity=" + noOfCity + "]";
	}
	
	
	
}
