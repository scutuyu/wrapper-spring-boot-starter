package com.tuyu.property;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * 2. 配置属性类，读取配置文件中的属性
 *
 * @author tuyu
 * @date 4/18/19
 * Talk is cheap, show me the code.
 */
@Data
@ConfigurationProperties("wrapper.service")
public class WrapperServiceProperties {

    private String prefix;
    private String suffix;
}
