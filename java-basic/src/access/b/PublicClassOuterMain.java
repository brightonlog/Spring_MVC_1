package access.b;

//import access.a.DefaultClass1;? Cannot be accessed from outside package
import access.a.PublicClass;

public class PublicClassOuterMain {
    public static void main(String[] args){
        PublicClass publicClass = new PublicClass();

        // 다른 패키지 접근 불가 (패키지 위치가 달라서 호출이 안됨)
//        DefaultClass1 class1 = new DefaultClass1();
    }
}
