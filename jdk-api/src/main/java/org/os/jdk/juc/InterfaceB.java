package org.os.jdk.juc;

/**
 * 
 * @author zhengjunjie
 *
 */
public interface InterfaceB {
	/**
	 */
	static void showStatic() {
		System.out.println("InterfaceB++showStatic");
	}
	
	/**
	 * 
	 */
	default void showDefault() {
		System.out.println("InterfaceB++showDefault");
	}
}
