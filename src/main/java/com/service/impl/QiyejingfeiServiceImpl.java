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


import com.dao.QiyejingfeiDao;
import com.entity.QiyejingfeiEntity;
import com.service.QiyejingfeiService;
import com.entity.vo.QiyejingfeiVO;
import com.entity.view.QiyejingfeiView;

@Service("qiyejingfeiService")
public class QiyejingfeiServiceImpl extends ServiceImpl<QiyejingfeiDao, QiyejingfeiEntity> implements QiyejingfeiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<QiyejingfeiEntity> page = this.selectPage(
                new Query<QiyejingfeiEntity>(params).getPage(),
                new EntityWrapper<QiyejingfeiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<QiyejingfeiEntity> wrapper) {
		  Page<QiyejingfeiView> page =new Query<QiyejingfeiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<QiyejingfeiVO> selectListVO(Wrapper<QiyejingfeiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public QiyejingfeiVO selectVO(Wrapper<QiyejingfeiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<QiyejingfeiView> selectListView(Wrapper<QiyejingfeiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public QiyejingfeiView selectView(Wrapper<QiyejingfeiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

    @Override
    public List<Map<String, Object>> selectValue(Map<String, Object> params, Wrapper<QiyejingfeiEntity> wrapper) {
        return baseMapper.selectValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params, Wrapper<QiyejingfeiEntity> wrapper) {
        return baseMapper.selectTimeStatValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectGroup(Map<String, Object> params, Wrapper<QiyejingfeiEntity> wrapper) {
        return baseMapper.selectGroup(params, wrapper);
    }



}
