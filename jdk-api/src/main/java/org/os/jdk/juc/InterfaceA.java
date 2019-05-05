package org.os.jdk.juc;

/**
 * 
 * @author zhengjunjie
 *
 */
public interface InterfaceA {
	/**
	 * ��ʾInterface��static����
	 */
	static void showStatic() {
		System.out.println("InterfaceA++showStatic");
	}
	
	/**
	 * 
	 */
	default void showDefault() {
		System.out.println("InterfaceA++showDefault");
	}
}
