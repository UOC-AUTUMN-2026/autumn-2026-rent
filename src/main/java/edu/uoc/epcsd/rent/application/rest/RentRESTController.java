package edu.uoc.epcsd.rent.application.rest;

import edu.uoc.epcsd.rent.application.rest.request.RentRequest;
import edu.uoc.epcsd.rent.domain.Item;
import edu.uoc.epcsd.rent.domain.Rent;
import edu.uoc.epcsd.rent.domain.service.RentService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.net.URI;
import java.util.List;

@Log4j2
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
@RestController
@RequestMapping("/rents")
public class RentRESTController {

    private final RentService rentService;
    
    //TODO
}
