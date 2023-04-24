package com.controller;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.XinxixiangEntity;
import com.entity.view.XinxixiangView;

import com.service.XinxixiangService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;

/**
 * 信息箱
 * 后端接口
 * @author 
 * @email 
 * @date 2023-04-08 20:11:33
 */
@RestController
@RequestMapping("/xinxixiang")
public class XinxixiangController {
    @Autowired
    private XinxixiangService xinxixiangService;




    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,XinxixiangEntity xinxixiang, 
		HttpServletRequest request){

        EntityWrapper<XinxixiangEntity> ew = new EntityWrapper<XinxixiangEntity>();


		String tableName = request.getSession().getAttribute("tableName").toString();
        ew.andNew();
		if(tableName.equals("yuangong")) {
            ew.eq("yuangonggonghao", (String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("yuangong")) {
            ew.or();
            ew.eq("fasongzhanghao", (String)request.getSession().getAttribute("username"));
		}
		PageUtils page = xinxixiangService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, xinxixiang), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,XinxixiangEntity xinxixiang, 
		HttpServletRequest request){
        EntityWrapper<XinxixiangEntity> ew = new EntityWrapper<XinxixiangEntity>();

		PageUtils page = xinxixiangService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, xinxixiang), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( XinxixiangEntity xinxixiang){
       	EntityWrapper<XinxixiangEntity> ew = new EntityWrapper<XinxixiangEntity>();
      	ew.allEq(MPUtil.allEQMapPre( xinxixiang, "xinxixiang")); 
        return R.ok().put("data", xinxixiangService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(XinxixiangEntity xinxixiang){
        EntityWrapper< XinxixiangEntity> ew = new EntityWrapper< XinxixiangEntity>();
 		ew.allEq(MPUtil.allEQMapPre( xinxixiang, "xinxixiang")); 
		XinxixiangView xinxixiangView =  xinxixiangService.selectView(ew);
		return R.ok("查询信息箱成功").put("data", xinxixiangView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        XinxixiangEntity xinxixiang = xinxixiangService.selectById(id);
        return R.ok().put("data", xinxixiang);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        XinxixiangEntity xinxixiang = xinxixiangService.selectById(id);
        return R.ok().put("data", xinxixiang);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody XinxixiangEntity xinxixiang, HttpServletRequest request){
    	xinxixiang.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(xinxixiang);

        xinxixiangService.insert(xinxixiang);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody XinxixiangEntity xinxixiang, HttpServletRequest request){
    	xinxixiang.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(xinxixiang);

        xinxixiangService.insert(xinxixiang);
        return R.ok();
    }


    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody XinxixiangEntity xinxixiang, HttpServletRequest request){
        //ValidatorUtils.validateEntity(xinxixiang);
        xinxixiangService.updateById(xinxixiang);//全部更新
        return R.ok();
    }
    
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        xinxixiangService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<XinxixiangEntity> wrapper = new EntityWrapper<XinxixiangEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = xinxixiangService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	









}
