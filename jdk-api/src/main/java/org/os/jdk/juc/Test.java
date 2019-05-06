package org.os.jdk.juc;

/**
 * add f1
 * add f5
 * add f7
 * add f1
 * add f2
 * @author zhengjunjie
 *
 */
public class Test {

	//add f4
	public static void main(String[] args) {
		InterfaceA.showStatic();
		new InterfaceAImpl().showDefault();
		new InterfaceAImpl().showDefault();
		
	}

}
