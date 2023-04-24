package com.entity.vo;

import com.entity.XinxixiangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 信息箱
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2023-04-08 20:11:33
 */
public class XinxixiangVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
