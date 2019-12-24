package com.haydikodlayalim.ticketservice.repository.es;

import com.haydikodlayalim.ticketservice.model.es.TicketModel;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface TicketElasticRepository extends ElasticsearchRepository<TicketModel, String> {
}
