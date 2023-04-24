package com.dao;

import com.entity.WenjianfenleiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.WenjianfenleiVO;
import com.entity.view.WenjianfenleiView;


/**
 * 文件分类
 * 
 * @author 
 * @email 
 * @date 2023-04-08 20:11:33
 */
public interface WenjianfenleiDao extends BaseMapper<WenjianfenleiEntity> {
	
	List<WenjianfenleiVO> selectListVO(@Param("ew") Wrapper<WenjianfenleiEntity> wrapper);
	
	WenjianfenleiVO selectVO(@Param("ew") Wrapper<WenjianfenleiEntity> wrapper);
	
	List<WenjianfenleiView> selectListView(@Param("ew") Wrapper<WenjianfenleiEntity> wrapper);

	List<WenjianfenleiView> selectListView(Pagination page,@Param("ew") Wrapper<WenjianfenleiEntity> wrapper);
	
	WenjianfenleiView selectView(@Param("ew") Wrapper<WenjianfenleiEntity> wrapper);
	

}
