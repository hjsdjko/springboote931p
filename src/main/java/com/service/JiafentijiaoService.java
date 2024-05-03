package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiafentijiaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiafentijiaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiafentijiaoView;


/**
 * 加分提交
 *
 * @author 
 * @email 
 * @date 2022-03-14 14:49:12
 */
public interface JiafentijiaoService extends IService<JiafentijiaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiafentijiaoVO> selectListVO(Wrapper<JiafentijiaoEntity> wrapper);
   	
   	JiafentijiaoVO selectVO(@Param("ew") Wrapper<JiafentijiaoEntity> wrapper);
   	
   	List<JiafentijiaoView> selectListView(Wrapper<JiafentijiaoEntity> wrapper);
   	
   	JiafentijiaoView selectView(@Param("ew") Wrapper<JiafentijiaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiafentijiaoEntity> wrapper);
   	

}

