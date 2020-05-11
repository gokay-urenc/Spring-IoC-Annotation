package com.springdemo;

public class CustomerManager implements ICustomerManager {
	
	private ICustomerDal customerDal;

	public CustomerManager(ICustomerDal customerDal) {
		this.customerDal = customerDal;
	}
	
	public void add() {
		customerDal.add();
	}
}