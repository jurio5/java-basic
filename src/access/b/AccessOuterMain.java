package access.b;

import access.a.AccessData;

public class AccessOuterMain {

    public static void main(String[] args) {
        AccessData accessData = new AccessData();

        accessData.publicaField = 1;
        accessData.publicMethod();

//        accessData.defaultField = 2; // default - private , 다른 패키지라 호출 불가
//        accessData.defaultMethod(); // default - private , 다른 패키지라 호출 불가

//        accessData.privateField = 3;  // private
//        accessData.privateMethod(); // private

        accessData.innerAccess();
    }
}