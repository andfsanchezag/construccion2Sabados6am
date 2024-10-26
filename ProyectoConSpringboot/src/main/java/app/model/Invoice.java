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
@Table(name = "invoice")
public class Invoice {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @ManyToOne
    @JoinColumn(name="petid")
    private Pet petId;
    @ManyToOne
    @JoinColumn(name="ownerid")
    private Person ownerId;
    @ManyToOne
    @JoinColumn(name="orderid")
    private Order orderId;
    @Column(name="items")
    private String items;
    @Column(name="amount")
    private double amount;
    @Column(name="date")
    private Date date;
}
