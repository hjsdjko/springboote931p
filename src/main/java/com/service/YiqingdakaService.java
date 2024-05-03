package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YiqingdakaEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YiqingdakaVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YiqingdakaView;


/**
 * 疫情打卡
 *
 * @author 
 * @email 
 * @date 2022-03-14 14:49:12
 */
public interface YiqingdakaService extends IService<YiqingdakaEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YiqingdakaVO> selectListVO(Wrapper<YiqingdakaEntity> wrapper);
   	
   	YiqingdakaVO selectVO(@Param("ew") Wrapper<YiqingdakaEntity> wrapper);
   	
   	List<YiqingdakaView> selectListView(Wrapper<YiqingdakaEntity> wrapper);
   	
   	YiqingdakaView selectView(@Param("ew") Wrapper<YiqingdakaEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YiqingdakaEntity> wrapper);
   	

}

