package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.QiyexiangmuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.QiyexiangmuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.QiyexiangmuView;


/**
 * 企业项目
 *
 * @author 
 * @email 
 * @date 2023-04-08 20:11:33
 */
public interface QiyexiangmuService extends IService<QiyexiangmuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<QiyexiangmuVO> selectListVO(Wrapper<QiyexiangmuEntity> wrapper);
   	
   	QiyexiangmuVO selectVO(@Param("ew") Wrapper<QiyexiangmuEntity> wrapper);
   	
   	List<QiyexiangmuView> selectListView(Wrapper<QiyexiangmuEntity> wrapper);
   	
   	QiyexiangmuView selectView(@Param("ew") Wrapper<QiyexiangmuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<QiyexiangmuEntity> wrapper);
   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<QiyexiangmuEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<QiyexiangmuEntity> wrapper);

    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<QiyexiangmuEntity> wrapper);



}

