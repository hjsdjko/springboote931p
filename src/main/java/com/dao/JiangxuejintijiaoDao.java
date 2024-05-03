package com.dao;

import com.entity.JiangxuejintijiaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiangxuejintijiaoVO;
import com.entity.view.JiangxuejintijiaoView;


/**
 * 奖学金提交
 * 
 * @author 
 * @email 
 * @date 2022-03-14 14:49:12
 */
public interface JiangxuejintijiaoDao extends BaseMapper<JiangxuejintijiaoEntity> {
	
	List<JiangxuejintijiaoVO> selectListVO(@Param("ew") Wrapper<JiangxuejintijiaoEntity> wrapper);
	
	JiangxuejintijiaoVO selectVO(@Param("ew") Wrapper<JiangxuejintijiaoEntity> wrapper);
	
	List<JiangxuejintijiaoView> selectListView(@Param("ew") Wrapper<JiangxuejintijiaoEntity> wrapper);

	List<JiangxuejintijiaoView> selectListView(Pagination page,@Param("ew") Wrapper<JiangxuejintijiaoEntity> wrapper);
	
	JiangxuejintijiaoView selectView(@Param("ew") Wrapper<JiangxuejintijiaoEntity> wrapper);
	

}
