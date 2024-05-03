package com.dao;

import com.entity.KetangdianmingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.KetangdianmingVO;
import com.entity.view.KetangdianmingView;


/**
 * 课堂点名
 * 
 * @author 
 * @email 
 * @date 2022-03-14 14:49:11
 */
public interface KetangdianmingDao extends BaseMapper<KetangdianmingEntity> {
	
	List<KetangdianmingVO> selectListVO(@Param("ew") Wrapper<KetangdianmingEntity> wrapper);
	
	KetangdianmingVO selectVO(@Param("ew") Wrapper<KetangdianmingEntity> wrapper);
	
	List<KetangdianmingView> selectListView(@Param("ew") Wrapper<KetangdianmingEntity> wrapper);

	List<KetangdianmingView> selectListView(Pagination page,@Param("ew") Wrapper<KetangdianmingEntity> wrapper);
	
	KetangdianmingView selectView(@Param("ew") Wrapper<KetangdianmingEntity> wrapper);
	

}
