package com.maven.project02;

import com.maven.project01.MavenProject01;  //导入第一个项目的类

/*
1，第二个maven项目，测试依赖第一个项目
2，需要在pom.xml中加入第一个项目的依赖坐标，并且第一个项目必须执行install命令，即把jar包安装到本地仓库里，才可被别的项目引用
   =====
   <dependency>
		<groupId>com.maven.project01</groupId>
		<artifactId>maven-project01</artifactId>
		<scope>compile<scope>
   </dependency>
*/
public class MavenProject02 {

	public String doSome(String name){
		//这里新建个第一个项目中的类
		MavenProject01 mp01 = new MavenProject01();
		return "Hello " + name;
	}
}