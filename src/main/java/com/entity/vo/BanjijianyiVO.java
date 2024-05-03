package com.entity.vo;

import com.entity.BanjijianyiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 班级建议
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-03-14 14:49:11
 */
public class BanjijianyiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 班级学分
	 */
	
	private Integer banjixuefen;
		
	/**
	 * 建议时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date jianyishijian;
		
	/**
	 * 教师账号
	 */
	
	private String jiaoshizhanghao;
		
	/**
	 * 教师姓名
	 */
	
	private String jiaoshixingming;
		
	/**
	 * 班级
	 */
	
	private String banji;
		
	/**
	 * 建议内容
	 */
	
	private String jianyineirong;
				
	
	/**
	 * 设置：班级学分
	 */
	 
	public void setBanjixuefen(Integer banjixuefen) {
		this.banjixuefen = banjixuefen;
	}
	
	/**
	 * 获取：班级学分
	 */
	public Integer getBanjixuefen() {
		return banjixuefen;
	}
				
	
	/**
	 * 设置：建议时间
	 */
	 
	public void setJianyishijian(Date jianyishijian) {
		this.jianyishijian = jianyishijian;
	}
	
	/**
	 * 获取：建议时间
	 */
	public Date getJianyishijian() {
		return jianyishijian;
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
	 * 设置：班级
	 */
	 
	public void setBanji(String banji) {
		this.banji = banji;
	}
	
	/**
	 * 获取：班级
	 */
	public String getBanji() {
		return banji;
	}
				
	
	/**
	 * 设置：建议内容
	 */
	 
	public void setJianyineirong(String jianyineirong) {
		this.jianyineirong = jianyineirong;
	}
	
	/**
	 * 获取：建议内容
	 */
	public String getJianyineirong() {
		return jianyineirong;
	}
			
}
