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


import com.dao.GongzuorenwuDao;
import com.entity.GongzuorenwuEntity;
import com.service.GongzuorenwuService;
import com.entity.vo.GongzuorenwuVO;
import com.entity.view.GongzuorenwuView;

@Service("gongzuorenwuService")
public class GongzuorenwuServiceImpl extends ServiceImpl<GongzuorenwuDao, GongzuorenwuEntity> implements GongzuorenwuService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<GongzuorenwuEntity> page = this.selectPage(
                new Query<GongzuorenwuEntity>(params).getPage(),
                new EntityWrapper<GongzuorenwuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<GongzuorenwuEntity> wrapper) {
		  Page<GongzuorenwuView> page =new Query<GongzuorenwuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<GongzuorenwuVO> selectListVO(Wrapper<GongzuorenwuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public GongzuorenwuVO selectVO(Wrapper<GongzuorenwuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<GongzuorenwuView> selectListView(Wrapper<GongzuorenwuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public GongzuorenwuView selectView(Wrapper<GongzuorenwuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
