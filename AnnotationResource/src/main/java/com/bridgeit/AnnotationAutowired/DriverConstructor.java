package com.bridgeit.AnnotationAutowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("driver")
public class DriverConstructor {

	private License license;

	@Autowired
    public DriverConstructor(License license){
        this.license = license;
    }

	@Override
	public String toString() {
		return "Driver [license=" + license + "]";
	}
}
