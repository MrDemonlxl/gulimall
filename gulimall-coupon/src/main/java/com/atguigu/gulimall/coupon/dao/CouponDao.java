package com.atguigu.gulimall.coupon.dao;

import com.atguigu.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author lxl
 * @email 714416426@qq.com
 * @date 2022-05-09 19:01:41
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
