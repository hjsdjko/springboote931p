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


import com.dao.XuefenjianyiDao;
import com.entity.XuefenjianyiEntity;
import com.service.XuefenjianyiService;
import com.entity.vo.XuefenjianyiVO;
import com.entity.view.XuefenjianyiView;

@Service("xuefenjianyiService")
public class XuefenjianyiServiceImpl extends ServiceImpl<XuefenjianyiDao, XuefenjianyiEntity> implements XuefenjianyiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XuefenjianyiEntity> page = this.selectPage(
                new Query<XuefenjianyiEntity>(params).getPage(),
                new EntityWrapper<XuefenjianyiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XuefenjianyiEntity> wrapper) {
		  Page<XuefenjianyiView> page =new Query<XuefenjianyiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XuefenjianyiVO> selectListVO(Wrapper<XuefenjianyiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XuefenjianyiVO selectVO(Wrapper<XuefenjianyiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XuefenjianyiView> selectListView(Wrapper<XuefenjianyiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XuefenjianyiView selectView(Wrapper<XuefenjianyiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
