package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.ZhichengDao;
import com.entity.ZhichengEntity;
import com.service.ZhichengService;
import com.entity.vo.ZhichengVO;
import com.entity.view.ZhichengView;

@Service("zhichengService")
public class ZhichengServiceImpl extends ServiceImpl<ZhichengDao, ZhichengEntity> implements ZhichengService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZhichengEntity> page = this.selectPage(
                new Query<ZhichengEntity>(params).getPage(),
                new EntityWrapper<ZhichengEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZhichengEntity> wrapper) {
		  Page<ZhichengView> page =new Query<ZhichengView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZhichengVO> selectListVO(Wrapper<ZhichengEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZhichengVO selectVO(Wrapper<ZhichengEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZhichengView> selectListView(Wrapper<ZhichengEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZhichengView selectView(Wrapper<ZhichengEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
