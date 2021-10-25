package com.cos.reactivetest;

import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;

public class MyPub implements Publisher<Integer>{

	public void subscribe(Subscriber<? super Integer> s) {
		System.out.println("1. 신문사야 나 너희 신문 볼께");
	}
}
