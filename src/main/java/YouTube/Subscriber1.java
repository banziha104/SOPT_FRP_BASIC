package YouTube;

import io.reactivex.Observable;

public class Subscriber1 {
    Observable<String> observable;

    public Subscriber1(Observable<String> observable) {
        this.observable = observable;
        bind();
    }

    void bind() {
        observable
                .filter(s -> !s.startsWith("방송")) // 방송이라고 시작되는 글자이면, subscribe 하지않음.
                .subscribe(s -> { System.out.println("방송안보는 구독자1:" + s); },
                        e -> e.printStackTrace(),
                        () -> System.out.println("완료되었습니다"));
    }
}
