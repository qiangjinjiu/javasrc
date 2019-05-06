package org.os.jdk.juc;

/**
 * add f1
 * add f5
 * @author zhengjunjie
 *
 */
public class Test {

	public static void main(String[] args) {
		InterfaceA.showStatic();
		new InterfaceAImpl().showDefault();
		new InterfaceAImpl().showDefault();
		
	}

}
