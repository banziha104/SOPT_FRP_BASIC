package YouTube;

import java.util.Scanner;

import io.reactivex.subjects.BehaviorSubject;
import io.reactivex.subjects.PublishSubject;

public class MainClass {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        PublishSubject<String> youtuber = PublishSubject.create(); // Subject는 관찰 뿐만 아니라 onNext를 직접 호출함으로써 데이터 발행도가능
        new Subscriber1(youtuber);
        new Subscriber2(youtuber);
        new Subscriber3(youtuber);

        while(true){
            String s = scanner.next();
            youtuber.onNext(s); // 데이터가 입력될때마다 데이터를 구독자들에게 발행함
        }
    }
}
