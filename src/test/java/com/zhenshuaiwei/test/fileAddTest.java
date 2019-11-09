/**  
 * zsw 公司 ZhenShuaiWei_SSM_PROJECT
 * @Title: fileAddTest.java 
 * @Prject: zhenshuaiwei-senior1-week2execise01
 * @Package: com.zhenshuaiwei.test 
 * @Description: TODO
 * @author: zsw  
 * @date: 2019年11月8日 下午7:08:12 
 * @version: V1.0   
 */
package com.zhenshuaiwei.test;

import java.io.File;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.zhenshuaiwei.entity.Goods;
import com.zhenshuaiwei.service.GoodsService;
import com.zhenshuaiwei.utils.FileUtil;
import com.zhenshuaiwei.utils.StringUtils;

/** 
 * @ClassName: fileAddTest 
 * @Description: TODO
 * @author:zsw 
 * @date: 2019年11月8日 下午7:08:12  
 */
//它引用的类来运行该类中的测试
@RunWith(SpringRunner.class)
@ContextConfiguration(locations = "classpath:spring.xml")
public class fileAddTest {

	
	@Autowired
	private GoodsService service;
	/**
	 * 
	 * @Title: test 
	 * @Description: 添加本地文件到数据库
	 * @return: void
	 * @date: 2019年11月8日下午7:43:32
	 */
	@Test
	public void test() {
		File file = new File("D:\\java_work\\Eclipse-1707D-CMS-work\\zhenshuaiwei-senior1-week2execise01\\src\\test\\resources\\test.txt");
		List<String> list = FileUtil.getFileRow(file);
		ArrayList<Goods> GoodsList = new ArrayList<Goods>();
		list.forEach((String str) -> {
			String[] split = str.trim().split("==¥|==|%|¥");
			System.out.println(str.trim());
			int sales = 0;
			if (split.length == 4) {
				sales = Integer.parseInt(split[3]);
			}
			String priceval = split[2];
			if (split.length == 5) {
				priceval = split[3];
				sales = Integer.parseInt(split[4]);
			}
			if (StringUtils.isNumber(split[0])) {
				if (!StringUtils.isBlank(split[1])) {
					if (StringUtils.isNumber(priceval)) {
						BigDecimal price = BigDecimal.valueOf(Double.parseDouble(priceval));
						GoodsList.add(new Goods(Integer.parseInt(split[0]),split[1],price,sales));
					}
				}
			}
			System.out.println();
		});
		GoodsList.forEach((goods) -> {
			System.out.println(goods);
		});
		
		service.addFileGoods(GoodsList);
	}
}
