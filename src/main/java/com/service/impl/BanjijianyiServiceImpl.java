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


import com.dao.BanjijianyiDao;
import com.entity.BanjijianyiEntity;
import com.service.BanjijianyiService;
import com.entity.vo.BanjijianyiVO;
import com.entity.view.BanjijianyiView;

@Service("banjijianyiService")
public class BanjijianyiServiceImpl extends ServiceImpl<BanjijianyiDao, BanjijianyiEntity> implements BanjijianyiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<BanjijianyiEntity> page = this.selectPage(
                new Query<BanjijianyiEntity>(params).getPage(),
                new EntityWrapper<BanjijianyiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<BanjijianyiEntity> wrapper) {
		  Page<BanjijianyiView> page =new Query<BanjijianyiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<BanjijianyiVO> selectListVO(Wrapper<BanjijianyiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public BanjijianyiVO selectVO(Wrapper<BanjijianyiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<BanjijianyiView> selectListView(Wrapper<BanjijianyiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public BanjijianyiView selectView(Wrapper<BanjijianyiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
