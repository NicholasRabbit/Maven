//1，注意，这里测试类代码的包路径必须和被测试的类代码路径一直，否则报错
package com.maven.project01;	

import org.junit.Test;
import static junit.framework.Assert.*;   //这里写法是静态方式导入类，可直接使用其内的静态资源文件,如静态方法assertEquasl(..)

public class MavenProjectTest01 {

	//这个方法用来测试src包下的的代码MyMaven.java
	@Test
	public void testMyMaven(){        
		MavenProject01 my= new MavenProject01();
		String results = my.doSome("Tom");
		/*assertEquals(..)是junit里的断言方法，用来判断两个元素是否相等，和equals(..)类似
		  用来判断doSome(..)方法的返回值是否和"Tom"相等
		*/
		assertEquals("Tom",results);	      
	}
}