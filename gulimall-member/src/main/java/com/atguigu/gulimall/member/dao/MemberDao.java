package com.atguigu.gulimall.member.dao;

import com.atguigu.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author paddy
 * @email paddy@gmail.com
 * @date 2024-04-10 21:05:06
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
