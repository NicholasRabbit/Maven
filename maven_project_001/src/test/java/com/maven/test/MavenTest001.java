//1��ע�⣬������������İ�·������ͱ����Ե������·��һֱ�����򱨴�
package com.maven.test;	

import org.junit.Test;
import static junit.framework.Assert.*;   //����д���Ǿ�̬��ʽ�����࣬��ֱ��ʹ�����ڵľ�̬��Դ�ļ�,�羲̬����assertEquasl(..)

public class MavenTest001 {

	//���������������src���µĵĴ���MyMaven.java
	@Test
	public void testMyMaven(){        
		MyMaven my= new MyMaven();
		String results = my.doSome("Tom");
		/*assertEquals(..)��junit��Ķ��Է����������ж�����Ԫ���Ƿ���ȣ���equals(..)����
		  �����ж�doSome(..)�����ķ���ֵ�Ƿ��"Tom"���
		*/
		assertEquals("Tom",results);	      
	}
}