package Subject;


import io.reactivex.Observable;

public class FirstClass {
    Observable<String> observable;

    public FirstClass(Observable<String> observable) {
        this.observable = observable;
        bind();
    }

    void bind() {
        observable
                .subscribe(s -> {
                    System.out.println("FirstClass : " + s);
                });
    }

}
