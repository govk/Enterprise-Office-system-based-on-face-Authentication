package com.entity.view;

import com.entity.QiyewenjianEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 企业文件
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-04-08 20:11:33
 */
@TableName("qiyewenjian")
public class QiyewenjianView  extends QiyewenjianEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public QiyewenjianView(){
	}
 
 	public QiyewenjianView(QiyewenjianEntity qiyewenjianEntity){
 	try {
			BeanUtils.copyProperties(this, qiyewenjianEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}