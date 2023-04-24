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


import com.dao.WenjianfenleiDao;
import com.entity.WenjianfenleiEntity;
import com.service.WenjianfenleiService;
import com.entity.vo.WenjianfenleiVO;
import com.entity.view.WenjianfenleiView;

@Service("wenjianfenleiService")
public class WenjianfenleiServiceImpl extends ServiceImpl<WenjianfenleiDao, WenjianfenleiEntity> implements WenjianfenleiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<WenjianfenleiEntity> page = this.selectPage(
                new Query<WenjianfenleiEntity>(params).getPage(),
                new EntityWrapper<WenjianfenleiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<WenjianfenleiEntity> wrapper) {
		  Page<WenjianfenleiView> page =new Query<WenjianfenleiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<WenjianfenleiVO> selectListVO(Wrapper<WenjianfenleiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public WenjianfenleiVO selectVO(Wrapper<WenjianfenleiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<WenjianfenleiView> selectListView(Wrapper<WenjianfenleiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public WenjianfenleiView selectView(Wrapper<WenjianfenleiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
