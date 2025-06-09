package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.TushupingjiaEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.TushupingjiaVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.TushupingjiaView;


/**
 * 图书评价
 *
 * @author 
 * @email 
 * @date 2021-03-15 10:17:56
 */
public interface TushupingjiaService extends IService<TushupingjiaEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<TushupingjiaVO> selectListVO(Wrapper<TushupingjiaEntity> wrapper);
   	
   	TushupingjiaVO selectVO(@Param("ew") Wrapper<TushupingjiaEntity> wrapper);
   	
   	List<TushupingjiaView> selectListView(Wrapper<TushupingjiaEntity> wrapper);
   	
   	TushupingjiaView selectView(@Param("ew") Wrapper<TushupingjiaEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<TushupingjiaEntity> wrapper);
   	
}

