package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 企业项目
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2023-04-08 20:11:33
 */
@TableName("qiyexiangmu")
public class QiyexiangmuEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public QiyexiangmuEntity() {
		
	}
	
	public QiyexiangmuEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 项目编号
	 */
					
	private String xiangmubianhao;
	
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
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date lixiangshijian;
	
	/**
	 * 结项时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
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
