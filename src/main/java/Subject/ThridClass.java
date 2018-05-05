package Subject;


import io.reactivex.Observable;

public class ThridClass {
    Observable<String> observable;

    public ThridClass(Observable observable) {
        this.observable = observable;
        bind();
    }

    void bind() {
        observable
                .subscribe(s -> {
                    System.out.println("ThridClass : " + s);
                });
    }
}
