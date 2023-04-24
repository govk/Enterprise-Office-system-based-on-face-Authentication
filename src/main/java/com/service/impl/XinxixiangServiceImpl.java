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


import com.dao.XinxixiangDao;
import com.entity.XinxixiangEntity;
import com.service.XinxixiangService;
import com.entity.vo.XinxixiangVO;
import com.entity.view.XinxixiangView;

@Service("xinxixiangService")
public class XinxixiangServiceImpl extends ServiceImpl<XinxixiangDao, XinxixiangEntity> implements XinxixiangService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XinxixiangEntity> page = this.selectPage(
                new Query<XinxixiangEntity>(params).getPage(),
                new EntityWrapper<XinxixiangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XinxixiangEntity> wrapper) {
		  Page<XinxixiangView> page =new Query<XinxixiangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XinxixiangVO> selectListVO(Wrapper<XinxixiangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XinxixiangVO selectVO(Wrapper<XinxixiangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XinxixiangView> selectListView(Wrapper<XinxixiangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XinxixiangView selectView(Wrapper<XinxixiangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
