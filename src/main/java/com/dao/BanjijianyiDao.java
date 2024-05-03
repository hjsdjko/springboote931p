package com.dao;

import com.entity.BanjijianyiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.BanjijianyiVO;
import com.entity.view.BanjijianyiView;


/**
 * 班级建议
 * 
 * @author 
 * @email 
 * @date 2022-03-14 14:49:11
 */
public interface BanjijianyiDao extends BaseMapper<BanjijianyiEntity> {
	
	List<BanjijianyiVO> selectListVO(@Param("ew") Wrapper<BanjijianyiEntity> wrapper);
	
	BanjijianyiVO selectVO(@Param("ew") Wrapper<BanjijianyiEntity> wrapper);
	
	List<BanjijianyiView> selectListView(@Param("ew") Wrapper<BanjijianyiEntity> wrapper);

	List<BanjijianyiView> selectListView(Pagination page,@Param("ew") Wrapper<BanjijianyiEntity> wrapper);
	
	BanjijianyiView selectView(@Param("ew") Wrapper<BanjijianyiEntity> wrapper);
	

}
