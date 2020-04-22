# webflux-coroutine-eureka-template
spring webflux + kotlin coroutines + eureka client project template

## features and presets
- springboot 2.2.6 (
  - webflux
  - eureka client
    - disabled ribbon to suppress warning  
    - set instance name to ${spring.application.name}
  - cache
- kotlin 1.3.72 
  - coroutines
  - kapt(for spring-annotation-processor)
- caffeine 2.8.1
  - replace default cache for eureka client to suppress warning
- empty config.properties
  - to suppress Hystrix warning
- springdoc 1.3.4 
  - support openapi3
  - swagger-ui enabled and display-operation-id set to true
- logger
  - debug friendly console log pattern(for intellij idea)
  - maintenance friendly file log rolling config
- editorconfig
- maven repos
  - mavenLocal
  - aliyun
  - jitpack
  - jcenter