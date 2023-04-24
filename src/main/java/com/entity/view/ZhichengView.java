package com.entity.view;

import com.entity.ZhichengEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 职称
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-04-08 20:11:33
 */
@TableName("zhicheng")
public class ZhichengView  extends ZhichengEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ZhichengView(){
	}
 
 	public ZhichengView(ZhichengEntity zhichengEntity){
 	try {
			BeanUtils.copyProperties(this, zhichengEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}