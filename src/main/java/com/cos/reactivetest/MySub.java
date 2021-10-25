package com.cos.reactivetest;

import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

public class MySub implements Subscriber<Integer>{

	public void onSubscribe(Subscription s) {
		System.out.println();
	}

	public void onNext(Integer t) {
		System.out.println("구독 데이터 전달");
	}

	public void onError(Throwable t) {
		System.out.println("구독중 에러");
	}

	public void onComplete() {
		System.out.println("구독 완료");
	}
}
