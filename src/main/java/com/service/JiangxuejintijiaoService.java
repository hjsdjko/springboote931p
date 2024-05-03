package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiangxuejintijiaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiangxuejintijiaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiangxuejintijiaoView;


/**
 * 奖学金提交
 *
 * @author 
 * @email 
 * @date 2022-03-14 14:49:12
 */
public interface JiangxuejintijiaoService extends IService<JiangxuejintijiaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiangxuejintijiaoVO> selectListVO(Wrapper<JiangxuejintijiaoEntity> wrapper);
   	
   	JiangxuejintijiaoVO selectVO(@Param("ew") Wrapper<JiangxuejintijiaoEntity> wrapper);
   	
   	List<JiangxuejintijiaoView> selectListView(Wrapper<JiangxuejintijiaoEntity> wrapper);
   	
   	JiangxuejintijiaoView selectView(@Param("ew") Wrapper<JiangxuejintijiaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiangxuejintijiaoEntity> wrapper);
   	

}

