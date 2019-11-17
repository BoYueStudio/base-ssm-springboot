package com.oracle.sm.model;

public class Goods {

	private int id;
	private String goodsName;
	private String goodsPrice;
	private String goodsPic;
	private int state;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getGoodsName() {
		return goodsName;
	}
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
	public String getGoodsPrice() {
		return goodsPrice;
	}
	public void setGoodsPrice(String goodsPrice) {
		this.goodsPrice = goodsPrice;
	}
	public String getGoodsPic() {
		return goodsPic;
	}
	public void setGoodsPic(String goodsPic) {
		this.goodsPic = goodsPic;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	public Goods(int id, String goodsName, String goodsPrice, String goodsPic, int state) {
		super();
		this.id = id;
		this.goodsName = goodsName;
		this.goodsPrice = goodsPrice;
		this.goodsPic = goodsPic;
		this.state = state;
	}
	@Override
	public String toString() {
		return "Goods [id=" + id + ", goodsName=" + goodsName + ", goodsPrice=" + goodsPrice + ", goodsPic=" + goodsPic
				+ ", state=" + state + "]";
	}
	public Goods(String goodsName, String goodsPrice, String goodsPic, int state) {
		super();
		this.goodsName = goodsName;
		this.goodsPrice = goodsPrice;
		this.goodsPic = goodsPic;
		this.state = state;
	}
	public Goods() {
		super();
	}
	
	

}
