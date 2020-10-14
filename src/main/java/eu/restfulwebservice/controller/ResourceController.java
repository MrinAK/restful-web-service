package eu.restfulwebservice.controller;

import eu.restfulwebservice.service.ResourceService;
import eu.restfulwebservice.service.dto.ResourceDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/v1/resources")
@RestController
public class ResourceController {

    private final ResourceService resourceService;

    @Autowired
    public ResourceController(ResourceService resourceService) {
        this.resourceService = resourceService;
    }

    @PostMapping("/")
    public ResponseEntity<Void> create(@RequestBody @Validated ResourceDTO resourceDTO){
        resourceService.create(resourceDTO);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

}
