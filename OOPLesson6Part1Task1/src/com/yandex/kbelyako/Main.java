//Создайте сто потоков, которые будут вычислять факториал числа, равного номеру этого потока, и выводить результат на экран.

package com.yandex.kbelyako;

public class Main {

	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread().getName() + " now started");
		Thread thOne = new Thread(new FactorialThread());

		Thread[] thArray = new Thread[100];

		for (int i = 0; i < thArray.length; i++) {

			thArray[i] = new Thread(new FactorialThread());
		}

		for (int i = 0; i < thArray.length; i++) {
			thArray[i].start();

		}

		System.out.println(Thread.currentThread().getName() + " now stopped");
	}

}
