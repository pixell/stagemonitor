package de.isys.jawap.benchmark;

public class ClassToProfile {


	public int method1() {
		return method2() + method3() + method5();
	}

	private int method2() {
		return 2;
	}

	private int method3() {
		return method4();
	}

	private int method4() {
		return 4;
	}

	private int method5() {
		return method6() + method7();
	}

	private int method6() {
		return 6;
	}

	private int method7() {
		return 7;
	}

}