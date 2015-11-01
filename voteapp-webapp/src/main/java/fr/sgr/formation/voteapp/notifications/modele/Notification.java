package fr.sgr.formation.voteapp.notifications.modele;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Data
@EqualsAndHashCode(of = { "id" })
@NoArgsConstructor // --> Nécessaire pour JPA
@NamedQueries({
		@NamedQuery(name = Notification.REQ_RECHERCHER_TOUTES, query = "SELECT n FROM Notification n")
})
public class Notification {
	public static final String REQ_RECHERCHER_TOUTES = "Notification.REQ_RECHERCHER_TOUTES";

	/** Identifiant technique pour la persistance. */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	/** Description de l'événement. */
	private String description;

	public Notification(String description) {
		this.description = description;
	}
}
