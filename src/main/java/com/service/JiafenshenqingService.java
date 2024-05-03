package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiafenshenqingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiafenshenqingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiafenshenqingView;


/**
 * 加分申请
 *
 * @author 
 * @email 
 * @date 2022-03-14 14:49:12
 */
public interface JiafenshenqingService extends IService<JiafenshenqingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiafenshenqingVO> selectListVO(Wrapper<JiafenshenqingEntity> wrapper);
   	
   	JiafenshenqingVO selectVO(@Param("ew") Wrapper<JiafenshenqingEntity> wrapper);
   	
   	List<JiafenshenqingView> selectListView(Wrapper<JiafenshenqingEntity> wrapper);
   	
   	JiafenshenqingView selectView(@Param("ew") Wrapper<JiafenshenqingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiafenshenqingEntity> wrapper);
   	

}

