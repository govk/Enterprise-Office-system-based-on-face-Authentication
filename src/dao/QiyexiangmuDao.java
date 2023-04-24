package com.dao;

import com.entity.QiyexiangmuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.QiyexiangmuVO;
import com.entity.view.QiyexiangmuView;


/**
 * 企业项目
 * 
 * @author 
 * @email 
 * @date 2023-04-08 20:11:33
 */
public interface QiyexiangmuDao extends BaseMapper<QiyexiangmuEntity> {
	
	List<QiyexiangmuVO> selectListVO(@Param("ew") Wrapper<QiyexiangmuEntity> wrapper);
	
	QiyexiangmuVO selectVO(@Param("ew") Wrapper<QiyexiangmuEntity> wrapper);
	
	List<QiyexiangmuView> selectListView(@Param("ew") Wrapper<QiyexiangmuEntity> wrapper);

	List<QiyexiangmuView> selectListView(Pagination page,@Param("ew") Wrapper<QiyexiangmuEntity> wrapper);
	
	QiyexiangmuView selectView(@Param("ew") Wrapper<QiyexiangmuEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params")Map<String, Object> params,@Param("ew") Wrapper<QiyexiangmuEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<QiyexiangmuEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<QiyexiangmuEntity> wrapper);



}
