package com.ecommerce.platform.product.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by sepulrator on 28.05.2017.
 */
@FeignClient(name = "product-microservice")
public interface ProductServiceClient {

    @RequestMapping(method = RequestMethod.GET, value = "/products/{accountName}", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    String getAccount(@PathVariable("accountName") String accountName);

}
