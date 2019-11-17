package com.oracle.sm.service;

import java.util.List;

import com.oracle.sm.model.Goods;
import com.oracle.sm.model.Page;
import com.oracle.sm.model.SerchPrice;

public interface GoodsService {
	
	public List<Goods> findAllGoods();//����������Ʒ
	public int findPageCountByPagesize(int pageSize);//������ҳ��
	public List<Goods> findGoodsByPage(Page page);//��ҳ��ѯ��Ʒ
	public Boolean deleteGoodsById(int id);
	public Boolean addGoods(Goods goods);
	public Goods findGoodsById(int id);
	public List<Goods> findGoodsByPrice(SerchPrice serchPrice);//�۸�β�ѯ
	public List<Goods> findGoodsByLikeName(String likeName);
	public Boolean updateGoodsById(Goods goods);
	public Boolean deleteAllGoods(String[] ids);
	

}
