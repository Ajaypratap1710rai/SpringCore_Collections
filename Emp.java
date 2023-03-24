package com.springcore.collections;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Emp {
  private String name;
  private List<String> phonesno;
  private Set<String> address;
  private Map<String, String> coures;
  
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public List<String> getPhonesno() {
	return phonesno;
}
public void setPhonesno(List<String> phonesno) {
	this.phonesno = phonesno;
}
public Set<String> getAddress() {
	return address;
}
public void setAddress(Set<String> address) {
	this.address = address;
}
public Map<String, String> getCoures() {
	return coures;
}
public void setCoures(Map<String, String> coures) {
	this.coures = coures;
}

public Emp(String name, List<String> phonesno, Set<String> address, Map<String, String> coures) {
	super();
	this.name = name;
	this.phonesno = phonesno;
	this.address = address;
	this.coures = coures;
}

public Emp() {
	super();
	// TODO Auto-generated constructor stub
}
  
   
  
}
