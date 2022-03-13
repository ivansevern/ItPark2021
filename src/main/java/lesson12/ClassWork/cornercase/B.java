package lesson12.ClassWork.cornercase;

import lesson12.ClassWork.exception.MethodException;

public class B extends A {

    @Override
    protected void a() throws MethodException {
//        try {
//            super.a();
//        } catch (MethodException e) {
//            e.printStackTrace();
//        }
        super.a();
    }

    void b() {

    }
}
