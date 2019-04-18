# wrapper-spring-boot-starter

自定义spring boot starter, 当引入该starter依赖

```
<dependency>
    <groupId>com.tuyu</groupId>
    <artifactId>wrapper-spring-boot-starter</artifactId>
    <version>1.0.0</version>
</dependency>
```

项目中就可以自由注入WrapperService的bean了

```
@Autowired
public WrapperService wrapperService;
```

# 技术要点

- 引入spring boot 依赖

```
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter</artifactId>
</dependency>
```

- 创建 WrapperService 类
- 创建属性配置类 WrapperServiceProperties
- 创建自动配置类 WrapperServiceAutoConfigure
- 创建META-INF/spring.factories文件

```
org.springframework.boot.autoconfigure.EnableAutoConfiguration=com.tuyu.autoconfigure.WrapperServiceAutoConfigure
```