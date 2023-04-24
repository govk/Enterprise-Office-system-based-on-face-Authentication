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
 * 信息箱
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2023-04-08 20:11:33
 */
@TableName("xinxixiang")
public class XinxixiangEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public XinxixiangEntity() {
		
	}
	
	public XinxixiangEntity(T t) {
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
	 * 接送账号
	 */
					
	private String yuangonggonghao;
	
	/**
	 * 接送人
	 */
					
	private String yuangongxingming;
	
	/**
	 * 发送账号
	 */
					
	private String fasongzhanghao;
	
	/**
	 * 发送人
	 */
					
	private String fasongren;
	
	/**
	 * 聊天时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date liaotianshijian;
	
	/**
	 * 聊天内容
	 */
					
	private String liaotianneirong;
	
	/**
	 * 回复内容
	 */
					
	private String shhf;
	
	
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
	 * 设置：接送账号
	 */
	public void setYuangonggonghao(String yuangonggonghao) {
		this.yuangonggonghao = yuangonggonghao;
	}
	/**
	 * 获取：接送账号
	 */
	public String getYuangonggonghao() {
		return yuangonggonghao;
	}
	/**
	 * 设置：接送人
	 */
	public void setYuangongxingming(String yuangongxingming) {
		this.yuangongxingming = yuangongxingming;
	}
	/**
	 * 获取：接送人
	 */
	public String getYuangongxingming() {
		return yuangongxingming;
	}
	/**
	 * 设置：发送账号
	 */
	public void setFasongzhanghao(String fasongzhanghao) {
		this.fasongzhanghao = fasongzhanghao;
	}
	/**
	 * 获取：发送账号
	 */
	public String getFasongzhanghao() {
		return fasongzhanghao;
	}
	/**
	 * 设置：发送人
	 */
	public void setFasongren(String fasongren) {
		this.fasongren = fasongren;
	}
	/**
	 * 获取：发送人
	 */
	public String getFasongren() {
		return fasongren;
	}
	/**
	 * 设置：聊天时间
	 */
	public void setLiaotianshijian(Date liaotianshijian) {
		this.liaotianshijian = liaotianshijian;
	}
	/**
	 * 获取：聊天时间
	 */
	public Date getLiaotianshijian() {
		return liaotianshijian;
	}
	/**
	 * 设置：聊天内容
	 */
	public void setLiaotianneirong(String liaotianneirong) {
		this.liaotianneirong = liaotianneirong;
	}
	/**
	 * 获取：聊天内容
	 */
	public String getLiaotianneirong() {
		return liaotianneirong;
	}
	/**
	 * 设置：回复内容
	 */
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	/**
	 * 获取：回复内容
	 */
	public String getShhf() {
		return shhf;
	}

}
