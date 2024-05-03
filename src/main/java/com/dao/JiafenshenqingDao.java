package com.dao;

import com.entity.JiafenshenqingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiafenshenqingVO;
import com.entity.view.JiafenshenqingView;


/**
 * 加分申请
 * 
 * @author 
 * @email 
 * @date 2022-03-14 14:49:12
 */
public interface JiafenshenqingDao extends BaseMapper<JiafenshenqingEntity> {
	
	List<JiafenshenqingVO> selectListVO(@Param("ew") Wrapper<JiafenshenqingEntity> wrapper);
	
	JiafenshenqingVO selectVO(@Param("ew") Wrapper<JiafenshenqingEntity> wrapper);
	
	List<JiafenshenqingView> selectListView(@Param("ew") Wrapper<JiafenshenqingEntity> wrapper);

	List<JiafenshenqingView> selectListView(Pagination page,@Param("ew") Wrapper<JiafenshenqingEntity> wrapper);
	
	JiafenshenqingView selectView(@Param("ew") Wrapper<JiafenshenqingEntity> wrapper);
	

}
