package com.dao;

import com.entity.ZhichengEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZhichengVO;
import com.entity.view.ZhichengView;


/**
 * 职称
 * 
 * @author 
 * @email 
 * @date 2023-04-08 20:11:33
 */
public interface ZhichengDao extends BaseMapper<ZhichengEntity> {
	
	List<ZhichengVO> selectListVO(@Param("ew") Wrapper<ZhichengEntity> wrapper);
	
	ZhichengVO selectVO(@Param("ew") Wrapper<ZhichengEntity> wrapper);
	
	List<ZhichengView> selectListView(@Param("ew") Wrapper<ZhichengEntity> wrapper);

	List<ZhichengView> selectListView(Pagination page,@Param("ew") Wrapper<ZhichengEntity> wrapper);
	
	ZhichengView selectView(@Param("ew") Wrapper<ZhichengEntity> wrapper);
	

}
