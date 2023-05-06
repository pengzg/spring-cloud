package main.java.com.demo.feignweb.controller;

import java.util.List;

import com.demo.commonapi.service.UserFeignService;

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
@RequestMapping("/web02/user")
public class UserController {

	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	private DiscoveryClient discoveryClient;
	
	@Autowired
	private UserFeignService userFeignService;
	
	@RequestMapping("/get")
	public void get(String id) throws Exception {
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
     //  return uri+"/provide/user/getInfo";

//		String  baStr = restTemplate.getForObject(uri+"/provide/user/get?id=2", String.class );
//		System.out.println(baStr+"===>");
		return (String) this.userFeignService.get(id);
		//return "sss";
	}
}
