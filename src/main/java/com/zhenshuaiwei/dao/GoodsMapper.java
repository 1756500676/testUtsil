/**  
 * zsw 公司 ZhenShuaiWei_SSM_PROJECT
 * @Title: GoodsMapper.java 
 * @Prject: zhenshuaiwei-senior1-week2execise01
 * @Package: com.zhenshuaiwei.dao 
 * @Description: TODO
 * @author: zsw  
 * @date: 2019年11月8日 下午7:04:31 
 * @version: V1.0   
 */
package com.zhenshuaiwei.dao;

import java.util.ArrayList;
import java.util.List;

import com.zhenshuaiwei.entity.Goods;
import com.zhenshuaiwei.vo.Vo;

/** 
 * @ClassName: GoodsMapper 
 * @Description: TODO
 * @author:zsw 
 * @date: 2019年11月8日 下午7:04:31  
 */
public interface GoodsMapper {

	/** 
	 * @Title: addGoods 
	 * @Description: TODO
	 * @param goods
	 * @return: void
	 * @date: 2019年11月8日下午7:48:35
	 */
	void addGoods(Goods goods);

	/** 
	 * @Title: getGoodsList 
	 * @Description: TODO
	 * @param vo
	 * @return: void
	 * @date: 2019年11月9日上午8:20:02
	 */
	List<Goods> getGoodsList(Vo vo);


}
