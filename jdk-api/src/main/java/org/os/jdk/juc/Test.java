package org.os.jdk.juc;

/**
 * add f1
 * add f5
 * add f7
 * add f1
 * add f2
 * add f3
 * @author zhengjunjie
 *
 */
public class Test {

	//add f4
	//release 0.1.8
	//hotfix 0.1.10
	//hotfix 0.1.11
	public static void main(String[] args) {
		InterfaceA.showStatic();
		new InterfaceAImpl().showDefault();
		new InterfaceAImpl().showDefault();
		
	}

}
