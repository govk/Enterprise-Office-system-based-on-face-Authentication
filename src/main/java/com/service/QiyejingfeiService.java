package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.QiyejingfeiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.QiyejingfeiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.QiyejingfeiView;


/**
 * 企业经费
 *
 * @author 
 * @email 
 * @date 2023-04-08 20:11:33
 */
public interface QiyejingfeiService extends IService<QiyejingfeiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<QiyejingfeiVO> selectListVO(Wrapper<QiyejingfeiEntity> wrapper);
   	
   	QiyejingfeiVO selectVO(@Param("ew") Wrapper<QiyejingfeiEntity> wrapper);
   	
   	List<QiyejingfeiView> selectListView(Wrapper<QiyejingfeiEntity> wrapper);
   	
   	QiyejingfeiView selectView(@Param("ew") Wrapper<QiyejingfeiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<QiyejingfeiEntity> wrapper);
   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<QiyejingfeiEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<QiyejingfeiEntity> wrapper);

    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<QiyejingfeiEntity> wrapper);



}

