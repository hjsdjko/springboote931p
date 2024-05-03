package com.dao;

import com.entity.YiqingdakaEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YiqingdakaVO;
import com.entity.view.YiqingdakaView;


/**
 * 疫情打卡
 * 
 * @author 
 * @email 
 * @date 2022-03-14 14:49:12
 */
public interface YiqingdakaDao extends BaseMapper<YiqingdakaEntity> {
	
	List<YiqingdakaVO> selectListVO(@Param("ew") Wrapper<YiqingdakaEntity> wrapper);
	
	YiqingdakaVO selectVO(@Param("ew") Wrapper<YiqingdakaEntity> wrapper);
	
	List<YiqingdakaView> selectListView(@Param("ew") Wrapper<YiqingdakaEntity> wrapper);

	List<YiqingdakaView> selectListView(Pagination page,@Param("ew") Wrapper<YiqingdakaEntity> wrapper);
	
	YiqingdakaView selectView(@Param("ew") Wrapper<YiqingdakaEntity> wrapper);
	

}
