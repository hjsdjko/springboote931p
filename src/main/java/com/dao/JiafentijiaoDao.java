package com.dao;

import com.entity.JiafentijiaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiafentijiaoVO;
import com.entity.view.JiafentijiaoView;


/**
 * 加分提交
 * 
 * @author 
 * @email 
 * @date 2022-03-14 14:49:12
 */
public interface JiafentijiaoDao extends BaseMapper<JiafentijiaoEntity> {
	
	List<JiafentijiaoVO> selectListVO(@Param("ew") Wrapper<JiafentijiaoEntity> wrapper);
	
	JiafentijiaoVO selectVO(@Param("ew") Wrapper<JiafentijiaoEntity> wrapper);
	
	List<JiafentijiaoView> selectListView(@Param("ew") Wrapper<JiafentijiaoEntity> wrapper);

	List<JiafentijiaoView> selectListView(Pagination page,@Param("ew") Wrapper<JiafentijiaoEntity> wrapper);
	
	JiafentijiaoView selectView(@Param("ew") Wrapper<JiafentijiaoEntity> wrapper);
	

}
