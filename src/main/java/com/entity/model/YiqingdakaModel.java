package com.entity.model;

import com.entity.YiqingdakaEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 疫情打卡
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-03-14 14:49:12
 */
public class YiqingdakaModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 打卡
	 */
	
	private String daka;
		
	/**
	 * 打卡时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date dakashijian;
		
	/**
	 * 是否发烧
	 */
	
	private String shifoufashao;
		
	/**
	 * 体温
	 */
	
	private Float tiwen;
		
	/**
	 * 备注
	 */
	
	private String beizhu;
		
	/**
	 * 教师账号
	 */
	
	private String jiaoshizhanghao;
		
	/**
	 * 教师姓名
	 */
	
	private String jiaoshixingming;
		
	/**
	 * 经度
	 */
	
	private Float longitude;
		
	/**
	 * 纬度
	 */
	
	private Float latitude;
		
	/**
	 * 地址
	 */
	
	private String fulladdress;
				
	
	/**
	 * 设置：姓名
	 */
	 
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
				
	
	/**
	 * 设置：打卡
	 */
	 
	public void setDaka(String daka) {
		this.daka = daka;
	}
	
	/**
	 * 获取：打卡
	 */
	public String getDaka() {
		return daka;
	}
				
	
	/**
	 * 设置：打卡时间
	 */
	 
	public void setDakashijian(Date dakashijian) {
		this.dakashijian = dakashijian;
	}
	
	/**
	 * 获取：打卡时间
	 */
	public Date getDakashijian() {
		return dakashijian;
	}
				
	
	/**
	 * 设置：是否发烧
	 */
	 
	public void setShifoufashao(String shifoufashao) {
		this.shifoufashao = shifoufashao;
	}
	
	/**
	 * 获取：是否发烧
	 */
	public String getShifoufashao() {
		return shifoufashao;
	}
				
	
	/**
	 * 设置：体温
	 */
	 
	public void setTiwen(Float tiwen) {
		this.tiwen = tiwen;
	}
	
	/**
	 * 获取：体温
	 */
	public Float getTiwen() {
		return tiwen;
	}
				
	
	/**
	 * 设置：备注
	 */
	 
	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}
	
	/**
	 * 获取：备注
	 */
	public String getBeizhu() {
		return beizhu;
	}
				
	
	/**
	 * 设置：教师账号
	 */
	 
	public void setJiaoshizhanghao(String jiaoshizhanghao) {
		this.jiaoshizhanghao = jiaoshizhanghao;
	}
	
	/**
	 * 获取：教师账号
	 */
	public String getJiaoshizhanghao() {
		return jiaoshizhanghao;
	}
				
	
	/**
	 * 设置：教师姓名
	 */
	 
	public void setJiaoshixingming(String jiaoshixingming) {
		this.jiaoshixingming = jiaoshixingming;
	}
	
	/**
	 * 获取：教师姓名
	 */
	public String getJiaoshixingming() {
		return jiaoshixingming;
	}
				
	
	/**
	 * 设置：经度
	 */
	 
	public void setLongitude(Float longitude) {
		this.longitude = longitude;
	}
	
	/**
	 * 获取：经度
	 */
	public Float getLongitude() {
		return longitude;
	}
				
	
	/**
	 * 设置：纬度
	 */
	 
	public void setLatitude(Float latitude) {
		this.latitude = latitude;
	}
	
	/**
	 * 获取：纬度
	 */
	public Float getLatitude() {
		return latitude;
	}
				
	
	/**
	 * 设置：地址
	 */
	 
	public void setFulladdress(String fulladdress) {
		this.fulladdress = fulladdress;
	}
	
	/**
	 * 获取：地址
	 */
	public String getFulladdress() {
		return fulladdress;
	}
			
}
