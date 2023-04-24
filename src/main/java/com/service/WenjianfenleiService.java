package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.WenjianfenleiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.WenjianfenleiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.WenjianfenleiView;


/**
 * 文件分类
 *
 * @author 
 * @email 
 * @date 2023-04-08 20:11:33
 */
public interface WenjianfenleiService extends IService<WenjianfenleiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<WenjianfenleiVO> selectListVO(Wrapper<WenjianfenleiEntity> wrapper);
   	
   	WenjianfenleiVO selectVO(@Param("ew") Wrapper<WenjianfenleiEntity> wrapper);
   	
   	List<WenjianfenleiView> selectListView(Wrapper<WenjianfenleiEntity> wrapper);
   	
   	WenjianfenleiView selectView(@Param("ew") Wrapper<WenjianfenleiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<WenjianfenleiEntity> wrapper);
   	

}

