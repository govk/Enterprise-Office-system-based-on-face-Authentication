package com.dao;

import com.entity.QiyejingfeiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.QiyejingfeiVO;
import com.entity.view.QiyejingfeiView;


/**
 * 企业经费
 * 
 * @author 
 * @email 
 * @date 2023-04-08 20:11:33
 */
public interface QiyejingfeiDao extends BaseMapper<QiyejingfeiEntity> {
	
	List<QiyejingfeiVO> selectListVO(@Param("ew") Wrapper<QiyejingfeiEntity> wrapper);
	
	QiyejingfeiVO selectVO(@Param("ew") Wrapper<QiyejingfeiEntity> wrapper);
	
	List<QiyejingfeiView> selectListView(@Param("ew") Wrapper<QiyejingfeiEntity> wrapper);

	List<QiyejingfeiView> selectListView(Pagination page,@Param("ew") Wrapper<QiyejingfeiEntity> wrapper);
	
	QiyejingfeiView selectView(@Param("ew") Wrapper<QiyejingfeiEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params")Map<String, Object> params,@Param("ew") Wrapper<QiyejingfeiEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<QiyejingfeiEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<QiyejingfeiEntity> wrapper);



}
