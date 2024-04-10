package com.atguigu.gulimall.order.dao;

import com.atguigu.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author paddy
 * @email paddy@gmail.com
 * @date 2024-04-10 21:42:02
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
