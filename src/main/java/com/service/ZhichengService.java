package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZhichengEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZhichengVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhichengView;


/**
 * 职称
 *
 * @author 
 * @email 
 * @date 2023-04-08 20:11:33
 */
public interface ZhichengService extends IService<ZhichengEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZhichengVO> selectListVO(Wrapper<ZhichengEntity> wrapper);
   	
   	ZhichengVO selectVO(@Param("ew") Wrapper<ZhichengEntity> wrapper);
   	
   	List<ZhichengView> selectListView(Wrapper<ZhichengEntity> wrapper);
   	
   	ZhichengView selectView(@Param("ew") Wrapper<ZhichengEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZhichengEntity> wrapper);
   	

}

