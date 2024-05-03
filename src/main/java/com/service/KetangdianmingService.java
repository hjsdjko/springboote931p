package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.KetangdianmingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.KetangdianmingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.KetangdianmingView;


/**
 * 课堂点名
 *
 * @author 
 * @email 
 * @date 2022-03-14 14:49:11
 */
public interface KetangdianmingService extends IService<KetangdianmingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<KetangdianmingVO> selectListVO(Wrapper<KetangdianmingEntity> wrapper);
   	
   	KetangdianmingVO selectVO(@Param("ew") Wrapper<KetangdianmingEntity> wrapper);
   	
   	List<KetangdianmingView> selectListView(Wrapper<KetangdianmingEntity> wrapper);
   	
   	KetangdianmingView selectView(@Param("ew") Wrapper<KetangdianmingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<KetangdianmingEntity> wrapper);
   	

}

