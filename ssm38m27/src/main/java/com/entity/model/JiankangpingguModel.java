package com.entity.model;

import com.entity.JiankangpingguEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 健康评估
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-04-22 11:32:34
 */
public class JiankangpingguModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 评估情况
	 */
	
	private String pingguqingkuang;
		
	/**
	 * 评估图片
	 */
	
	private String pinggutupian;
		
	/**
	 * 评估内容
	 */
	
	private String pingguneirong;
		
	/**
	 * 日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date riqi;
		
	/**
	 * 医生工号
	 */
	
	private String yishenggonghao;
		
	/**
	 * 跨表用户id
	 */
	
	private Long crossuserid;
		
	/**
	 * 跨表主键id
	 */
	
	private Long crossrefid;
				
	
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
	 * 设置：评估情况
	 */
	 
	public void setPingguqingkuang(String pingguqingkuang) {
		this.pingguqingkuang = pingguqingkuang;
	}
	
	/**
	 * 获取：评估情况
	 */
	public String getPingguqingkuang() {
		return pingguqingkuang;
	}
				
	
	/**
	 * 设置：评估图片
	 */
	 
	public void setPinggutupian(String pinggutupian) {
		this.pinggutupian = pinggutupian;
	}
	
	/**
	 * 获取：评估图片
	 */
	public String getPinggutupian() {
		return pinggutupian;
	}
				
	
	/**
	 * 设置：评估内容
	 */
	 
	public void setPingguneirong(String pingguneirong) {
		this.pingguneirong = pingguneirong;
	}
	
	/**
	 * 获取：评估内容
	 */
	public String getPingguneirong() {
		return pingguneirong;
	}
				
	
	/**
	 * 设置：日期
	 */
	 
	public void setRiqi(Date riqi) {
		this.riqi = riqi;
	}
	
	/**
	 * 获取：日期
	 */
	public Date getRiqi() {
		return riqi;
	}
				
	
	/**
	 * 设置：医生工号
	 */
	 
	public void setYishenggonghao(String yishenggonghao) {
		this.yishenggonghao = yishenggonghao;
	}
	
	/**
	 * 获取：医生工号
	 */
	public String getYishenggonghao() {
		return yishenggonghao;
	}
				
	
	/**
	 * 设置：跨表用户id
	 */
	 
	public void setCrossuserid(Long crossuserid) {
		this.crossuserid = crossuserid;
	}
	
	/**
	 * 获取：跨表用户id
	 */
	public Long getCrossuserid() {
		return crossuserid;
	}
				
	
	/**
	 * 设置：跨表主键id
	 */
	 
	public void setCrossrefid(Long crossrefid) {
		this.crossrefid = crossrefid;
	}
	
	/**
	 * 获取：跨表主键id
	 */
	public Long getCrossrefid() {
		return crossrefid;
	}
			
}
