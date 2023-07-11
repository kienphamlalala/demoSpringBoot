package com.example.project_railway.Model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "User")
public class User {
    @Id
    @Column (name="user_id")
    private int id;

    @Column (name="name")
    private String name;
    @Column (name="age")
    private int age;
    //hello
    //okenha
    @Column (name="address")
    private String address;
 ///hhhhhh


    ////// tesssssssssssssssssssssssssssssssss
    // Kiên ngày 4-7-2023 test git lab
    public User() {
    }

    ///// tao hshhsgd
    // tạo fetch 3
//////// tao nhanh dev
    public User(int id, String name, int age, String address) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}
