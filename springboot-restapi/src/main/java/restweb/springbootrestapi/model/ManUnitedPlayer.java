package restweb.springbootrestapi.model;


import javax.persistence.*;

@Entity
@Table(name = "manutd")
public class ManUnitedPlayer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="first_name")
    private String firstName;

    @Column(name = "last_name")
    private String secondName;

    @Column(name = "position")
    private String position;

    public ManUnitedPlayer(){}

    public ManUnitedPlayer(String firstName, String secondName, String position) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.position = position;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "ManUnitedPlayer{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", position='" + position + '\'' +
                '}';
    }
}
