package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XinxixiangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XinxixiangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XinxixiangView;


/**
 * 信息箱
 *
 * @author 
 * @email 
 * @date 2023-04-08 20:11:33
 */
public interface XinxixiangService extends IService<XinxixiangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XinxixiangVO> selectListVO(Wrapper<XinxixiangEntity> wrapper);
   	
   	XinxixiangVO selectVO(@Param("ew") Wrapper<XinxixiangEntity> wrapper);
   	
   	List<XinxixiangView> selectListView(Wrapper<XinxixiangEntity> wrapper);
   	
   	XinxixiangView selectView(@Param("ew") Wrapper<XinxixiangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XinxixiangEntity> wrapper);
   	

}

