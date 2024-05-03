package com.entity.view;

import com.entity.BanjijianyiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 班级建议
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-14 14:49:11
 */
@TableName("banjijianyi")
public class BanjijianyiView  extends BanjijianyiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public BanjijianyiView(){
	}
 
 	public BanjijianyiView(BanjijianyiEntity banjijianyiEntity){
 	try {
			BeanUtils.copyProperties(this, banjijianyiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
