package com.zhongkexinli.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * 通过@EnableConfigServer注解激活配置服务.
 * 说明：
 * 在application.properties中有个git.uri的配置，目前配置的是http://192.168.96.89:3000/zhangpeng/springclouddemo.git
 * 获取git上的资源信息遵循如下规则：
 * /{application}/{profile}[/{label}]
 * /{application}-{profile}.yml
 * /{label}/{application}-{profile}.yml
 * /{application}-{profile}.properties
 * /{label}/{application}-{profile}.properties
 *
 * 例如本例：可使用以下路径来访问microservice-config-client-dev.properties：
 * http://localhost:9004/microservice-config-client-dev.properties
 * http://localhost:9004/microservice-config-client/dev
 * ...
 */

@SpringBootApplication
@EnableConfigServer
@EnableDiscoveryClient
public class ConfigServerEurekaApplication {
  public static void main(String[] args) {
    SpringApplication.run(ConfigServerEurekaApplication.class, args);
  }
}
