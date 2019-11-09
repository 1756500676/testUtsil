/**  
 * zsw 公司 ZhenShuaiWei_SSM_PROJECT
 * @Title: GoodsMapper.java 
 * @Prject: zhenshuaiwei-senior1-week2execise01
 * @Package: com.zhenshuaiwei.service 
 * @Description: TODO
 * @author: zsw  
 * @date: 2019年11月8日 下午7:04:00 
 * @version: V1.0   
 */
package com.zhenshuaiwei.service;

import java.util.ArrayList;

import com.zhenshuaiwei.entity.Goods;

/** 
 * @ClassName: GoodsMapper 
 * @Description: TODO
 * @author:zsw 
 * @date: 2019年11月8日 下午7:04:00  
 */
public interface GoodsService {

	/** 
	 * @Title: addFileGoods 
	 * @Description: TODO
	 * @param goodsList
	 * @return: void
	 * @date: 2019年11月8日下午7:47:37
	 */
	void addFileGoods(ArrayList<Goods> goodsList);

}
