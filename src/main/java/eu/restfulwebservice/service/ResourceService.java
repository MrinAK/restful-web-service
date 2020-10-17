package eu.restfulwebservice.service;

import eu.restfulwebservice.persistence.entity.Resource;
import eu.restfulwebservice.persistence.repository.ResourceRepository;
import eu.restfulwebservice.service.dto.ResourceDTO;
import eu.restfulwebservice.service.dto.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ResourceService {

    private final ResourceRepository resourceRepository;

    @Autowired
    public ResourceService(ResourceRepository resourceRepository) {
        this.resourceRepository = resourceRepository;
    }

    public void create(ResourceDTO resourceDTO) {

        Resource resource = Resource.create(
                resourceDTO.getResourceId(),
                resourceDTO.getRoleId(),
                resourceDTO.getResourceName());
        resourceRepository.save(resource);
    }

    public List<ResourceDTO> findAll() {
        return resourceRepository.findAll()
                .stream()
                .map(resource -> new ResourceDTO(resource.getResourceId(),
                        resource.getRoleId(),
                        resource.getResourceName()))
                .collect(Collectors.toList());
    }
}