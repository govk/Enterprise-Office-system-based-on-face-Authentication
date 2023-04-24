package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.QiyewenjianEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.QiyewenjianVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.QiyewenjianView;


/**
 * 企业文件
 *
 * @author 
 * @email 
 * @date 2023-04-08 20:11:33
 */
public interface QiyewenjianService extends IService<QiyewenjianEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<QiyewenjianVO> selectListVO(Wrapper<QiyewenjianEntity> wrapper);
   	
   	QiyewenjianVO selectVO(@Param("ew") Wrapper<QiyewenjianEntity> wrapper);
   	
   	List<QiyewenjianView> selectListView(Wrapper<QiyewenjianEntity> wrapper);
   	
   	QiyewenjianView selectView(@Param("ew") Wrapper<QiyewenjianEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<QiyewenjianEntity> wrapper);
   	

}

