package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.BiyeyaoqiuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.BiyeyaoqiuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.BiyeyaoqiuView;


/**
 * 毕业要求
 *
 * @author 
 * @email 
 * @date 2022-03-14 14:49:11
 */
public interface BiyeyaoqiuService extends IService<BiyeyaoqiuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<BiyeyaoqiuVO> selectListVO(Wrapper<BiyeyaoqiuEntity> wrapper);
   	
   	BiyeyaoqiuVO selectVO(@Param("ew") Wrapper<BiyeyaoqiuEntity> wrapper);
   	
   	List<BiyeyaoqiuView> selectListView(Wrapper<BiyeyaoqiuEntity> wrapper);
   	
   	BiyeyaoqiuView selectView(@Param("ew") Wrapper<BiyeyaoqiuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<BiyeyaoqiuEntity> wrapper);
   	

}

