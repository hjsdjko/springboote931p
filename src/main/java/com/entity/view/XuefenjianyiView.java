package com.entity.view;

import com.entity.XuefenjianyiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 学分建议
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-14 14:49:11
 */
@TableName("xuefenjianyi")
public class XuefenjianyiView  extends XuefenjianyiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public XuefenjianyiView(){
	}
 
 	public XuefenjianyiView(XuefenjianyiEntity xuefenjianyiEntity){
 	try {
			BeanUtils.copyProperties(this, xuefenjianyiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
