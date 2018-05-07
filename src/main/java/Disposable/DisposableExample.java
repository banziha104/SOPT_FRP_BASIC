package Disposable;

import io.reactivex.Observable;

public class DisposableExample {
    public static void main(String args[]){
        // 인자 1개
        Observable<String> observable = Observable.just("a","b","c","d");
        observable.subscribe(s ->  System.out.println(s) );// subscribe에 인자 한개만 넣을 경우, onNext


        // 인자 2개
        observable
                .subscribe(s ->  System.out.println(s) ,// subscribe에 인자 두개를 넣을 경우 첫번째는 onNext
                        e ->  e.printStackTrace() ); //  두번째는 에러시 실행되는 onError

        // 인자 3개

        observable.subscribe(s -> System.out.println(s) , // onNext
                e -> e.printStackTrace() ,  // onError
                () ->  System.out.println("발행완료")); // onComplete 모든 데이터를 발행하면 실행됌
    }
}
