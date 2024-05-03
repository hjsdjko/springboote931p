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


import com.dao.BiyeyaoqiuDao;
import com.entity.BiyeyaoqiuEntity;
import com.service.BiyeyaoqiuService;
import com.entity.vo.BiyeyaoqiuVO;
import com.entity.view.BiyeyaoqiuView;

@Service("biyeyaoqiuService")
public class BiyeyaoqiuServiceImpl extends ServiceImpl<BiyeyaoqiuDao, BiyeyaoqiuEntity> implements BiyeyaoqiuService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<BiyeyaoqiuEntity> page = this.selectPage(
                new Query<BiyeyaoqiuEntity>(params).getPage(),
                new EntityWrapper<BiyeyaoqiuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<BiyeyaoqiuEntity> wrapper) {
		  Page<BiyeyaoqiuView> page =new Query<BiyeyaoqiuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<BiyeyaoqiuVO> selectListVO(Wrapper<BiyeyaoqiuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public BiyeyaoqiuVO selectVO(Wrapper<BiyeyaoqiuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<BiyeyaoqiuView> selectListView(Wrapper<BiyeyaoqiuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public BiyeyaoqiuView selectView(Wrapper<BiyeyaoqiuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
