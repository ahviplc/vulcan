```

██╗   ██╗██╗   ██╗██╗      ██████╗ █████╗ ███╗   ██╗
██║   ██║██║   ██║██║     ██╔════╝██╔══██╗████╗  ██║
██║   ██║██║   ██║██║     ██║     ███████║██╔██╗ ██║
╚██╗ ██╔╝██║   ██║██║     ██║     ██╔══██║██║╚██╗██║
 ╚████╔╝ ╚██████╔╝███████╗╚██████╗██║  ██║██║ ╚████║
  ╚═══╝   ╚═════╝ ╚══════╝ ╚═════╝╚═╝  ╚═╝╚═╝  ╚═══╝
                                                    

```

# vulcan

> 伏尔甘（ 拉丁语 ：Vulcānus、英语：Vulcan）,是 罗马神话 中的火与工匠之神,罗马十二主神之一,火神。

> 一个 Spring Boot 多模块项目

> vulcan: vulcan:一个 Spring Boot 多模块项目 | 开发模板项目

> https://github.com/ahviplc/vulcan.git

> https://gitee.com/ahviplc/vulcan

# 一些链接

```markdown
MySpringBootTemplate: 一个SpringBoot开发模板项目,内置了优雅的处理全局异常 - 这是单项目版本
https://gitee.com/ahviplc/MySpringBootTemplate

GitHub - ahviplc/JustToolc: ❤JustToolc > Java Tools For U (You) ❤
https://github.com/ahviplc/JustToolc

Java3y/austin - 码云 - 开源中国
https://gitee.com/zhongfucheng/austin/tree/master

SpringBoot搭建多模块项目_指尖听戏的博客-CSDN博客_springboot多模块项目
https://blog.csdn.net/qq_38140292/article/details/118926156

Java Cmd运行Jar出现乱码的解决方案_java_脚本之家
https://www.jb51.net/article/222386.htm

Text to ASCII Art Generator (TAAG)
http://patorjk.com/software/taag/#p=testall&f=Graffiti&t=vulcan
```

# 启动我

`win下,打开cmd,输入以下指令 将cmd的编码为UTF-8编码`
> chcp 65001

`打包和运行`

```markdown
1. 打包   
   maven clean package

2. 运行   
   进入目录【vulcan-web/target/】   
   执行  
   java -jar .\vulcan-web-0.0.1-SNAPSHOT.jar

3. 重要的一行maven命令 | can work

> mvn -T 1C clean source:jar javadoc:javadoc install -Dmaven.test.skip=true -Dmaven.javadoc.skip=false

上面的一行命令代表:清理安装并生成source.jar 生成javadoc 跳过test的junit单元测试 不跳过javadoc文档生成   
-Dmaven.test.skip=true 跳过test的junit单元测试   
-Dmaven.javadoc.skip=false 不跳过javadoc文档生成
```

# 访问我

```markdown
http://localhost:9511/api/ping
```

# 一些备注

> 启动类相关

```java

@ComponentScan(basePackages = {
		"com.lc.vulcan.web.controller",
		"com.lc.vulcan.beans.myAspect",
		"com.lc.vulcan.beans.myException"})
public class VulcanWebApplication {
}
```

与下面的是等价的

```java

@ComponentScan(basePackages = {
		"com.lc.vulcan.web.controller",
		"com.lc.vulcan.beans"})
public class VulcanWebApplication {
}
```

> 也就是【"com.lc.vulcan.beans"】的组件扫描不但包含了,也可扫描出所有的自定义注解和全局异常处理相关的类【com.lc.vulcan.beans.myException.GlobalExceptionHandler】

# 小技巧

> 在 IDEA 中,启动了 Spring Boot 项目后,可在 Run -> Actuator -> Beans -> vulcan-web 中看到已加载注入的 Beans

# 提交说明

## git提交的一些说明

```markdown
提交信息书写模板指南:

注意前面有个空格
> ### 代表是具体的文字描述

*
* 做杂务 零工 杂事的时候
* chore: ###
*
* 修复bug的时候
* fix: ###
*
* 有功绩 有重大功能添加的时候
* feat: ###
*
* 性能提升的时候
* perf: ###
*
* 文档编辑相关的时候
* docs: ###
*
```

# 项目目录

- vulcan 是一个 Spring Boot 多模块项目
- vulcan-web：提供web端API接口服务
- vulcan-common：公共模块,公共config配置、公共变量
- vulcan-beans：公共可全局使用的beans、全局的异常处理类、一些自定义注解,例如面向切面的日志注解等
- vulcan-utils: 是常用工具类 （`待做`）
- vulcan-docs: 是一些文档文件夹 （`待做`）
- 其他未完待续

# ChangeLog

## 0.0.1-SNAPSHOT | 20220621

> 完成:整体框架完成

> todo

## x.y.z

TODO

# Getting Started

### Reference Documentation

For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.7.0/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.7.0/maven-plugin/reference/html/#build-image)

