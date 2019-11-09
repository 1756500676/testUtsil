/**  
 * zsw 公司 ZhenShuaiWei_SSM_PROJECT
 * @Title: GoodsServiceImpl.java 
 * @Prject: zhenshuaiwei-senior1-week2execise01
 * @Package: com.zhenshuaiwei.service.impl 
 * @Description: TODO
 * @author: zsw  
 * @date: 2019年11月8日 下午7:05:04 
 * @version: V1.0   
 */
package com.zhenshuaiwei.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zhenshuaiwei.dao.GoodsMapper;
import com.zhenshuaiwei.entity.Goods;
import com.zhenshuaiwei.service.GoodsService;
import com.zhenshuaiwei.vo.Vo;

/** 
 * @ClassName: GoodsServiceImpl 
 * @Description: TODO
 * @author:zsw 
 * @date: 2019年11月8日 下午7:05:04  
 */
@Service
public class GoodsServiceImpl implements GoodsService {
	
	@Autowired
	private GoodsMapper mapper;

	/* (non Javadoc) 
	 * @Title: addFileGoods
	 * @Description: TODO
	 * @param goodsList 
	 * @see com.zhenshuaiwei.service.GoodsService#addFileGoods(java.util.ArrayList) 
	 */
	@Override
	public void addFileGoods(ArrayList<Goods> goodsList) {
		goodsList.forEach(goods -> {
			mapper.addGoods(goods);
		});
	}

	/* (non Javadoc) 
	 * @Title: getGoodsList
	 * @Description: TODO
	 * @param vo
	 * @param page
	 * @return 
	 * @see com.zhenshuaiwei.service.GoodsService#getGoodsList(com.zhenshuaiwei.vo.Vo, java.lang.String) 
	 */
	@Override
	public  PageInfo<Goods> getGoodsList(Vo vo, String page) {
		PageHelper.startPage(Integer.parseInt(page), 5);
		List<Goods> list = mapper.getGoodsList(vo);
		return new PageInfo(list);
	}
	
	

}
