package com.zja.service;


import com.zja.model.dto.GroupEntityDTO;
import com.zja.model.dto.OrdersEntityDTO;
import com.zja.model.dto.UserEntityDTO;

/**
 * @author ZhengJa
 * @description 订单接口
 * @data 2019/11/18
 */
public interface CascadeService {

    //根据订单id查询用户信息(一对一)，一个订单对应一个用户
    OrdersEntityDTO getOrderAndUserByOrdersId(Integer ordersId);
    //根据用户id查询所有订单信息(一对多)，一个用户对应多个订单
    UserEntityDTO getUserAndOrdersByUserId(Integer userId);

    //根据用户id查询用户所属组(全部)(多对多)
    UserEntityDTO getUsersAndGroupByUserId(Integer userId);
    //根据用户组id查询组下的所有用户(多对多)
    GroupEntityDTO getGroupAndUsersByGroupId(Integer groupId);

    //查询用户信息(包含所属的全部组)
    UserEntityDTO getUsers(Integer userId);
    //查询用户组信息(包含组下面的全部用户)
    GroupEntityDTO getGroup(Integer groupId);
}
