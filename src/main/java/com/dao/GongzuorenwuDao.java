package com.dao;

import com.entity.GongzuorenwuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.GongzuorenwuVO;
import com.entity.view.GongzuorenwuView;


/**
 * 工作任务
 * 
 * @author 
 * @email 
 * @date 2023-04-08 20:11:33
 */
public interface GongzuorenwuDao extends BaseMapper<GongzuorenwuEntity> {
	
	List<GongzuorenwuVO> selectListVO(@Param("ew") Wrapper<GongzuorenwuEntity> wrapper);
	
	GongzuorenwuVO selectVO(@Param("ew") Wrapper<GongzuorenwuEntity> wrapper);
	
	List<GongzuorenwuView> selectListView(@Param("ew") Wrapper<GongzuorenwuEntity> wrapper);

	List<GongzuorenwuView> selectListView(Pagination page,@Param("ew") Wrapper<GongzuorenwuEntity> wrapper);
	
	GongzuorenwuView selectView(@Param("ew") Wrapper<GongzuorenwuEntity> wrapper);
	

}
