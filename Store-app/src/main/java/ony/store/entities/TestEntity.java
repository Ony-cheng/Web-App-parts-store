package ony.store.entities;


import jakarta.persistence.*;

@Entity
public class TestEntity {


    @Id
    @SequenceGenerator(name = "car_seq",
            sequenceName = "car_sequence",
            initialValue = 1, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="car_seq")
    private int id;

    public TestEntity() {
    }

    public TestEntity(String name, String description) {
        this.name = name;
        this.description = description;
    }

    private String name;

    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
}
