package com.entity.view;

import com.entity.TushupingjiaEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 图书评价
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-15 10:17:56
 */
@TableName("tushupingjia")
public class TushupingjiaView  extends TushupingjiaEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public TushupingjiaView(){
	}
 
 	public TushupingjiaView(TushupingjiaEntity tushupingjiaEntity){
 	try {
			BeanUtils.copyProperties(this, tushupingjiaEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
