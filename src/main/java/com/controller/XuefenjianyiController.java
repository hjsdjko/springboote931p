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

import com.entity.XuefenjianyiEntity;
import com.entity.view.XuefenjianyiView;

import com.service.XuefenjianyiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 学分建议
 * 后端接口
 * @author 
 * @email 
 * @date 2022-03-14 14:49:11
 */
@RestController
@RequestMapping("/xuefenjianyi")
public class XuefenjianyiController {
    @Autowired
    private XuefenjianyiService xuefenjianyiService;


    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,XuefenjianyiEntity xuefenjianyi,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("xuesheng")) {
			xuefenjianyi.setXuehao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("jiaoshi")) {
			xuefenjianyi.setJiaoshizhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<XuefenjianyiEntity> ew = new EntityWrapper<XuefenjianyiEntity>();
		PageUtils page = xuefenjianyiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, xuefenjianyi), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,XuefenjianyiEntity xuefenjianyi, 
		HttpServletRequest request){
        EntityWrapper<XuefenjianyiEntity> ew = new EntityWrapper<XuefenjianyiEntity>();
		PageUtils page = xuefenjianyiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, xuefenjianyi), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( XuefenjianyiEntity xuefenjianyi){
       	EntityWrapper<XuefenjianyiEntity> ew = new EntityWrapper<XuefenjianyiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( xuefenjianyi, "xuefenjianyi")); 
        return R.ok().put("data", xuefenjianyiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(XuefenjianyiEntity xuefenjianyi){
        EntityWrapper< XuefenjianyiEntity> ew = new EntityWrapper< XuefenjianyiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( xuefenjianyi, "xuefenjianyi")); 
		XuefenjianyiView xuefenjianyiView =  xuefenjianyiService.selectView(ew);
		return R.ok("查询学分建议成功").put("data", xuefenjianyiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        XuefenjianyiEntity xuefenjianyi = xuefenjianyiService.selectById(id);
        return R.ok().put("data", xuefenjianyi);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        XuefenjianyiEntity xuefenjianyi = xuefenjianyiService.selectById(id);
        return R.ok().put("data", xuefenjianyi);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody XuefenjianyiEntity xuefenjianyi, HttpServletRequest request){
    	xuefenjianyi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(xuefenjianyi);
        xuefenjianyiService.insert(xuefenjianyi);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
	@IgnoreAuth
    @RequestMapping("/add")
    public R add(@RequestBody XuefenjianyiEntity xuefenjianyi, HttpServletRequest request){
    	xuefenjianyi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(xuefenjianyi);
        xuefenjianyiService.insert(xuefenjianyi);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody XuefenjianyiEntity xuefenjianyi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(xuefenjianyi);
        xuefenjianyiService.updateById(xuefenjianyi);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        xuefenjianyiService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<XuefenjianyiEntity> wrapper = new EntityWrapper<XuefenjianyiEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("xuesheng")) {
			wrapper.eq("xuehao", (String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("jiaoshi")) {
			wrapper.eq("jiaoshizhanghao", (String)request.getSession().getAttribute("username"));
		}

		int count = xuefenjianyiService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	







}
