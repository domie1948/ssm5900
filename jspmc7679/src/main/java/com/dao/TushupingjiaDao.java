package com.dao;

import com.entity.TushupingjiaEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.TushupingjiaVO;
import com.entity.view.TushupingjiaView;


/**
 * 图书评价
 * 
 * @author 
 * @email 
 * @date 2021-03-15 10:17:56
 */
public interface TushupingjiaDao extends BaseMapper<TushupingjiaEntity> {
	
	List<TushupingjiaVO> selectListVO(@Param("ew") Wrapper<TushupingjiaEntity> wrapper);
	
	TushupingjiaVO selectVO(@Param("ew") Wrapper<TushupingjiaEntity> wrapper);
	
	List<TushupingjiaView> selectListView(@Param("ew") Wrapper<TushupingjiaEntity> wrapper);

	List<TushupingjiaView> selectListView(Pagination page,@Param("ew") Wrapper<TushupingjiaEntity> wrapper);
	
	TushupingjiaView selectView(@Param("ew") Wrapper<TushupingjiaEntity> wrapper);
	
}
