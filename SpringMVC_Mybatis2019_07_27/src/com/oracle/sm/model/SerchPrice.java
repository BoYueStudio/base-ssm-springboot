package com.oracle.sm.model;

public class SerchPrice {
	private String goodsName;
	private Integer minPrice;
	private Integer maxPrice;
	public String getGoodsName() {
		return goodsName;
	}
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
	public Integer getMinPrice() {
		return minPrice;
	}
	public void setMinPrice(Integer minPrice) {
		this.minPrice = minPrice;
	}
	public Integer getMaxPrice() {
		return maxPrice;
	}
	public void setMaxPrice(Integer maxPrice) {
		this.maxPrice = maxPrice;
	}
	public SerchPrice(String goodsName, Integer minPrice, Integer maxPrice) {
		super();
		this.goodsName = goodsName;
		this.minPrice = minPrice;
		this.maxPrice = maxPrice;
	}
	public SerchPrice() {
		super();
	}
	@Override
	public String toString() {
		return "SerchPrice [goodsName=" + goodsName + ", minPrice=" + minPrice + ", maxPrice=" + maxPrice + "]";
	}
	
	
	
	
	
	

}
