package com.bridgeit.AutowireNo;

public class Country {

	private City city;

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Country [city=" + city + "]";
	}
	
	
}
