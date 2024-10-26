package app.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name="user")
public class User {
        @Id
        @Column(name="id")
        @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
        @OneToOne
        @JoinColumn(name="personid")
	private Person personId;
        @Column(name="password")
	private String password;
        @Column(name="username")
	private String userName;
        @Column(name="role")
	private String role;

	
	
}
