package org.springframework.samples.petclinic.clients;

import java.util.Collection;

public interface ClientRepository {

	Collection<ClientSummary> findClientsByLastName(String lastName);

	Client getClient(Long id);

	Long saveClient(Client owner);

}