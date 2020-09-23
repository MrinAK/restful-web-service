package eu.restfulwebservice.controller;

import eu.restfulwebservice.service.UserService;
import eu.restfulwebservice.service.dto.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
//import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("api/v1/users")
@RestController
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/")
//    @PreAuthorize("")
    public List<UserDTO> getAll() {
        return userService.findAll();
    }

    @PostMapping("/")
//    @PreAuthorize("")
    public ResponseEntity<Void> create(@RequestBody UserDTO userDTO) {
        userService.create(userDTO);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping("/{userId}")
//    @PreAuthorize("")
    public UserDTO findById(@PathVariable("userId") Long userId) {
        return userService.findById(userId);
    }

    @DeleteMapping("/{userId}")
//    @PreAuthorize("")
    public ResponseEntity<Void> hardDelete(@PathVariable("userId") Long userId) {
        userService.deleteById(userId);
        return new ResponseEntity<>(HttpStatus.GONE);
    }

    @DeleteMapping("/{userId}")
//    @PreAuthorize("")
    public ResponseEntity<Void> softDelete(@PathVariable("userId") Long userId) {
        userService.deleteById(userId);
        return new ResponseEntity<>(HttpStatus.GONE);
    }

}
