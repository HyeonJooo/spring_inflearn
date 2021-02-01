package hello.core.singleton;

public class SingletonService {

    //자기자신을 private으로 내부에서 static으로 1개 가지고 있는다.
    private static final SingletonService instance = new SingletonService();

    public static SingletonService getInstance() {
        return instance;
    }

    //private 생성자를 써서 외부에서 생성되지 못하도록 한다.
    private SingletonService() {
    }

    public void logic() {
        System.out.println("싱글톤 객체 로직 호출");
    }

}
