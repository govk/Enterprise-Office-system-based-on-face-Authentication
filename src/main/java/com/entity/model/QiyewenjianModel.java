package com.entity.model;

import com.entity.QiyewenjianEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 企业文件
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2023-04-08 20:11:33
 */
public class QiyewenjianModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 文件分类
	 */
	
	private String wenjianfenlei;
		
	/**
	 * 封面
	 */
	
	private String fengmian;
		
	/**
	 * 相关部门
	 */
	
	private String xiangguanbumen;
		
	/**
	 * 文件
	 */
	
	private String wenjian;
		
	/**
	 * 更新时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date gengxinshijian;
		
	/**
	 * 文件简介
	 */
	
	private String wenjianjianjie;
				
	
	/**
	 * 设置：文件分类
	 */
	 
	public void setWenjianfenlei(String wenjianfenlei) {
		this.wenjianfenlei = wenjianfenlei;
	}
	
	/**
	 * 获取：文件分类
	 */
	public String getWenjianfenlei() {
		return wenjianfenlei;
	}
				
	
	/**
	 * 设置：封面
	 */
	 
	public void setFengmian(String fengmian) {
		this.fengmian = fengmian;
	}
	
	/**
	 * 获取：封面
	 */
	public String getFengmian() {
		return fengmian;
	}
				
	
	/**
	 * 设置：相关部门
	 */
	 
	public void setXiangguanbumen(String xiangguanbumen) {
		this.xiangguanbumen = xiangguanbumen;
	}
	
	/**
	 * 获取：相关部门
	 */
	public String getXiangguanbumen() {
		return xiangguanbumen;
	}
				
	
	/**
	 * 设置：文件
	 */
	 
	public void setWenjian(String wenjian) {
		this.wenjian = wenjian;
	}
	
	/**
	 * 获取：文件
	 */
	public String getWenjian() {
		return wenjian;
	}
				
	
	/**
	 * 设置：更新时间
	 */
	 
	public void setGengxinshijian(Date gengxinshijian) {
		this.gengxinshijian = gengxinshijian;
	}
	
	/**
	 * 获取：更新时间
	 */
	public Date getGengxinshijian() {
		return gengxinshijian;
	}
				
	
	/**
	 * 设置：文件简介
	 */
	 
	public void setWenjianjianjie(String wenjianjianjie) {
		this.wenjianjianjie = wenjianjianjie;
	}
	
	/**
	 * 获取：文件简介
	 */
	public String getWenjianjianjie() {
		return wenjianjianjie;
	}
			
}
