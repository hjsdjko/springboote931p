package com.entity.vo;

import com.entity.XueshengEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 学生
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-03-14 14:49:11
 */
public class XueshengVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 密码
	 */
	
	private String mima;
		
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 年龄
	 */
	
	private String nianling;
		
	/**
	 * 性别
	 */
	
	private String xingbie;
		
	/**
	 * 手机
	 */
	
	private String shouji;
		
	/**
	 * 身份
	 */
	
	private String shenfen;
		
	/**
	 * 班级
	 */
	
	private String banji;
		
	/**
	 * 年级
	 */
	
	private String nianji;
		
	/**
	 * 学院
	 */
	
	private String xueyuan;
		
	/**
	 * 照片
	 */
	
	private String zhaopian;
		
	/**
	 * 教师账号
	 */
	
	private String jiaoshizhanghao;
		
	/**
	 * 教师姓名
	 */
	
	private String jiaoshixingming;
				
	
	/**
	 * 设置：密码
	 */
	 
	public void setMima(String mima) {
		this.mima = mima;
	}
	
	/**
	 * 获取：密码
	 */
	public String getMima() {
		return mima;
	}
				
	
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
	 * 设置：年龄
	 */
	 
	public void setNianling(String nianling) {
		this.nianling = nianling;
	}
	
	/**
	 * 获取：年龄
	 */
	public String getNianling() {
		return nianling;
	}
				
	
	/**
	 * 设置：性别
	 */
	 
	public void setXingbie(String xingbie) {
		this.xingbie = xingbie;
	}
	
	/**
	 * 获取：性别
	 */
	public String getXingbie() {
		return xingbie;
	}
				
	
	/**
	 * 设置：手机
	 */
	 
	public void setShouji(String shouji) {
		this.shouji = shouji;
	}
	
	/**
	 * 获取：手机
	 */
	public String getShouji() {
		return shouji;
	}
				
	
	/**
	 * 设置：身份
	 */
	 
	public void setShenfen(String shenfen) {
		this.shenfen = shenfen;
	}
	
	/**
	 * 获取：身份
	 */
	public String getShenfen() {
		return shenfen;
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
	 * 设置：年级
	 */
	 
	public void setNianji(String nianji) {
		this.nianji = nianji;
	}
	
	/**
	 * 获取：年级
	 */
	public String getNianji() {
		return nianji;
	}
				
	
	/**
	 * 设置：学院
	 */
	 
	public void setXueyuan(String xueyuan) {
		this.xueyuan = xueyuan;
	}
	
	/**
	 * 获取：学院
	 */
	public String getXueyuan() {
		return xueyuan;
	}
				
	
	/**
	 * 设置：照片
	 */
	 
	public void setZhaopian(String zhaopian) {
		this.zhaopian = zhaopian;
	}
	
	/**
	 * 获取：照片
	 */
	public String getZhaopian() {
		return zhaopian;
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
			
}
