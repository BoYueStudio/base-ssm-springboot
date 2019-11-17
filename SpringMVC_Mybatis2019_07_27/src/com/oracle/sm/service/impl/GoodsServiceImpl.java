/**
 * 
 */
package com.oracle.sm.service.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.oracle.sm.mapper.GoodsDao;
import com.oracle.sm.model.Goods;
import com.oracle.sm.model.Page;
import com.oracle.sm.model.SerchPrice;
import com.oracle.sm.service.GoodsService;
import com.oracle.sm.utils.MybatisUtil;

/**
 * @author BoYue
 *
 */
public class GoodsServiceImpl implements GoodsService {


	@Override
	public List<Goods> findAllGoods() {
		SqlSessionFactory sessionFactory=new MybatisUtil().getSessionFactory();
		SqlSession session=sessionFactory.openSession();
		GoodsDao goodsDao=session.getMapper(GoodsDao.class);
		List<Goods> goodsList=goodsDao.findAllGoods();
		session.commit();
		session.close();
		return goodsList;
	}

	@Override
	public int findPageCountByPagesize(int pageSize) {
		SqlSessionFactory sessionFactory=new MybatisUtil().getSessionFactory();
		SqlSession session=sessionFactory.openSession();
		GoodsDao goodsDao=session.getMapper(GoodsDao.class);
		int rowCount=goodsDao.findPageCountByPagesize(pageSize);
		session.commit();
		session.close();
		return rowCount%pageSize==0 ?rowCount/pageSize :rowCount/pageSize+1 ;
	}

	@Override
	public List<Goods> findGoodsByPage(Page page) {
		SqlSessionFactory sessionFactory=new MybatisUtil().getSessionFactory();
		SqlSession session=sessionFactory.openSession();
		GoodsDao goodsDao=session.getMapper(GoodsDao.class);
		List<Goods> goodsList=goodsDao.findGoodsByPage(page);
		session.commit();
		session.close();
		return goodsList;
	}

	@Override
	public Boolean deleteGoodsById(int id) {
		SqlSessionFactory sessionFactory=new MybatisUtil().getSessionFactory();
		SqlSession session=sessionFactory.openSession();
		GoodsDao goodsDao=session.getMapper(GoodsDao.class);
		Boolean boo=goodsDao.deleteGoodsById(id);
		session.commit();
		session.close();
		return boo;
	}

	@Override
	public Boolean addGoods(Goods goods) {
		SqlSessionFactory sessionFactory=new MybatisUtil().getSessionFactory();
		SqlSession session=sessionFactory.openSession();
		GoodsDao goodsDao=session.getMapper(GoodsDao.class);
		Boolean boo=goodsDao.addGoods(goods);
		session.commit();
		session.close();
		return boo;
	}

	@Override
	public Goods findGoodsById(int id) {
		SqlSessionFactory sessionFactory=new MybatisUtil().getSessionFactory();
		SqlSession session=sessionFactory.openSession();
		GoodsDao goodsDao=session.getMapper(GoodsDao.class);
		Goods goods=goodsDao.findGoodsById(id);
		session.commit();
		session.close();
		return goods;
	}

	@Override
	public List<Goods> findGoodsByPrice(SerchPrice serchPrice) {
		SqlSessionFactory sessionFactory=new MybatisUtil().getSessionFactory();
		SqlSession session=sessionFactory.openSession();
		GoodsDao goodsDao=session.getMapper(GoodsDao.class);
		List<Goods> goodsList=goodsDao.findGoodsByPrice(serchPrice);
		session.commit();
		session.close();
		return goodsList;
	}

	@Override
	public List<Goods> findGoodsByLikeName(String likeName) {
		SqlSessionFactory sessionFactory=new MybatisUtil().getSessionFactory();
		SqlSession session=sessionFactory.openSession();
		GoodsDao goodsDao=session.getMapper(GoodsDao.class);
		List<Goods> goodsList=goodsDao.findGoodsByLikeName(likeName);
		session.commit();
		session.close();
		return goodsList;
	}

	@Override
	public Boolean updateGoodsById(Goods goods) {
		SqlSessionFactory sessionFactory=new MybatisUtil().getSessionFactory();
		SqlSession session=sessionFactory.openSession();
		GoodsDao goodsDao=session.getMapper(GoodsDao.class);
		Boolean boo=goodsDao.updateGoodsById(goods);
		session.commit();
		session.close();
		return boo;
	}

	@Override
	public Boolean deleteAllGoods(String[] ids) {
		SqlSessionFactory sessionFactory=new MybatisUtil().getSessionFactory();
		SqlSession session=sessionFactory.openSession();
		GoodsDao goodsDao=session.getMapper(GoodsDao.class);
		Boolean boo=goodsDao.deleteAllGoods(ids);
		session.commit();
		session.close();
		return boo;
	}

}
