package com.dao;

import com.entity.QiyewenjianEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.QiyewenjianVO;
import com.entity.view.QiyewenjianView;


/**
 * 企业文件
 * 
 * @author 
 * @email 
 * @date 2023-04-08 20:11:33
 */
public interface QiyewenjianDao extends BaseMapper<QiyewenjianEntity> {
	
	List<QiyewenjianVO> selectListVO(@Param("ew") Wrapper<QiyewenjianEntity> wrapper);
	
	QiyewenjianVO selectVO(@Param("ew") Wrapper<QiyewenjianEntity> wrapper);
	
	List<QiyewenjianView> selectListView(@Param("ew") Wrapper<QiyewenjianEntity> wrapper);

	List<QiyewenjianView> selectListView(Pagination page,@Param("ew") Wrapper<QiyewenjianEntity> wrapper);
	
	QiyewenjianView selectView(@Param("ew") Wrapper<QiyewenjianEntity> wrapper);
	

}
