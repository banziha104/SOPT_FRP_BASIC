package YouTube;

import io.reactivex.Observable;

public class Subscriber1 {
    Observable<String> observable;

    public Subscriber1(Observable<String> observable) {
        this.observable = observable;
        bind();
    }

    void bind(){
        observable
                .filter(s -> !s.startsWith("방송"))
                .subscribe(s ->{
            System.out.println("방송안보는 구독자1:" + s);
        });
    }
}
