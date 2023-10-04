package com.lombokdemo;

import lombok.SneakyThrows;
import lombok.Synchronized;
import lombok.val;

public class Service {
	int v=10;
	@SneakyThrows
	@Synchronized
	public static void test() {
		val s=10/0;
	}
	
	public static void main(String[] args) {
		Service.test();
	}
}
