package com.bridgeit.AutowireByType;

public class Employee {
	 
	private EmpAddress address;

	public EmpAddress getAddress() {
		return address;
	}

	public void setAddress(EmpAddress address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [address=" + address + "]";
	}

	
	
	
}
