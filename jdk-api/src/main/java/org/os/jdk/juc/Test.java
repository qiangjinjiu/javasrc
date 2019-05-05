package org.os.jdk.juc;

public class Test {

	public static void main(String[] args) {
		InterfaceA.showStatic();
		new InterfaceAImpl().showDefault();
	}

}
