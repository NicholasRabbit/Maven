package com.maven.project02;

import org.junit.Test;
import static junit.framework.Assert.*;   //静态导入

public class MavenProjectTest02 {

	@Test
	public void test(String name){
		MavenProject02 mp = new MavenProject02();
		String result = mp.doSome("Tom");
		assertEquals("Hello Tom",result); //判断结果是否相同
	}
}