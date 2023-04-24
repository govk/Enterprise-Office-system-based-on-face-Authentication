package com.entity.vo;

import com.entity.QiyexiangmuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 企业项目
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2023-04-08 20:11:33
 */
public class QiyexiangmuVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 项目名称
	 */
	
	private String xiangmumingcheng;
		
	/**
	 * 项目级别
	 */
	
	private String xiangmujibie;
		
	/**
	 * 项目分类
	 */
	
	private String xiangmufenlei;
		
	/**
	 * 项目子类
	 */
	
	private String xiangmuzilei;
		
	/**
	 * 负责部门
	 */
	
	private String fuzebumen;
		
	/**
	 * 立项时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date lixiangshijian;
		
	/**
	 * 结项时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date jiexiangshijian;
		
	/**
	 * 批准号
	 */
	
	private String pizhunhao;
		
	/**
	 * 相关附件
	 */
	
	private String xiangguanfujian;
		
	/**
	 * 项目经费
	 */
	
	private Float xiangmujingfei;
		
	/**
	 * 参与人员
	 */
	
	private String canyurenyuan;
		
	/**
	 * 项目内容
	 */
	
	private String xiangmuneirong;
				
	
	/**
	 * 设置：项目名称
	 */
	 
	public void setXiangmumingcheng(String xiangmumingcheng) {
		this.xiangmumingcheng = xiangmumingcheng;
	}
	
	/**
	 * 获取：项目名称
	 */
	public String getXiangmumingcheng() {
		return xiangmumingcheng;
	}
				
	
	/**
	 * 设置：项目级别
	 */
	 
	public void setXiangmujibie(String xiangmujibie) {
		this.xiangmujibie = xiangmujibie;
	}
	
	/**
	 * 获取：项目级别
	 */
	public String getXiangmujibie() {
		return xiangmujibie;
	}
				
	
	/**
	 * 设置：项目分类
	 */
	 
	public void setXiangmufenlei(String xiangmufenlei) {
		this.xiangmufenlei = xiangmufenlei;
	}
	
	/**
	 * 获取：项目分类
	 */
	public String getXiangmufenlei() {
		return xiangmufenlei;
	}
				
	
	/**
	 * 设置：项目子类
	 */
	 
	public void setXiangmuzilei(String xiangmuzilei) {
		this.xiangmuzilei = xiangmuzilei;
	}
	
	/**
	 * 获取：项目子类
	 */
	public String getXiangmuzilei() {
		return xiangmuzilei;
	}
				
	
	/**
	 * 设置：负责部门
	 */
	 
	public void setFuzebumen(String fuzebumen) {
		this.fuzebumen = fuzebumen;
	}
	
	/**
	 * 获取：负责部门
	 */
	public String getFuzebumen() {
		return fuzebumen;
	}
				
	
	/**
	 * 设置：立项时间
	 */
	 
	public void setLixiangshijian(Date lixiangshijian) {
		this.lixiangshijian = lixiangshijian;
	}
	
	/**
	 * 获取：立项时间
	 */
	public Date getLixiangshijian() {
		return lixiangshijian;
	}
				
	
	/**
	 * 设置：结项时间
	 */
	 
	public void setJiexiangshijian(Date jiexiangshijian) {
		this.jiexiangshijian = jiexiangshijian;
	}
	
	/**
	 * 获取：结项时间
	 */
	public Date getJiexiangshijian() {
		return jiexiangshijian;
	}
				
	
	/**
	 * 设置：批准号
	 */
	 
	public void setPizhunhao(String pizhunhao) {
		this.pizhunhao = pizhunhao;
	}
	
	/**
	 * 获取：批准号
	 */
	public String getPizhunhao() {
		return pizhunhao;
	}
				
	
	/**
	 * 设置：相关附件
	 */
	 
	public void setXiangguanfujian(String xiangguanfujian) {
		this.xiangguanfujian = xiangguanfujian;
	}
	
	/**
	 * 获取：相关附件
	 */
	public String getXiangguanfujian() {
		return xiangguanfujian;
	}
				
	
	/**
	 * 设置：项目经费
	 */
	 
	public void setXiangmujingfei(Float xiangmujingfei) {
		this.xiangmujingfei = xiangmujingfei;
	}
	
	/**
	 * 获取：项目经费
	 */
	public Float getXiangmujingfei() {
		return xiangmujingfei;
	}
				
	
	/**
	 * 设置：参与人员
	 */
	 
	public void setCanyurenyuan(String canyurenyuan) {
		this.canyurenyuan = canyurenyuan;
	}
	
	/**
	 * 获取：参与人员
	 */
	public String getCanyurenyuan() {
		return canyurenyuan;
	}
				
	
	/**
	 * 设置：项目内容
	 */
	 
	public void setXiangmuneirong(String xiangmuneirong) {
		this.xiangmuneirong = xiangmuneirong;
	}
	
	/**
	 * 获取：项目内容
	 */
	public String getXiangmuneirong() {
		return xiangmuneirong;
	}
			
}
