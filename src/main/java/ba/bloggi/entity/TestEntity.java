package ba.bloggi.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by happy on 09/10/2014.
 */

@Entity
@Table(name = "entity")
public class TestEntity extends GeneralEntity{

    private String name;
    private Integer age;

    public TestEntity() {}

    public TestEntity(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
