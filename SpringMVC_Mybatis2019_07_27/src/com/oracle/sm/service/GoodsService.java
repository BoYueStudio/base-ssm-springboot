package com.oracle.sm.service;

import java.util.List;

import com.oracle.sm.model.Goods;
import com.oracle.sm.model.Page;
import com.oracle.sm.model.SerchPrice;

public interface GoodsService {
	
	public List<Goods> findAllGoods();//查找所以商品
	public int findPageCountByPagesize(int pageSize);//查找总页数
	public List<Goods> findGoodsByPage(Page page);//分页查询商品
	public Boolean deleteGoodsById(int id);
	public Boolean addGoods(Goods goods);
	public Goods findGoodsById(int id);
	public List<Goods> findGoodsByPrice(SerchPrice serchPrice);//价格段查询
	public List<Goods> findGoodsByLikeName(String likeName);
	public Boolean updateGoodsById(Goods goods);
	public Boolean deleteAllGoods(String[] ids);
	

}
