package com.illud.transportappgateway.service.impl;



import java.util.List;

import javax.validation.Valid;

import org.elasticsearch.search.suggest.SuggestionBuilder;
import org.elasticsearch.search.suggest.term.TermSuggestionBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.core.ElasticsearchOperations;


import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.github.vanroy.springdata.jest.JestElasticsearchTemplate;
import com.github.vanroy.springdata.jest.aggregation.AggregatedPage;
import com.github.vanroy.springdata.jest.mapper.JestResultsExtractor;
import com.github.vanroy.springdata.jest.mapper.JestSearchResultMapper;
import com.google.gson.JsonObject;

import io.searchbox.client.JestClient;
import io.searchbox.client.JestResult;
import io.searchbox.core.SearchResult;
import io.searchbox.core.SearchResult.Hit;

import org.springframework.data.geo.Distance;
import org.springframework.data.geo.Point;
import org.springframework.http.ResponseEntity;

//import com.illud.transportappgateway.service.Driver;
import com.illud.transportappgateway.service.QueryService;
import com.illud.transportappgateway.repository.search.*;
import com.illud.transportappgateway.client.transport.api.TransportQueryResourceApi;
import com.illud.transportappgateway.client.transport.domain.Driver;
import com.illud.transportappgateway.client.transport.model.DataResponse;
import com.illud.transportappgateway.client.transport.model.DefaultInfoRequest;
/**
 * Query Service Implementation
 */
@Service
@Transactional
public class QueryServiceImpl implements QueryService {

	
	@Autowired
	private DriverSearchRepository driverSearchRepository;
	
	@Autowired
	private TransportQueryResourceApi transportQueryResourceApi; 
	
	/*
	 * private final Logger log = LoggerFactory.getLogger(QueryServiceImpl.class);
	 * private final JestClient jestClient; private final JestElasticsearchTemplate
	 * elasticsearchTemplate;
	 * 
	 * public QueryServiceImpl(JestClient jestClient) { this.jestClient =
	 * jestClient; this.elasticsearchTemplate = new
	 * JestElasticsearchTemplate(this.jestClient); }
	 * 
	 * @Autowired ElasticsearchOperations elasticsearchOperations;
	 * 
	 */
	@Override
	public Page<Driver> findByLocationNear(Point point, Distance distance, Pageable pageable) {
		// TODO Auto-generated method stub
		return driverSearchRepository.findByLocationNear(point,distance,pageable);
	}

	@Override
	public ResponseEntity<DataResponse> getTasks(String name, String nameLike, String description, String priority,
			String minimumPriority, String maximumPriority, String assignee, String assigneeLike, String owner,
			String ownerLike, String unassigned, String delegationState, String candidateUser, String candidateGroup,
			String candidateGroups, String involvedUser, String taskDefinitionKey, String taskDefinitionKeyLike,
			String processInstanceId, String processInstanceBusinessKey, String processInstanceBusinessKeyLike,
			@Valid String processDefinitionId, @Valid String processDefinitionKey,
			@Valid String processDefinitionKeyLike, @Valid String processDefinitionName,
			@Valid String processDefinitionNameLike, @Valid String executionId, @Valid String createdOn,
			@Valid String createdBefore, @Valid String createdAfter, @Valid String dueOn, @Valid String dueBefore,
			@Valid String dueAfter, @Valid Boolean withoutDueDate, @Valid Boolean excludeSubTasks,
			@Valid Boolean active, @Valid Boolean includeTaskLocalVariables, @Valid Boolean includeProcessVariables,
			@Valid String tenantId, @Valid String tenantIdLike, @Valid Boolean withoutTenantId,
			@Valid String candidateOrAssigned, @Valid String category) {
		
		return transportQueryResourceApi.getTasksUsingGET(active, assignee, assigneeLike, candidateGroup, candidateGroups, 
				candidateOrAssigned, candidateUser, category, createdAfter, createdBefore, createdOn, delegationState, description, 
				dueAfter, dueBefore, dueOn, excludeSubTasks, executionId, includeProcessVariables, includeTaskLocalVariables, involvedUser, 
				maximumPriority, minimumPriority, name, nameLike, owner, ownerLike, maximumPriority, processDefinitionId, processDefinitionKey, 
				processDefinitionKeyLike, processDefinitionName, processDefinitionNameLike, processInstanceBusinessKey, processInstanceBusinessKeyLike,
				processInstanceId, taskDefinitionKey, taskDefinitionKeyLike, tenantId, tenantIdLike, unassigned, withoutDueDate, withoutTenantId);
	}

	@Override
	public ResponseEntity<DefaultInfoRequest> getBookingDetails(String processInstanceId) {
		
		return transportQueryResourceApi.getBookingDetailsUsingGET(processInstanceId);
	}

	@Override
	public ResponseEntity<List<DefaultInfoRequest>> getAllOpenBookings(String name, String nameLike, String description,
			String priority, String minimumPriority, String maximumPriority, String assignee, String assigneeLike,
			String owner, String ownerLike, String unassigned, String delegationState, String candidateUser,
			String candidateGroup, String candidateGroups, String involvedUser, String taskDefinitionKey,
			String taskDefinitionKeyLike, String processInstanceId, String processInstanceBusinessKey,
			String processInstanceBusinessKeyLike, @Valid String processDefinitionId,
			@Valid String processDefinitionKey, @Valid String processDefinitionKeyLike,
			@Valid String processDefinitionName, @Valid String processDefinitionNameLike, @Valid String executionId,
			@Valid String createdOn, @Valid String createdBefore, @Valid String createdAfter, @Valid String dueOn,
			@Valid String dueBefore, @Valid String dueAfter, @Valid Boolean withoutDueDate,
			@Valid Boolean excludeSubTasks, @Valid Boolean active, @Valid Boolean includeTaskLocalVariables,
			@Valid Boolean includeProcessVariables, @Valid String tenantId, @Valid String tenantIdLike,
			@Valid Boolean withoutTenantId, @Valid String candidateOrAssigned, @Valid String category) {
		
		return transportQueryResourceApi.getAllOpenBookingsUsingGET(active, assignee, assigneeLike, candidateGroup, candidateGroups, candidateOrAssigned, candidateUser, category, createdAfter, createdBefore, createdOn, delegationState, description, dueAfter, dueBefore, dueOn, excludeSubTasks, executionId, includeProcessVariables, includeTaskLocalVariables, involvedUser, maximumPriority, minimumPriority, name, nameLike, owner, ownerLike, maximumPriority, processDefinitionId, processDefinitionKey, processDefinitionKeyLike, processDefinitionName, processDefinitionNameLike, processInstanceBusinessKey, processInstanceBusinessKeyLike, processInstanceId, taskDefinitionKey, taskDefinitionKeyLike, tenantId, tenantIdLike, unassigned, withoutDueDate, withoutTenantId);
	}

	
}
