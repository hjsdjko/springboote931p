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


import com.dao.JiangxuejintijiaoDao;
import com.entity.JiangxuejintijiaoEntity;
import com.service.JiangxuejintijiaoService;
import com.entity.vo.JiangxuejintijiaoVO;
import com.entity.view.JiangxuejintijiaoView;

@Service("jiangxuejintijiaoService")
public class JiangxuejintijiaoServiceImpl extends ServiceImpl<JiangxuejintijiaoDao, JiangxuejintijiaoEntity> implements JiangxuejintijiaoService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiangxuejintijiaoEntity> page = this.selectPage(
                new Query<JiangxuejintijiaoEntity>(params).getPage(),
                new EntityWrapper<JiangxuejintijiaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiangxuejintijiaoEntity> wrapper) {
		  Page<JiangxuejintijiaoView> page =new Query<JiangxuejintijiaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JiangxuejintijiaoVO> selectListVO(Wrapper<JiangxuejintijiaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiangxuejintijiaoVO selectVO(Wrapper<JiangxuejintijiaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiangxuejintijiaoView> selectListView(Wrapper<JiangxuejintijiaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiangxuejintijiaoView selectView(Wrapper<JiangxuejintijiaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
