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


import com.dao.JiafentijiaoDao;
import com.entity.JiafentijiaoEntity;
import com.service.JiafentijiaoService;
import com.entity.vo.JiafentijiaoVO;
import com.entity.view.JiafentijiaoView;

@Service("jiafentijiaoService")
public class JiafentijiaoServiceImpl extends ServiceImpl<JiafentijiaoDao, JiafentijiaoEntity> implements JiafentijiaoService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiafentijiaoEntity> page = this.selectPage(
                new Query<JiafentijiaoEntity>(params).getPage(),
                new EntityWrapper<JiafentijiaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiafentijiaoEntity> wrapper) {
		  Page<JiafentijiaoView> page =new Query<JiafentijiaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JiafentijiaoVO> selectListVO(Wrapper<JiafentijiaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiafentijiaoVO selectVO(Wrapper<JiafentijiaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiafentijiaoView> selectListView(Wrapper<JiafentijiaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiafentijiaoView selectView(Wrapper<JiafentijiaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
