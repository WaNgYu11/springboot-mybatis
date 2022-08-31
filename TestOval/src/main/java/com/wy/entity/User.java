package com.wy.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.sf.oval.constraint.Email;
import net.sf.oval.constraint.Length;
import net.sf.oval.constraint.Max;
import org.springframework.validation.annotation.Validated;

@Data
public class User {

    private Integer id;
    @Length(max = 3, min = 1,message = "名字最大长度不能超过3")
    private String name;
    @Max(value = 10)
    private Integer age;

    private String email;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    @Length(max = 3, min = 1,message = "名字最大长度不能超过3")
    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
