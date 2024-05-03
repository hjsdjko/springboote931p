package com.dao;

import com.entity.JiangxuejinshenqingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiangxuejinshenqingVO;
import com.entity.view.JiangxuejinshenqingView;


/**
 * 奖学金申请
 * 
 * @author 
 * @email 
 * @date 2022-03-14 14:49:12
 */
public interface JiangxuejinshenqingDao extends BaseMapper<JiangxuejinshenqingEntity> {
	
	List<JiangxuejinshenqingVO> selectListVO(@Param("ew") Wrapper<JiangxuejinshenqingEntity> wrapper);
	
	JiangxuejinshenqingVO selectVO(@Param("ew") Wrapper<JiangxuejinshenqingEntity> wrapper);
	
	List<JiangxuejinshenqingView> selectListView(@Param("ew") Wrapper<JiangxuejinshenqingEntity> wrapper);

	List<JiangxuejinshenqingView> selectListView(Pagination page,@Param("ew") Wrapper<JiangxuejinshenqingEntity> wrapper);
	
	JiangxuejinshenqingView selectView(@Param("ew") Wrapper<JiangxuejinshenqingEntity> wrapper);
	

}
