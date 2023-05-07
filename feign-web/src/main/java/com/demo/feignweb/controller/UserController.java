package com.demo.feignweb.controller;

import java.util.List;

//import com.demo.commonapi.service.UserFeignService;
//import com.demo.commonapi.service.UserFeignService;
//import com.demo.commonapi.service.UserFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

//import com.demo.commonapi.model.User;
//import com.demo.commonapi.service.UserFeignService;


@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	private DiscoveryClient discoveryClient;
	
//	@Autowired
//	private UserFeignService userFeignService;
	
	@RequestMapping("/get")
	public String get(String id) throws Exception {
		//String uri = "";

		List<ServiceInstance> list = this.discoveryClient.getInstances("FEIGN-API");
        String uri = "";
        for (ServiceInstance instance : list) {
            if (instance.getUri() != null && !"".equals(instance.getUri())) {
                uri = instance.getUri().toString();
				System.out.println(uri);
                //break;
            }
        }
		System.out.println(uri+"/provide/user/get?id=2" + "===>");
		String  baStr = "";
		//  return uri+"/provide/user/getInfo";
		try{
			baStr = restTemplate.getForObject(uri+"/provide/user/get?id=2", String.class );
			System.out.println(baStr+"===>");
		}
		catch (Exception e) {
			System.out.println("调用接口Distance错误:"+ e.getMessage());
			return "执行失败";
		}

		//return (String) this.userFeignService.get(id);
		//return "sss";
		return baStr;
	}
}
