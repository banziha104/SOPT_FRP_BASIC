package Disposable;

import io.reactivex.Observable;

public class DisposableExample {
    public static void main(String args[]){
        // 인자 1개
        Observable<String> observable = Observable.just("a","b","c","d");
        observable.subscribe(s -> { // subscribe에 인자 한개만 넣을 경우, onNext
            System.out.println(s);
        });


        // 인자 2개
        observable
                .doOnNext(s -> {})
                .subscribe(s -> { // subscribe에 인자 두개를 넣을 경우 첫번째는 onNext
            System.out.println(s);
        },e -> { //  두번째는 에러시 실행되는 onError
            e.printStackTrace();
        });

        // 인자 3개

        observable.subscribe(s -> { // onNext
            System.out.println(s);
        }, e -> { // onError
            e.printStackTrace();
        }, () -> { // onComplete 모든 데이터를 발행하면 실행됌
            System.out.println("발행완료");
        });
    }
}
