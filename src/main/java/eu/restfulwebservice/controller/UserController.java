package eu.restfulwebservice.controller;

import eu.restfulwebservice.service.UserService;
import eu.restfulwebservice.service.dto.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.annotation.Validated;
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

    @PostMapping("/")
    //    @PreAuthorize("")
    public ResponseEntity<Void> create(@RequestBody @Validated UserDTO userDTO) {
        userService.create(userDTO);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping("/")
    //    @PreAuthorize("")
    public List<UserDTO> getAll() {
        return userService.findAll();
    }

    @GetMapping("/{userId}")
    //    @PreAuthorize("")
    public UserDTO findById(@PathVariable("userId") Long userId) {
        return userService.findById(userId);
    }

    @PutMapping("/{userId}")
//    @PreAuthorize("")
    public ResponseEntity<UserDTO> updateById(@PathVariable("userId") Long userId, @RequestBody @Validated UserDTO userDTO) {
        return ResponseEntity.ok(userService.updateById(userId, userDTO));
    }

    @DeleteMapping("/{userId}")
    //    @PreAuthorize("")
    public ResponseEntity<Void> deleteById(@PathVariable("userId") Long userId) {
        userService.deleteById(userId);
        return new ResponseEntity<>(HttpStatus.GONE);
    }

}
