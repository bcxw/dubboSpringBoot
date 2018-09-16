package net.itxw.dubboProvider.service;

import com.alibaba.dubbo.config.annotation.Service;
import net.itxw.dubboProvider.api.ProviderService;

@Service(version="1.0.0")
public class ProviderServiceImpl implements ProviderService {
    @Override
    public String sayHello(String message) {
        message="你好我是服务提供方，你的消息是："+message;
        System.out.println(message);
        return message;
    }
}
