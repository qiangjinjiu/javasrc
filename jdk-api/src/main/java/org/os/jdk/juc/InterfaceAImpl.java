package org.os.jdk.juc;

public class InterfaceAImpl implements InterfaceA,InterfaceB {

	@Override
	public void showDefault() {
		System.out.println("InterfaceAImpl++defaultShow");
	}

}
