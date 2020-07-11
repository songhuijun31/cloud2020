package com.cloud.order.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * @Auther: shj
 * @Date: 2020/07/11 18:34
 * @Description:
 */
public interface LoadBalancer {
    ServiceInstance instances(List<ServiceInstance> serviceInstances);
}
