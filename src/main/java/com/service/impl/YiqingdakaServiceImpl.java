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


import com.dao.YiqingdakaDao;
import com.entity.YiqingdakaEntity;
import com.service.YiqingdakaService;
import com.entity.vo.YiqingdakaVO;
import com.entity.view.YiqingdakaView;

@Service("yiqingdakaService")
public class YiqingdakaServiceImpl extends ServiceImpl<YiqingdakaDao, YiqingdakaEntity> implements YiqingdakaService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YiqingdakaEntity> page = this.selectPage(
                new Query<YiqingdakaEntity>(params).getPage(),
                new EntityWrapper<YiqingdakaEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YiqingdakaEntity> wrapper) {
		  Page<YiqingdakaView> page =new Query<YiqingdakaView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YiqingdakaVO> selectListVO(Wrapper<YiqingdakaEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YiqingdakaVO selectVO(Wrapper<YiqingdakaEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YiqingdakaView> selectListView(Wrapper<YiqingdakaEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YiqingdakaView selectView(Wrapper<YiqingdakaEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
