package controller;


import com.Order;
import com.Product;
import com.alibaba.fastjson.JSON;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.OrderService;

@RestController
@Slf4j
public class OrderController {

    @Autowired
    private service.OrderService OrderService;



    //商品信息查询
    @RequestMapping("/Order/{pid}")
    public Order order(@PathVariable("pid") Integer pid) {
        log.info("接下来要进行{}号商品信息的查询", pid);
       Order order = OrderService.findByPid(pid);
        log.info("商品信息查询成功,内容为{}", JSON.toJSONString(order));
        return order;
    }
}
