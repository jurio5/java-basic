package extends1.access.child;

import extends1.access.parent.Parent;

public class Child extends Parent {

    public void call() {
        publicValue = 1;
        protectedValue = 1; // 다른 패키지여도 상속 관계로 사용 가능
        //defaultValue = 1; // 다른 패키지라서 사용 불가능
        //privateValue = 1; // 당연히 접근 불가

        publicMethod();
        protectedMethod();
//        defaultMethod();
//        privateMethod();

        printParent();
    }
}
