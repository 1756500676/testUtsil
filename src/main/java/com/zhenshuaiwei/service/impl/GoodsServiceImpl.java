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

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhenshuaiwei.dao.GoodsMapper;
import com.zhenshuaiwei.entity.Goods;
import com.zhenshuaiwei.service.GoodsService;

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
	
	

}
