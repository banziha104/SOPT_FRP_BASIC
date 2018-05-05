package YouTube;

import java.util.Scanner;

import io.reactivex.subjects.BehaviorSubject;
import io.reactivex.subjects.PublishSubject;

public class MainClass {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        PublishSubject<String> youtuber = PublishSubject.create();
        new Subscriber1(youtuber);
        new Subscriber2(youtuber);
        new Subscriber3(youtuber);
        while(true){
            String s = scanner.next();
            youtuber.onNext(s);
        }
    }
}
