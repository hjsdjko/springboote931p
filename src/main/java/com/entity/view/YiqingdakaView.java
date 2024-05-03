package com.entity.view;

import com.entity.YiqingdakaEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 疫情打卡
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-14 14:49:12
 */
@TableName("yiqingdaka")
public class YiqingdakaView  extends YiqingdakaEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YiqingdakaView(){
	}
 
 	public YiqingdakaView(YiqingdakaEntity yiqingdakaEntity){
 	try {
			BeanUtils.copyProperties(this, yiqingdakaEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
