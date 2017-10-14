package com.bridgeit.AnnotationAutowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("driver")
public class DriverSetterMethod {

	private License license;

	@Autowired
	public void setLicense(License license) {
		this.license = license;
	}

	@Override
	public String toString() {
		return "Driver [license=" + license + "]";
	}

	public License getLicense() {
		return license;
	}

}
