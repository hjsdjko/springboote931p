package com.entity.view;

import com.entity.KetangdianmingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 课堂点名
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-14 14:49:11
 */
@TableName("ketangdianming")
public class KetangdianmingView  extends KetangdianmingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public KetangdianmingView(){
	}
 
 	public KetangdianmingView(KetangdianmingEntity ketangdianmingEntity){
 	try {
			BeanUtils.copyProperties(this, ketangdianmingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
