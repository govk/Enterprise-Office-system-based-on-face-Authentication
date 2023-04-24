package com.entity.view;

import com.entity.WenjianfenleiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 文件分类
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-04-08 20:11:33
 */
@TableName("wenjianfenlei")
public class WenjianfenleiView  extends WenjianfenleiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public WenjianfenleiView(){
	}
 
 	public WenjianfenleiView(WenjianfenleiEntity wenjianfenleiEntity){
 	try {
			BeanUtils.copyProperties(this, wenjianfenleiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
