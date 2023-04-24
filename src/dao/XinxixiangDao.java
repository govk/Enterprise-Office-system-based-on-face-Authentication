package com.dao;

import com.entity.XinxixiangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XinxixiangVO;
import com.entity.view.XinxixiangView;


/**
 * 信息箱
 * 
 * @author 
 * @email 
 * @date 2023-04-08 20:11:33
 */
public interface XinxixiangDao extends BaseMapper<XinxixiangEntity> {
	
	List<XinxixiangVO> selectListVO(@Param("ew") Wrapper<XinxixiangEntity> wrapper);
	
	XinxixiangVO selectVO(@Param("ew") Wrapper<XinxixiangEntity> wrapper);
	
	List<XinxixiangView> selectListView(@Param("ew") Wrapper<XinxixiangEntity> wrapper);

	List<XinxixiangView> selectListView(Pagination page,@Param("ew") Wrapper<XinxixiangEntity> wrapper);
	
	XinxixiangView selectView(@Param("ew") Wrapper<XinxixiangEntity> wrapper);
	

}
