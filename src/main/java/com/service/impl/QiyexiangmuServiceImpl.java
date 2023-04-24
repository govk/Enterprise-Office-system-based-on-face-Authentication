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


import com.dao.QiyexiangmuDao;
import com.entity.QiyexiangmuEntity;
import com.service.QiyexiangmuService;
import com.entity.vo.QiyexiangmuVO;
import com.entity.view.QiyexiangmuView;

@Service("qiyexiangmuService")
public class QiyexiangmuServiceImpl extends ServiceImpl<QiyexiangmuDao, QiyexiangmuEntity> implements QiyexiangmuService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<QiyexiangmuEntity> page = this.selectPage(
                new Query<QiyexiangmuEntity>(params).getPage(),
                new EntityWrapper<QiyexiangmuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<QiyexiangmuEntity> wrapper) {
		  Page<QiyexiangmuView> page =new Query<QiyexiangmuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<QiyexiangmuVO> selectListVO(Wrapper<QiyexiangmuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public QiyexiangmuVO selectVO(Wrapper<QiyexiangmuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<QiyexiangmuView> selectListView(Wrapper<QiyexiangmuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public QiyexiangmuView selectView(Wrapper<QiyexiangmuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

    @Override
    public List<Map<String, Object>> selectValue(Map<String, Object> params, Wrapper<QiyexiangmuEntity> wrapper) {
        return baseMapper.selectValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params, Wrapper<QiyexiangmuEntity> wrapper) {
        return baseMapper.selectTimeStatValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectGroup(Map<String, Object> params, Wrapper<QiyexiangmuEntity> wrapper) {
        return baseMapper.selectGroup(params, wrapper);
    }



}
