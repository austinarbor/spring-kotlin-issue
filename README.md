# Description
MRE for https://github.com/spring-projects/spring-framework/issues/35487

## Steps
```bash
./gradlew bootRun
```

```
> Task :bootRun FAILED

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/

 :: Spring Boot ::                (v3.5.5)

2025-09-16T15:55:04.357-04:00  INFO 21223 --- [           main] dev.aga.MainKt                           : Starting MainKt using Java 21.0.3 with PID 21223 (/Users/aa/git/spring-kotlin-issue/build/classes/kotlin/main started by aa in /Users/aa/git/spring-kotlin-issue)
2025-09-16T15:55:04.358-04:00  INFO 21223 --- [           main] dev.aga.MainKt                           : No active profile set, falling back to 1 default profile: "default"
2025-09-16T15:55:04.950-04:00  INFO 21223 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port 8080 (http)
2025-09-16T15:55:04.958-04:00  INFO 21223 --- [           main] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
2025-09-16T15:55:04.958-04:00  INFO 21223 --- [           main] o.apache.catalina.core.StandardEngine    : Starting Servlet engine: [Apache Tomcat/10.1.44]
2025-09-16T15:55:04.978-04:00  INFO 21223 --- [           main] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
2025-09-16T15:55:04.979-04:00  INFO 21223 --- [           main] w.s.c.ServletWebServerApplicationContext : Root WebApplicationContext: initialization completed in 600 ms
2025-09-16T15:55:05.103-04:00  WARN 21223 --- [           main] ConfigServletWebServerApplicationContext : Exception encountered during context initialization - cancelling refresh attempt: org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'addressRepo' defined in file [/Users/aa/git/spring-kotlin-issue/build/classes/kotlin/main/dev/aga/repo/AddressRepo.class]: Unexpected AOP exception
2025-09-16T15:55:05.104-04:00  INFO 21223 --- [           main] o.apache.catalina.core.StandardService   : Stopping service [Tomcat]
2025-09-16T15:55:05.110-04:00  INFO 21223 --- [           main] .s.b.a.l.ConditionEvaluationReportLogger :

Error starting ApplicationContext. To display the condition evaluation report re-run your application with 'debug' enabled.
2025-09-16T15:55:05.118-04:00 ERROR 21223 --- [           main] o.s.boot.SpringApplication               : Application run failed

org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'addressRepo' defined in file [/Users/aa/git/spring-kotlin-issue/build/classes/kotlin/main/dev/aga/repo/AddressRepo.class]: Unexpected AOP exception
        at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:614) ~[spring-beans-6.2.11.jar:6.2.11]
        at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:529) ~[spring-beans-6.2.11.jar:6.2.11]
        at org.springframework.beans.factory.support.AbstractBeanFactory.lambda$doGetBean$0(AbstractBeanFactory.java:339) ~[spring-beans-6.2.11.jar:6.2.11]
        at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:373) ~[spring-beans-6.2.11.jar:6.2.11]
        at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:337) ~[spring-beans-6.2.11.jar:6.2.11]
        at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:202) ~[spring-beans-6.2.11.jar:6.2.11]
        at org.springframework.beans.factory.support.DefaultListableBeanFactory.instantiateSingleton(DefaultListableBeanFactory.java:1221) ~[spring-beans-6.2.11.jar:6.2.11]
        at org.springframework.beans.factory.support.DefaultListableBeanFactory.preInstantiateSingleton(DefaultListableBeanFactory.java:1187) ~[spring-beans-6.2.11.jar:6.2.11]
        at org.springframework.beans.factory.support.DefaultListableBeanFactory.preInstantiateSingletons(DefaultListableBeanFactory.java:1123) ~[spring-beans-6.2.11.jar:6.2.11]
        at org.springframework.context.support.AbstractApplicationContext.finishBeanFactoryInitialization(AbstractApplicationContext.java:987) ~[spring-context-6.2.10.jar:6.2.10]
        at org.springframework.context.support.AbstractApplicationContext.refresh(AbstractApplicationContext.java:627) ~[spring-context-6.2.10.jar:6.2.10]
        at org.springframework.boot.web.servlet.context.ServletWebServerApplicationContext.refresh(ServletWebServerApplicationContext.java:146) ~[spring-boot-3.5.5.jar:3.5.5]
        at org.springframework.boot.SpringApplication.refresh(SpringApplication.java:752) ~[spring-boot-3.5.5.jar:3.5.5]
        at org.springframework.boot.SpringApplication.refreshContext(SpringApplication.java:439) ~[spring-boot-3.5.5.jar:3.5.5]
        at org.springframework.boot.SpringApplication.run(SpringApplication.java:318) ~[spring-boot-3.5.5.jar:3.5.5]
        at org.springframework.boot.SpringApplication.run(SpringApplication.java:1361) ~[spring-boot-3.5.5.jar:3.5.5]
        at org.springframework.boot.SpringApplication.run(SpringApplication.java:1350) ~[spring-boot-3.5.5.jar:3.5.5]
        at dev.aga.MainKt.main(Main.kt:13) ~[main/:na]
Caused by: org.springframework.aop.framework.AopConfigException: Unexpected AOP exception
        at org.springframework.aop.framework.CglibAopProxy.buildProxy(CglibAopProxy.java:244) ~[spring-aop-6.2.10.jar:6.2.10]
        at org.springframework.aop.framework.CglibAopProxy.getProxy(CglibAopProxy.java:168) ~[spring-aop-6.2.10.jar:6.2.10]
        at org.springframework.aop.framework.ProxyFactory.getProxy(ProxyFactory.java:110) ~[spring-aop-6.2.10.jar:6.2.10]
        at org.springframework.aop.framework.AbstractAdvisingBeanPostProcessor.postProcessAfterInitialization(AbstractAdvisingBeanPostProcessor.java:128) ~[spring-aop-6.2.10.jar:6.2.10]
        at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.applyBeanPostProcessorsAfterInitialization(AbstractAutowireCapableBeanFactory.java:445) ~[spring-beans-6.2.11.jar:6.2.11]
        at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.initializeBean(AbstractAutowireCapableBeanFactory.java:1829) ~[spring-beans-6.2.11.jar:6.2.11]
        at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:607) ~[spring-beans-6.2.11.jar:6.2.11]
        ... 17 common frames omitted
Caused by: java.lang.IllegalStateException: Unable to load cache item
        at org.springframework.cglib.core.internal.LoadingCache.createEntry(LoadingCache.java:75) ~[spring-core-6.2.11.jar:6.2.11]
        at org.springframework.cglib.core.internal.LoadingCache.get(LoadingCache.java:34) ~[spring-core-6.2.11.jar:6.2.11]
        at org.springframework.cglib.core.AbstractClassGenerator$ClassLoaderData.get(AbstractClassGenerator.java:129) ~[spring-core-6.2.11.jar:6.2.11]
        at org.springframework.cglib.core.AbstractClassGenerator.create(AbstractClassGenerator.java:321) ~[spring-core-6.2.11.jar:6.2.11]
        at org.springframework.cglib.proxy.Enhancer.createHelper(Enhancer.java:562) ~[spring-core-6.2.11.jar:6.2.11]
        at org.springframework.cglib.proxy.Enhancer.createClass(Enhancer.java:407) ~[spring-core-6.2.11.jar:6.2.11]
        at org.springframework.aop.framework.ObjenesisCglibAopProxy.createProxyClassAndInstance(ObjenesisCglibAopProxy.java:62) ~[spring-aop-6.2.10.jar:6.2.10]
        at org.springframework.aop.framework.CglibAopProxy.buildProxy(CglibAopProxy.java:229) ~[spring-aop-6.2.10.jar:6.2.10]
        ... 23 common frames omitted
Caused by: java.lang.VerifyError: Bad type on operand stack
Exception Details:
  Location:
    dev/aga/repo/AddressRepo$$SpringCGLIB$$0.delete(I)J @67: invokevirtual
  Reason:
    Type integer (current frame, stack[2]) is not assignable to 'java/lang/Object'
  Current Frame:
    bci: @67
    flags: { }
    locals: { 'dev/aga/repo/AddressRepo$$SpringCGLIB$$0', integer }
    stack: { 'org/springframework/cglib/proxy/MethodInterceptor', 'dev/aga/repo/AddressRepo$$SpringCGLIB$$0', integer }
  Bytecode:
    0000000: 2ab4 0035 59c7 000c 572a b800 392a b400
    0000010: 3559 c600 2f2a b200 3b04 bd00 3d59 031b
    0000020: bb00 3f5a 5fb7 0042 53b2 0044 b900 4a05
    0000030: 0059 c700 0857 09a7 0009 c000 4cb6 0050
    0000040: ad2a 1bb6 0033 ad
  Stackmap Table:
    same_locals_1_stack_item_frame(@17,Object[#70])
    same_locals_1_stack_item_frame(@58,Object[#61])
    same_locals_1_stack_item_frame(@64,Long)
    same_locals_1_stack_item_frame(@65,Object[#70])

        at java.base/java.lang.Class.forName0(Native Method) ~[na:na]
        at java.base/java.lang.Class.forName(Class.java:534) ~[na:na]
        at java.base/java.lang.Class.forName(Class.java:513) ~[na:na]
        at org.springframework.cglib.core.ReflectUtils.defineClass(ReflectUtils.java:581) ~[spring-core-6.2.11.jar:6.2.11]
        at org.springframework.cglib.core.AbstractClassGenerator.generate(AbstractClassGenerator.java:375) ~[spring-core-6.2.11.jar:6.2.11]
        at org.springframework.cglib.proxy.Enhancer.generate(Enhancer.java:575) ~[spring-core-6.2.11.jar:6.2.11]
        at org.springframework.cglib.core.AbstractClassGenerator$ClassLoaderData.lambda$new$1(AbstractClassGenerator.java:107) ~[spring-core-6.2.11.jar:6.2.11]
        at org.springframework.cglib.core.internal.LoadingCache.lambda$createEntry$1(LoadingCache.java:52) ~[spring-core-6.2.11.jar:6.2.11]
        at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:317) ~[na:na]
        at org.springframework.cglib.core.internal.LoadingCache.createEntry(LoadingCache.java:57) ~[spring-core-6.2.11.jar:6.2.11]
        ... 30 common frames omitted

```

Replace kotlin version with `2.2.10` and ksp with version `2.2.10-2.0.2` and the issue goes away.
