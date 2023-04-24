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


import com.dao.QiyewenjianDao;
import com.entity.QiyewenjianEntity;
import com.service.QiyewenjianService;
import com.entity.vo.QiyewenjianVO;
import com.entity.view.QiyewenjianView;

@Service("qiyewenjianService")
public class QiyewenjianServiceImpl extends ServiceImpl<QiyewenjianDao, QiyewenjianEntity> implements QiyewenjianService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<QiyewenjianEntity> page = this.selectPage(
                new Query<QiyewenjianEntity>(params).getPage(),
                new EntityWrapper<QiyewenjianEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<QiyewenjianEntity> wrapper) {
		  Page<QiyewenjianView> page =new Query<QiyewenjianView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<QiyewenjianVO> selectListVO(Wrapper<QiyewenjianEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public QiyewenjianVO selectVO(Wrapper<QiyewenjianEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<QiyewenjianView> selectListView(Wrapper<QiyewenjianEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public QiyewenjianView selectView(Wrapper<QiyewenjianEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
