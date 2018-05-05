package Subject;

import java.util.Scanner;

import javax.security.auth.Subject;

import io.reactivex.subjects.BehaviorSubject;

public class MainClass {
    public static void main(String args[]){
        Scanner scanner;
        BehaviorSubject<String> subject = BehaviorSubject.create();
        new FirstClass(subject);
        new SecondClass(subject);
        new ThridClass(subject);

        while (true){
            scanner = new Scanner(System.in);
            String s = scanner.next();
            subject.onNext(s);
        }
    }
}
