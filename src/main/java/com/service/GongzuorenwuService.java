package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.GongzuorenwuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.GongzuorenwuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.GongzuorenwuView;


/**
 * 工作任务
 *
 * @author 
 * @email 
 * @date 2023-04-08 20:11:33
 */
public interface GongzuorenwuService extends IService<GongzuorenwuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<GongzuorenwuVO> selectListVO(Wrapper<GongzuorenwuEntity> wrapper);
   	
   	GongzuorenwuVO selectVO(@Param("ew") Wrapper<GongzuorenwuEntity> wrapper);
   	
   	List<GongzuorenwuView> selectListView(Wrapper<GongzuorenwuEntity> wrapper);
   	
   	GongzuorenwuView selectView(@Param("ew") Wrapper<GongzuorenwuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<GongzuorenwuEntity> wrapper);
   	

}

