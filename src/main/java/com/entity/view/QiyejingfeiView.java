package com.entity.view;

import com.entity.QiyejingfeiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 企业经费
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-04-08 20:11:33
 */
@TableName("qiyejingfei")
public class QiyejingfeiView  extends QiyejingfeiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public QiyejingfeiView(){
	}
 
 	public QiyejingfeiView(QiyejingfeiEntity qiyejingfeiEntity){
 	try {
			BeanUtils.copyProperties(this, qiyejingfeiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
