package PrototypeDesignPattern;

import java.util.HashMap;

import java.util.Map;

public class StudentPrototypeRegistry {

    private Map<String, Student> studentProtoTypeRegistry = new HashMap<>();

    public void registerStudent(String key, Student student) {

        studentProtoTypeRegistry.putIfAbsent(key, student);
    }

    public Student getStudent(String key) {

        if (studentProtoTypeRegistry.containsKey(key)) {

            return studentProtoTypeRegistry.get(key);
        }
        else{

            return null;
        }
    }
}