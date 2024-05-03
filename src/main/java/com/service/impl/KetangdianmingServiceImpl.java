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


import com.dao.KetangdianmingDao;
import com.entity.KetangdianmingEntity;
import com.service.KetangdianmingService;
import com.entity.vo.KetangdianmingVO;
import com.entity.view.KetangdianmingView;

@Service("ketangdianmingService")
public class KetangdianmingServiceImpl extends ServiceImpl<KetangdianmingDao, KetangdianmingEntity> implements KetangdianmingService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<KetangdianmingEntity> page = this.selectPage(
                new Query<KetangdianmingEntity>(params).getPage(),
                new EntityWrapper<KetangdianmingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<KetangdianmingEntity> wrapper) {
		  Page<KetangdianmingView> page =new Query<KetangdianmingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<KetangdianmingVO> selectListVO(Wrapper<KetangdianmingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public KetangdianmingVO selectVO(Wrapper<KetangdianmingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<KetangdianmingView> selectListView(Wrapper<KetangdianmingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public KetangdianmingView selectView(Wrapper<KetangdianmingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
