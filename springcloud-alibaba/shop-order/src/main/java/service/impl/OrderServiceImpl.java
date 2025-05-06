package service.impl;

import com.Order;

import dao.OrderDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.OrderService;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderDao orderDao;

    @Override
    public Order findByPid(Integer pid) {
        return orderDao.findById(pid).get();
    }
}
