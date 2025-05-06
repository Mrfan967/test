package service;

import com.Order;
import com.Product;

public interface OrderService {


    //根据pid查询商品信息
    Order findByPid(Integer pid);
}
