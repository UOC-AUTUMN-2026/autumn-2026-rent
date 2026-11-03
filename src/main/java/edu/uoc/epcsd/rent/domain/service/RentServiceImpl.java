package edu.uoc.epcsd.rent.domain.service;

import edu.uoc.epcsd.rent.domain.User;
import edu.uoc.epcsd.rent.domain.Item;
import edu.uoc.epcsd.rent.domain.ItemStatus;
import edu.uoc.epcsd.rent.domain.Rent;
import edu.uoc.epcsd.rent.domain.RentStatus;
import edu.uoc.epcsd.rent.domain.repository.RentRepository;
import lombok.RequiredArgsConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import java.util.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor(onConstructor = @__(@Autowired))
@Service
public class RentServiceImpl implements RentService {
    
    //TODO
	
}
