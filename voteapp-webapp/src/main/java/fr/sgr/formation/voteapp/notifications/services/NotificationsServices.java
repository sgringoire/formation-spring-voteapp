package fr.sgr.formation.voteapp.notifications.services;

import java.util.Collection;

import javax.persistence.EntityManager;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.sgr.formation.voteapp.notifications.modele.Notification;
import lombok.extern.slf4j.Slf4j;

/**
 * Services de notification d'événements.
 */
@Service
@Slf4j
public class NotificationsServices {
	@Autowired
	private EntityManager entityManager;

	/**
	 * Service de notification d'un événement.
	 * 
	 * @param message
	 *            Message représentant l'événement.
	 */
	public void notifier(String message) {
		log.info("[EVT]: " + message);

		if (StringUtils.isNotBlank(message)) {
			Notification notification = new Notification(message);
			entityManager.persist(notification);
		}
	}

	/**
	 * Retourne l'ensemble des notifications enregistrées.
	 * 
	 * @return Retourne l'ensemble des notifications enregistrées.
	 */
	public Collection<Notification> rechercherToutes() {
		return entityManager.createNamedQuery(Notification.REQ_RECHERCHER_TOUTES).getResultList();
	}
}
