package eu.restfulwebservice.controller;

import eu.restfulwebservice.service.UserService;
import eu.restfulwebservice.service.dto.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
//  TODO @PreAuthorize("")
    public List<UserDTO> getAll() {
        return userService.findAll();
    }

    @PostMapping("/")
//  TODO @PreAuthorize("")
    public ResponseEntity<Void> create(@RequestBody UserDTO userDTO) {
        userService.create(userDTO);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping("/{userId}")
//    TODO @PreAuthorize("")
    public UserDTO findById(@PathVariable("userId") Long userId) {
        return userService.findById(userId);
    }

    @DeleteMapping("/{userId}")
//  TODO @PreAuthorize("")
    public ResponseEntity<Void> delete(@PathVariable("userId") Long userId) {
        userService.deleteById(userId);
        return new ResponseEntity<>(HttpStatus.GONE);
    }
}
