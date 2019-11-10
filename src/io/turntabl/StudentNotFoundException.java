package io.turntabl;

public class StudentNotFoundException extends Exception {

    @Override
    public String getMessage() {
        return "StudentNotFoundException thrown";
    }

    @Override
    public void printStackTrace() {
        System.err.println("StudentNotFoundException stackTrace");
    }

//    @Override
//    public String toString() {
//        return "StudentNotFoundException thrown";
//    }

}
