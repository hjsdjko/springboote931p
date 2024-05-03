package com.entity.view;

import com.entity.JiangxuejintijiaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 奖学金提交
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-14 14:49:12
 */
@TableName("jiangxuejintijiao")
public class JiangxuejintijiaoView  extends JiangxuejintijiaoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JiangxuejintijiaoView(){
	}
 
 	public JiangxuejintijiaoView(JiangxuejintijiaoEntity jiangxuejintijiaoEntity){
 	try {
			BeanUtils.copyProperties(this, jiangxuejintijiaoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
