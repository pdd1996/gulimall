package com.atguigu.gulimall.coupon.dao;

import com.atguigu.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author paddy
 * @email paddy@gmail.com
 * @date 2024-04-07 07:49:56
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
