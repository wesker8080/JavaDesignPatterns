package com.wesker.proxy;

/**
 * Person约定了人有唱歌和跳舞的行为
 * @author Wesker
 *
 */
public interface Person {
	/**
	 * 唱歌行为
	 * @param name 谁
	 * @return 结果
	 */
	String doSing(String name);

	/**
	 * 跳舞行为
	 * @param name 谁
	 * @return 结果
	 */
	String doDance(String name);
}
