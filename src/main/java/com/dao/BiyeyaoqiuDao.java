package com.dao;

import com.entity.BiyeyaoqiuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.BiyeyaoqiuVO;
import com.entity.view.BiyeyaoqiuView;


/**
 * 毕业要求
 * 
 * @author 
 * @email 
 * @date 2022-03-14 14:49:11
 */
public interface BiyeyaoqiuDao extends BaseMapper<BiyeyaoqiuEntity> {
	
	List<BiyeyaoqiuVO> selectListVO(@Param("ew") Wrapper<BiyeyaoqiuEntity> wrapper);
	
	BiyeyaoqiuVO selectVO(@Param("ew") Wrapper<BiyeyaoqiuEntity> wrapper);
	
	List<BiyeyaoqiuView> selectListView(@Param("ew") Wrapper<BiyeyaoqiuEntity> wrapper);

	List<BiyeyaoqiuView> selectListView(Pagination page,@Param("ew") Wrapper<BiyeyaoqiuEntity> wrapper);
	
	BiyeyaoqiuView selectView(@Param("ew") Wrapper<BiyeyaoqiuEntity> wrapper);
	

}
