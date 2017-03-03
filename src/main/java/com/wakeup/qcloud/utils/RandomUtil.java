package com.wakeup.qcloud.utils;

import java.util.Random;

/**
 * @since 2017年2月20日
 * @author kalman03
 */
public class RandomUtil {

	private static char[] numbers = "1234567890".toCharArray();
	
	public static String getRandomNumber(int length) {
		char[] randBuffer = new char[length];
		for (int i = 0; i < randBuffer.length; i++) {
			randBuffer[i] = numbers[new Random().nextInt(9)];
		}
		return new String(randBuffer);
	}

}
