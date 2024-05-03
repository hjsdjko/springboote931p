package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.BanjijianyiEntity;
import com.entity.view.BanjijianyiView;

import com.service.BanjijianyiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 班级建议
 * 后端接口
 * @author 
 * @email 
 * @date 2022-03-14 14:49:11
 */
@RestController
@RequestMapping("/banjijianyi")
public class BanjijianyiController {
    @Autowired
    private BanjijianyiService banjijianyiService;


    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,BanjijianyiEntity banjijianyi,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("jiaoshi")) {
			banjijianyi.setJiaoshizhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<BanjijianyiEntity> ew = new EntityWrapper<BanjijianyiEntity>();
		PageUtils page = banjijianyiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, banjijianyi), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,BanjijianyiEntity banjijianyi, 
		HttpServletRequest request){
        EntityWrapper<BanjijianyiEntity> ew = new EntityWrapper<BanjijianyiEntity>();
		PageUtils page = banjijianyiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, banjijianyi), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( BanjijianyiEntity banjijianyi){
       	EntityWrapper<BanjijianyiEntity> ew = new EntityWrapper<BanjijianyiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( banjijianyi, "banjijianyi")); 
        return R.ok().put("data", banjijianyiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(BanjijianyiEntity banjijianyi){
        EntityWrapper< BanjijianyiEntity> ew = new EntityWrapper< BanjijianyiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( banjijianyi, "banjijianyi")); 
		BanjijianyiView banjijianyiView =  banjijianyiService.selectView(ew);
		return R.ok("查询班级建议成功").put("data", banjijianyiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        BanjijianyiEntity banjijianyi = banjijianyiService.selectById(id);
        return R.ok().put("data", banjijianyi);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        BanjijianyiEntity banjijianyi = banjijianyiService.selectById(id);
        return R.ok().put("data", banjijianyi);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody BanjijianyiEntity banjijianyi, HttpServletRequest request){
    	banjijianyi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(banjijianyi);
        banjijianyiService.insert(banjijianyi);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
	@IgnoreAuth
    @RequestMapping("/add")
    public R add(@RequestBody BanjijianyiEntity banjijianyi, HttpServletRequest request){
    	banjijianyi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(banjijianyi);
        banjijianyiService.insert(banjijianyi);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody BanjijianyiEntity banjijianyi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(banjijianyi);
        banjijianyiService.updateById(banjijianyi);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        banjijianyiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<BanjijianyiEntity> wrapper = new EntityWrapper<BanjijianyiEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("jiaoshi")) {
			wrapper.eq("jiaoshizhanghao", (String)request.getSession().getAttribute("username"));
		}

		int count = banjijianyiService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	







}
