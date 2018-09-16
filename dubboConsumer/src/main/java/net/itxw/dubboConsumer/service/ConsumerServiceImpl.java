package net.itxw.dubboConsumer.service;

import com.alibaba.dubbo.config.annotation.Reference;
import net.itxw.dubboConsumer.api.ConsumerService;
import net.itxw.dubboProvider.api.ProviderService;
import org.springframework.stereotype.Service;

@Service
public class ConsumerServiceImpl implements ConsumerService {

    @Reference(version = "1.0.0")
    private ProviderService providerService;

    @Override
    public String sayHello(String message) {
        return providerService.sayHello(message);
    }
}
