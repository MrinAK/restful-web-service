package eu.restfulwebservice.service;

import eu.restfulwebservice.persistence.entity.User;
import eu.restfulwebservice.persistence.repository.UserRepository;
import eu.restfulwebservice.service.dto.UserDTO;
import eu.restfulwebservice.service.exeption.ResourceNotFound;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void create(UserDTO userDTO) {

        User user = User.create(
                userDTO.getUserId(),
                userDTO.getMail(),
                userDTO.getUserUniqueId(),
                userDTO.getRoleId(),
                userDTO.getFirstName(),
                userDTO.getLastName(),
                userDTO.getDataCreated(),
                userDTO.getDateModified(),
                userDTO.getPassword());

        userRepository.save(user);
    }

    public List<UserDTO> findAll() {

        return userRepository.findAll()
                .stream()
                .map(user -> new UserDTO(
                        user.getUserId(),
                        user.getMail(),
                        user.getUserUniqueId(),
                        user.getRoleId(),
                        user.getFirstName(),
                        user.getLastName(),
                        user.getDataCreated(),
                        user.getDateModified(),
                        user.getPassword()
                )).collect(Collectors.toList());
    }

    public UserDTO findById(Long userId) {

        User user = userRepository.findById(userId).orElseThrow(ResourceNotFound::new);

        return new UserDTO(user.getUserId(),
                user.getMail(),
                user.getUserUniqueId(),
                user.getRoleId(),
                user.getFirstName(),
                user.getLastName(),
                user.getDataCreated(),
                user.getDateModified(),
                user.getPassword());
    }

    @Transactional
    public void deleteById(Long userId) {
        userRepository.findById(userId).orElseThrow(ResourceNotFound::new);
        userRepository.deleteById(userId);
    }
}