package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XuefenjianyiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XuefenjianyiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XuefenjianyiView;


/**
 * 学分建议
 *
 * @author 
 * @email 
 * @date 2022-03-14 14:49:11
 */
public interface XuefenjianyiService extends IService<XuefenjianyiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XuefenjianyiVO> selectListVO(Wrapper<XuefenjianyiEntity> wrapper);
   	
   	XuefenjianyiVO selectVO(@Param("ew") Wrapper<XuefenjianyiEntity> wrapper);
   	
   	List<XuefenjianyiView> selectListView(Wrapper<XuefenjianyiEntity> wrapper);
   	
   	XuefenjianyiView selectView(@Param("ew") Wrapper<XuefenjianyiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XuefenjianyiEntity> wrapper);
   	

}

