package model;

//import model.BaseEntity;

/**
 @author Evgeniy Lukashik
 */
public class NamedEntity extends BaseEntity {
    private String name;

    public NamedEntity() {
    }

    public NamedEntity(String name) {
        this.name = name;
    }

    public NamedEntity(Long id, String name) {
        super(id);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "NamedEntity{" +
                " Id: " + super.getId() +
                " Name: " + name;
    }
}
