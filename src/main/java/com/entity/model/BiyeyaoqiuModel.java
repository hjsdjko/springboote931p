package com.entity.model;

import com.entity.BiyeyaoqiuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 毕业要求
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-03-14 14:49:11
 */
public class BiyeyaoqiuModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 姓名
	 */
	
	private String xingming;
		
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
	 * 要求
	 */
	
	private String yaoqiu;
		
	/**
	 * 是否完成
	 */
	
	private String shifouwancheng;
		
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
	 * 设置：要求
	 */
	 
	public void setYaoqiu(String yaoqiu) {
		this.yaoqiu = yaoqiu;
	}
	
	/**
	 * 获取：要求
	 */
	public String getYaoqiu() {
		return yaoqiu;
	}
				
	
	/**
	 * 设置：是否完成
	 */
	 
	public void setShifouwancheng(String shifouwancheng) {
		this.shifouwancheng = shifouwancheng;
	}
	
	/**
	 * 获取：是否完成
	 */
	public String getShifouwancheng() {
		return shifouwancheng;
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
			
}
