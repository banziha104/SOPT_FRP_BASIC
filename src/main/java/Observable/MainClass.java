package Observable;

import io.reactivex.Observable;

public class MainClass {
    public static void main(String args[]){

        Observable<String> observable = Observable.just("a","b","c"); // 이벤트만듭니다
        observable                         // Observable은 이벤트를 하나하나씩 보냅니다. a -> b -> c 순
                .map(s -> s.toUpperCase()) // 각 요소에 변환을 줍니다. a -> A , b -> B , c -> C, 이벤트 요소를 변환할때 씁니다.
                .filter( s -> !(s.equals("A"))) // 각 요소를 거릅니다. 특정 이벤트만 받고싶을 때 씁니다.
                .subscribe(System.out::println); // 이벤트를 구독합니다. 구독하는 순간 Observable이 이벤트를 발행합니다.
    }
}
