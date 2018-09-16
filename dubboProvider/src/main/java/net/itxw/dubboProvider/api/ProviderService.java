package net.itxw.dubboProvider.api;

/**
 * 一般API层最好单独建一个子模块，其他项目引入子模块的这个包就可以了
 */
public interface ProviderService {
    String sayHello(String message);
}
