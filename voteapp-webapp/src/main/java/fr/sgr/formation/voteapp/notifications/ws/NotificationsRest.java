package fr.sgr.formation.voteapp.notifications.ws;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import fr.sgr.formation.voteapp.notifications.modele.Notification;
import fr.sgr.formation.voteapp.notifications.services.NotificationsServices;
import lombok.extern.slf4j.Slf4j;

/**
 * Expose les services de consultation des notifications.
 */
@RestController
@RequestMapping("notifications")
@Slf4j
public class NotificationsRest {
	@Autowired
	private NotificationsServices notificationsServices;

	@RequestMapping(method = RequestMethod.GET)
	public Collection<Notification> lister() {
		log.info("=====> Récupération de l'ensemble des notifications");
		return notificationsServices.rechercherToutes();
	}
}
