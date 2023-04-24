package com.entity.model;

import com.entity.QiyejingfeiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 企业经费
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2023-04-08 20:11:33
 */
public class QiyejingfeiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 项目编号
	 */
	
	private String xiangmubianhao;
		
	/**
	 * 项目名称
	 */
	
	private String xiangmumingcheng;
		
	/**
	 * 部门
	 */
	
	private String bumen;
		
	/**
	 * 到账时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date daozhangshijian;
		
	/**
	 * 到账经费
	 */
	
	private Float daozhangjingfei;
		
	/**
	 * 操作人
	 */
	
	private String caozuoren;
		
	/**
	 * 拨款单位
	 */
	
	private String bokuandanwei;
				
	
	/**
	 * 设置：项目编号
	 */
	 
	public void setXiangmubianhao(String xiangmubianhao) {
		this.xiangmubianhao = xiangmubianhao;
	}
	
	/**
	 * 获取：项目编号
	 */
	public String getXiangmubianhao() {
		return xiangmubianhao;
	}
				
	
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
	 * 设置：部门
	 */
	 
	public void setBumen(String bumen) {
		this.bumen = bumen;
	}
	
	/**
	 * 获取：部门
	 */
	public String getBumen() {
		return bumen;
	}
				
	
	/**
	 * 设置：到账时间
	 */
	 
	public void setDaozhangshijian(Date daozhangshijian) {
		this.daozhangshijian = daozhangshijian;
	}
	
	/**
	 * 获取：到账时间
	 */
	public Date getDaozhangshijian() {
		return daozhangshijian;
	}
				
	
	/**
	 * 设置：到账经费
	 */
	 
	public void setDaozhangjingfei(Float daozhangjingfei) {
		this.daozhangjingfei = daozhangjingfei;
	}
	
	/**
	 * 获取：到账经费
	 */
	public Float getDaozhangjingfei() {
		return daozhangjingfei;
	}
				
	
	/**
	 * 设置：操作人
	 */
	 
	public void setCaozuoren(String caozuoren) {
		this.caozuoren = caozuoren;
	}
	
	/**
	 * 获取：操作人
	 */
	public String getCaozuoren() {
		return caozuoren;
	}
				
	
	/**
	 * 设置：拨款单位
	 */
	 
	public void setBokuandanwei(String bokuandanwei) {
		this.bokuandanwei = bokuandanwei;
	}
	
	/**
	 * 获取：拨款单位
	 */
	public String getBokuandanwei() {
		return bokuandanwei;
	}
			
}
