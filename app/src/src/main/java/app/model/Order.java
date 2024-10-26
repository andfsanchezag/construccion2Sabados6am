package app.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.sql.Date;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@Getter
@Setter
@Table(name = "medicalorder")
public class Order {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @ManyToOne
    @JoinColumn(name="petid")
    private Pet petId;
    @ManyToOne
    @JoinColumn(name="userid")
    private User veterinarian;
    @ManyToOne
    @JoinColumn(name="ownerid")
    private Person ownerId;
    @Column(name="doce")
    private String dose;
    @Column(name="medicine")
    private String medicine;
    @Column(name="datecreated")
    private Date date;

  
}
