package com.atguigu.gulimall.order.dao;

import com.atguigu.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author lxl
 * @email 714416426@qq.com
 * @date 2022-05-09 20:03:22
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
