### 一，Maven约定的目录结构

```txt
maven_project01 : 根目录：项目名
	|----src
	|----|----main
	|----|----|----java
	|----|----|----|----com.myproject.controller.xxxController.java
	|----|----|----resources
	|----|----test
	|----|----|----java
	|----|----|----|----com.myproject.controller.xxxTest.java //test程序路径必须的被测程序相同
	|----|----|----resources
	|----pom.xml
```



### 二，Maven常用命令

**maven执行任何命令都会把这个命令之前的命令从头执行一边**

1，注意，测试类代码的路径必须和被测试的类代码路径一直，否则报错

2，Maven中坐标的含义：
   pom.xml文件中的标签：简称gav

```xml
<groupId>com.maven.test</groupId>    <!--表示公司或组织域名倒叙，g-->
<artifactId>MyMaven</artifactId>     <!--模块名，a-->
<version>0.0.1-SNAPSHOT</version>    <!--版本名，v-->

```
**maven执行打包package命令后， 打成的包名由artifactId和version组成**

3，Maven常用命令，及其执行顺序是从上到下，dos窗口必须在pom.xml同一目录下代开运行命令
    mvn clean : 清理，会删除原先的target目录，即删除了旧的老版本的.class文件
    mvn compile : 编译项目内的代码
    mvn test-compile : 编译测试程序
    mvn test : 执行测试
    mvn package : 打包
    mvn install : 安装，导出到本地的Maven仓库

4，mvn package : 命令会把编译好的文件压缩成jar包放到target文件夹里

5，mvn install : 这个命令会把编译好的jar包导入，也称安装到Maven本地仓库中，便于其他的工程依赖使用。

### 三，Maven的设置文件settings.xml设置参数

```xml
<settings xmlns="http://maven.apache.org/SETTINGS/1.0.0"
          xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
          xsi:schemaLocation="http://maven.apache.org/SETTINGS/1.0.0 http://maven.apache.org/xsd/settings-1.0.0.xsd">
  <!-- localRepository
   | The path to the local repository maven will use to store artifacts.
   |
   | Default: ${user.home}/.m2/repository 
   | 设置下载依赖本地保存目录，如不设置，默认是上面的地址-->
  <localRepository>F:\maven_repository</localRepository>  
    .....
<!--设置远程仓库，一般设置一个就行-->    
    <mirrors>
        <mirror>
            <id>aliyunmaven</id>
            <mirrorOf>*</mirrorOf>
            <name>阿里云公共仓库</name>
            <url>https://maven.aliyun.com/repository/public</url>
        </mirror>
        <mirror>
            <id>nexus-aliyun</id>
            <mirrorOf>central</mirrorOf>
            <name>Nexus aliyun</name>
            <url>http://maven.aliyun.com/nexus/content/groups/public</url> 
        </mirror>	
    </mirrors>
```

