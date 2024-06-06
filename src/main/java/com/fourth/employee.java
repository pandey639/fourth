package com.fourth;

public class employee {
 private int rll;
 private String name;
 private String gnder;
 private  int slary;
public employee() {
	super();
	// TODO Auto-generated constructor stub
}
public employee(int rll, String name, String gnder, int slary) {
	super();
	this.rll = rll;
	this.name = name;
	this.gnder = gnder;
	this.slary = slary;
}
public int getRll() {
	return rll;
}
public void setRll(int rll) {
	this.rll = rll;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getGnder() {
	return gnder;
}
public void setGnder(String gnder) {
	this.gnder = gnder;
}
public int getSlary() {
	return slary;
}
public void setSlary(int slary) {
	this.slary = slary;
}
@Override
public String toString() {
	return "employee [rll=" + rll + ", name=" + name + ", gnder=" + gnder + ", slary=" + slary + "]";
}

}
