/**  
 * zsw 公司 ZhenShuaiWei_SSM_PROJECT
 * @Title: GoodsController.java 
 * @Prject: zhenshuaiwei-senior1-week2execise01
 * @Package: com.zhenshuaiwei.controller 
 * @Description: TODO
 * @author: zsw  
 * @date: 2019年11月8日 下午7:06:06 
 * @version: V1.0   
 */
package com.zhenshuaiwei.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.zhenshuaiwei.service.GoodsService;

/** 
 * @ClassName: GoodsController 
 * @Description: TODO
 * @author:zsw 
 * @date: 2019年11月8日 下午7:06:06  
 */
@Controller
public class GoodsController {

	@Autowired
	private GoodsService service;
	/**
	 * 返回数据
	 */
	private Map<String,Object> result = new HashMap();
	
	
}
