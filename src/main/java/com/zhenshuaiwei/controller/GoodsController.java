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
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageInfo;
import com.zhenshuaiwei.entity.Goods;
import com.zhenshuaiwei.service.GoodsService;
import com.zhenshuaiwei.ssmutils.PageUtil;
import com.zhenshuaiwei.vo.Vo;

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
	
	@GetMapping("/list")
	public String getGoodsList(Model m,Vo vo,@RequestParam(defaultValue = "1")String page) {
		PageInfo<Goods> info = service.getGoodsList(vo,page);
		PageUtil pageUtil = new PageUtil(page, (int)info.getTotal(), info.getPageSize());
		m.addAttribute("goodsList", info.getList());
		m.addAttribute("page", pageUtil);
		m.addAttribute("vo", vo);
		return "goodsList";
	}
	
}
