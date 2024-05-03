package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.BanjijianyiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.BanjijianyiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.BanjijianyiView;


/**
 * 班级建议
 *
 * @author 
 * @email 
 * @date 2022-03-14 14:49:11
 */
public interface BanjijianyiService extends IService<BanjijianyiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<BanjijianyiVO> selectListVO(Wrapper<BanjijianyiEntity> wrapper);
   	
   	BanjijianyiVO selectVO(@Param("ew") Wrapper<BanjijianyiEntity> wrapper);
   	
   	List<BanjijianyiView> selectListView(Wrapper<BanjijianyiEntity> wrapper);
   	
   	BanjijianyiView selectView(@Param("ew") Wrapper<BanjijianyiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<BanjijianyiEntity> wrapper);
   	

}

