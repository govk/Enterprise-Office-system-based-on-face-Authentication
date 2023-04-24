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
 * 企业经费
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2023-04-08 20:11:33
 */
@TableName("qiyejingfei")
public class QiyejingfeiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public QiyejingfeiEntity() {
		
	}
	
	public QiyejingfeiEntity(T t) {
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
	 * 凭单号
	 */
					
	private String pingdanhao;
	
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
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
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
	 * 设置：凭单号
	 */
	public void setPingdanhao(String pingdanhao) {
		this.pingdanhao = pingdanhao;
	}
	/**
	 * 获取：凭单号
	 */
	public String getPingdanhao() {
		return pingdanhao;
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
