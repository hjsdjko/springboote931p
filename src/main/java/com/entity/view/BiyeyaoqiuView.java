package com.entity.view;

import com.entity.BiyeyaoqiuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 毕业要求
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-14 14:49:11
 */
@TableName("biyeyaoqiu")
public class BiyeyaoqiuView  extends BiyeyaoqiuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public BiyeyaoqiuView(){
	}
 
 	public BiyeyaoqiuView(BiyeyaoqiuEntity biyeyaoqiuEntity){
 	try {
			BeanUtils.copyProperties(this, biyeyaoqiuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
