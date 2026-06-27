package com.ud;

import java.util.List;
import java.util.Map;

public class Bank {
	private int id;
	private String name;
	private String ifsc;
	private Atm atm;
	private List<Integer> accounts;
	private Map<Integer, String> employyes;
	
	
	
	public Bank(int id, String name, String ifsc, Atm atm, List<Integer> accounts, Map<Integer, String> employyes) {
		super();
		this.id = id;
		this.name = name;
		this.ifsc = ifsc;
		this.atm = atm;
		this.accounts = accounts;
		this.employyes = employyes;
	}

	public Bank(int id, String name, String ifsc, Atm atm, List<Integer> accounts) {
		super();
		this.id = id;
		this.name = name;
		this.ifsc = ifsc;
		this.atm = atm;
		this.accounts = accounts;
	}

	public Bank(int id, String name, String ifsc, Atm atm) {
		super();
		this.id = id;
		this.name = name;
		this.ifsc = ifsc;
		this.atm = atm;
	}

	public Bank(int id, String name, String ifsc) {
		this.id = id;
		this.name = name;
		this.ifsc = ifsc;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIfsc() {
		return ifsc;
	}
	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}
	

	public Atm getAtm() {
		return atm;
	}

	public void setAtm(Atm atm) {
		this.atm = atm;
	}

	public List<Integer> getAccounts() {
		return accounts;
	}

	public void setAccounts(List<Integer> accounts) {
		this.accounts = accounts;
	}

	@Override
	public String toString() {
		return "Bank [id=" + id + ", name=" + name + ", ifsc=" + ifsc + ", atm=" + atm + ", accounts=" + accounts
				+ ", employyes=" + employyes + "]";
	}

	
	
	



	
	

}
