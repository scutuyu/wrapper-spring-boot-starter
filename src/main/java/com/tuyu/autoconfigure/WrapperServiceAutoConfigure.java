package com.tuyu.autoconfigure;

import com.tuyu.property.WrapperServiceProperties;
import com.tuyu.service.WrapperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 3. 自动配置类，需要在spring.factories配置文件中配置
 * <pre>
 *     条件注解，当WrapperService类在classpath下，且有配置属性类
 * </pre>
 *
 * @author tuyu
 * @date 4/18/19
 * Talk is cheap, show me the code.
 */
@Configuration
@ConditionalOnClass(WrapperService.class)
@EnableConfigurationProperties(WrapperServiceProperties.class)
public class WrapperServiceAutoConfigure {

    @Autowired
    private WrapperServiceProperties wrapperServiceProperties;

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(prefix = "wrapper.service", value = "enable", havingValue = "true")
    public WrapperService wrapperService() {
        return new WrapperService(wrapperServiceProperties.getPrefix(), wrapperServiceProperties.getSuffix());
    }
}
