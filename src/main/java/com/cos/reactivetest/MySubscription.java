package com.cos.reactivetest;

import java.util.Iterator;

import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;


//구독 정보(구독자, 어떤 데이터를 구독할지)
public class MySubscription implements Subscription {

	private Subscriber s;
	private Iterator<Integer> it;
	
	public MySubscription(Subscriber s, Iterable<Integer> its) {
		this.s = s;
		this.it = its.iterator();
	}

	public void request(long n) {
		
	}

	public void cancel() {
		
	}
}
