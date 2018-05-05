package YouTube;

import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;

public class Subscriber3 {
    Observable<String> observable;

    public Subscriber3(Observable<String> observable) {
        this.observable = observable;

        bind();
    }

    void bind(){
        observable
                .filter(s -> !s.startsWith("동영상"))
                .subscribe(s ->{
            System.out.println("동영상안보는 구독자3:"+ s);
        });
    }
}
