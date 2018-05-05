package Subject;


import io.reactivex.Observable;

public class SecondClass {
    Observable<String> observable;

    public SecondClass(Observable observable) {
        this.observable = observable;
        bind();
    }

    void bind() {
        observable
                .subscribe(s -> {
                    System.out.println("SecondClass : " + s);
                });
    }
}
