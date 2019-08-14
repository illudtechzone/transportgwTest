package com.illud.transportappgateway.repository.search;

import com.illud.transportappgateway.client.transport.domain.Driver;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.data.geo.Distance;
import org.springframework.data.geo.Point;
import org.springframework.data.repository.query.Param;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
/**
 * Spring Data Elasticsearch repository for the Driver entity.
 */
public interface DriverSearchRepository extends ElasticsearchRepository<Driver, Long> {
	
	  Page<Driver> findByLocationNear(@Param("location") Point point, @Param("distance") Distance distance, Pageable pageable);
}
