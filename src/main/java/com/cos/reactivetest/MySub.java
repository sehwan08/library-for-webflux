package com.cos.reactivetest;

import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

public class MySub implements Subscriber<Integer>{
	
	private Subscription s;
	private int bufferSize = 3;
	
	public void onSubscribe(Subscription s) {
		System.out.println("구독자: 생성된 구독자 정보 받음");
		this.s = s;
		System.out.println("구독자: 이제 신문 1개씩 주세요");
		s.request(bufferSize);
	}

	public void onNext(Integer t) {
		System.out.println("전달 데이터 onNex(): "+t);
		bufferSize--;
		if(bufferSize==0) {
			System.out.println("데이터 전달 중");
			bufferSize = 3;
			s.request(bufferSize);
		}
	}

	public void onError(Throwable t) {
		System.out.println("구독중 에러");
	}

	public void onComplete() {
		System.out.println("구독 완료");
	}
}
