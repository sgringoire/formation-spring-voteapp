package fr.sgr.formation.voteapp.notifications.services;

import org.springframework.stereotype.Service;

import fr.sgr.formation.voteapp.notifications.modele.Evenement;
import lombok.extern.slf4j.Slf4j;

/**
 * Services de notification d'événements.
 */
@Service
@Slf4j
public class NotificationsServices {
	/**
	 * Service de notification d'un événement.
	 * 
	 * @param message
	 *            Message représentant l'événement.
	 */
	public void notifier(String message) {
		log.info("[EVT]: " + message);
	}

	/**
	 * Service de notification d'un événement.
	 * 
	 * @param message
	 *            Message représentant l'événement.
	 */
	public void notifier(Evenement evt) {
		log.info("[EVT]: ", evt);
	}
}
