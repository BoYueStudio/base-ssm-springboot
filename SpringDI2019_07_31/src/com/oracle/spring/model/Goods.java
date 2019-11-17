package com.oracle.spring.model;

public class Goods {

	private int id;
	private String name;
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
	public Goods() {
		super();
	}
	@Override
	public String toString() {
		return "Goods [id=" + id + ", name=" + name + "]";
	}
	public Goods(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	

}
