package org.learning24.java8.FunctionalInterfaces;

import org.learning24.java8.data.Student;
import org.learning24.java8.data.StudentDataBase;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {

    static Consumer<Student> studentConsumer = (student) -> System.out.println(student);
    static Consumer<Student> studentConsumer1 = (student) -> System.out.println("Name: "+student.getName());
    static Consumer<Student> studentConsumer2 = (student) -> System.out.println("Activities: "+student.getActivities());
    static  Consumer<Student> studentConsumerCombined = (student) -> System.out.println("Name: "+student.getName() + " | Activities: "+student.getActivities());

    public static void printStudentsBasedOnCondition(){
        List<Student> students = StudentDataBase.getAllStudents();

        students.forEach(
                (student) -> {
                    if (student.getGradeLevel() >= 3){
                        studentConsumerCombined.accept(student);
                    }
                }
        );
    }

    public static void printStudents(){
        List<Student> students = StudentDataBase.getAllStudents();

        students.forEach(studentConsumer);
    }

    public static void printNameAndActivities(){
        List<Student> students = StudentDataBase.getAllStudents();
        students.forEach(studentConsumerCombined);
    }

    public static void printNameAndActivities2(){
        List<Student> students = StudentDataBase.getAllStudents();
        students.forEach(studentConsumer1.andThen(studentConsumer2));    //consumerChaining...
    }

    public static void main(String[] args) {
        Consumer<String> consumer = (s) -> System.out.println(s.toUpperCase());
        consumer.accept("java8");
//        printStudents();
//        printNameAndActivities();
//        printNameAndActivities2();
        printStudentsBasedOnCondition();

    }
}
