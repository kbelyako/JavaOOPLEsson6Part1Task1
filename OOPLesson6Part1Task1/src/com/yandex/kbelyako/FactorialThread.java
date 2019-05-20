package com.yandex.kbelyako;

import java.math.BigInteger;

public class FactorialThread implements Runnable {

	private BigInteger calculteFactorial(int number) {
		BigInteger fact = new BigInteger("1");
		for (int i = 2; i <= number; i = i + 1) {
			fact = fact.multiply(new BigInteger("" + i));
		}
		return fact;
	}

	public FactorialThread() {
		super();
	}

	@Override
	public void run() {
		Thread th = Thread.currentThread();
		String thName = th.getName();
		String[] parts = thName.split("-");
		int thId = Integer.parseInt(parts[1]);
//		for (int i = 1; i <= thId; i += 1) {
			//System.out.println(th.getName() + " "+thId);
			System.out.println(th.getName() + " " + thId + "!=" + calculteFactorial(thId));
//		}
	}

}
