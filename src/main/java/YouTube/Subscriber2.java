package YouTube;

import io.reactivex.Observable;

public class Subscriber2 {
    Observable<String> observable;

    public Subscriber2(Observable<String> observable) {
        this.observable = observable;
        bind();
    }

    void bind(){
        observable.subscribe(s ->{
            System.out.println("다보는 구독자2:" +s);
        });
    }
}
