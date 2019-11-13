package com.poc.pocskoda.controllers;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;
@Api(value = "testing",description = "this is lit")
@RestController
public class TestContoller {
    @ApiOperation(value = "welcome",response = String.class)
    @GetMapping("/")
    public String welcome(){
        return "Welcome User";
    }

    @ApiOperation(value = "Get User",response = String.class)
    @GetMapping("/getuser/{user}")
    public String userName(@PathVariable("user") String user){
        return "Welcome "+user;
    }

    @ApiOperation(value = "Create User",response = String.class)
    @PostMapping("createuser/{user}")
    public String createUser(@PathVariable("user") String user){
        return "user created with name "+user;
    }

    @ApiOperation(value = "Update User",response = String.class)
    @PutMapping("updateuser/{user}")
    public String updateUser(@PathVariable("user") String user){
        return "user updated with name "+user;
    }
}
