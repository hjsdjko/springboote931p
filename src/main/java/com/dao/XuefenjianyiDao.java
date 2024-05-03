package com.dao;

import com.entity.XuefenjianyiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XuefenjianyiVO;
import com.entity.view.XuefenjianyiView;


/**
 * 学分建议
 * 
 * @author 
 * @email 
 * @date 2022-03-14 14:49:11
 */
public interface XuefenjianyiDao extends BaseMapper<XuefenjianyiEntity> {
	
	List<XuefenjianyiVO> selectListVO(@Param("ew") Wrapper<XuefenjianyiEntity> wrapper);
	
	XuefenjianyiVO selectVO(@Param("ew") Wrapper<XuefenjianyiEntity> wrapper);
	
	List<XuefenjianyiView> selectListView(@Param("ew") Wrapper<XuefenjianyiEntity> wrapper);

	List<XuefenjianyiView> selectListView(Pagination page,@Param("ew") Wrapper<XuefenjianyiEntity> wrapper);
	
	XuefenjianyiView selectView(@Param("ew") Wrapper<XuefenjianyiEntity> wrapper);
	

}
