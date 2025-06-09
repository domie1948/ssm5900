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


import com.dao.TushupingjiaDao;
import com.entity.TushupingjiaEntity;
import com.service.TushupingjiaService;
import com.entity.vo.TushupingjiaVO;
import com.entity.view.TushupingjiaView;

@Service("tushupingjiaService")
public class TushupingjiaServiceImpl extends ServiceImpl<TushupingjiaDao, TushupingjiaEntity> implements TushupingjiaService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<TushupingjiaEntity> page = this.selectPage(
                new Query<TushupingjiaEntity>(params).getPage(),
                new EntityWrapper<TushupingjiaEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<TushupingjiaEntity> wrapper) {
		  Page<TushupingjiaView> page =new Query<TushupingjiaView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<TushupingjiaVO> selectListVO(Wrapper<TushupingjiaEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public TushupingjiaVO selectVO(Wrapper<TushupingjiaEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<TushupingjiaView> selectListView(Wrapper<TushupingjiaEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public TushupingjiaView selectView(Wrapper<TushupingjiaEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
