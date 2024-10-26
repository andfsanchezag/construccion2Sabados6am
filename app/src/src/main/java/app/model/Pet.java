package app.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@Getter
@Setter
@Table(name = "pet")
public class Pet {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @ManyToOne
    @JoinColumn(name="ownerid")
    private Person ownerId;
    @Column(name="name")
    private String name;
    @Column(name="age")
    private int age;
    @Column(name="race")
    private String race;
    @Column(name="spice")
    private String spice;
    @Column(name="weigth")
    private double weigth;
    @Column(name="features")
    private String features;

}
