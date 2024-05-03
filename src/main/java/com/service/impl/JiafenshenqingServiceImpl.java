package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.JiafenshenqingDao;
import com.entity.JiafenshenqingEntity;
import com.service.JiafenshenqingService;
import com.entity.vo.JiafenshenqingVO;
import com.entity.view.JiafenshenqingView;

@Service("jiafenshenqingService")
public class JiafenshenqingServiceImpl extends ServiceImpl<JiafenshenqingDao, JiafenshenqingEntity> implements JiafenshenqingService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiafenshenqingEntity> page = this.selectPage(
                new Query<JiafenshenqingEntity>(params).getPage(),
                new EntityWrapper<JiafenshenqingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiafenshenqingEntity> wrapper) {
		  Page<JiafenshenqingView> page =new Query<JiafenshenqingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JiafenshenqingVO> selectListVO(Wrapper<JiafenshenqingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiafenshenqingVO selectVO(Wrapper<JiafenshenqingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiafenshenqingView> selectListView(Wrapper<JiafenshenqingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiafenshenqingView selectView(Wrapper<JiafenshenqingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
