package com.tuyu.service;

/**
 * <pre>
 *     要想将WrapperService对象自动以spring bean的方式来管理，需要1~4步
 *     参考链接：https://juejin.im/entry/58d37630570c350058c2c15c
 * </pre>
 *
 * 1. 包装服务，提供wrap方法，包装传入的字符串
 *
 * @author tuyu
 * @date 4/18/19
 * Talk is cheap, show me the code.
 */
public class WrapperService {

    private String prefix;
    private String suffix;

    public WrapperService(String prefix, String suffix) {
        this.prefix = prefix;
        this.suffix = suffix;
    }

    public String wrap(String word) {
        return this.prefix + word + this.suffix;
    }
}
