package eu.restfulwebservice.controller;

import eu.restfulwebservice.service.ResourceService;
import eu.restfulwebservice.service.dto.ResourceDTO;
import eu.restfulwebservice.service.dto.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/v1/resources")
@RestController
public class ResourceController {

    private final ResourceService resourceService;

    @Autowired
    public ResourceController(ResourceService resourceService) {
        this.resourceService = resourceService;
    }

    @PostMapping("/")
    //    @PreAuthorize("")
    public ResponseEntity<Void> create(@RequestBody @Validated ResourceDTO resourceDTO){
        resourceService.create(resourceDTO);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping("/")
    //    @PreAuthorize("")
    public List<ResourceDTO> getAll() {
        return resourceService.findAll();
    }

}