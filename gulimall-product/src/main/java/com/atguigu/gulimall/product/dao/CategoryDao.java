package com.atguigu.gulimall.product.dao;

import com.atguigu.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author paddy
 * @email paddy@gmail.com
 * @date 2024-04-06 08:16:28
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
