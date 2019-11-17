package com.oracle.sm.mapper;

import java.util.List;

import com.oracle.sm.model.Goods;
import com.oracle.sm.model.Page;
import com.oracle.sm.model.SerchPrice;

public interface GoodsDao {

	public List<Goods> findAllGoods() ;

	public int findPageCountByPagesize(int pageSize);

	public List<Goods> findGoodsByPage(Page page);

	public Boolean deleteGoodsById(int id);

	public Boolean addGoods(Goods goods);

	public Goods findGoodsById(int id);

	public List<Goods> findGoodsByPrice(SerchPrice serchPrice);

	public List<Goods> findGoodsByLikeName(String likeName);

	public Boolean updateGoodsById(Goods goods);

	public Boolean deleteAllGoods(String[] ids);
	

	
}
