package com.example.greeting.messaging;

import com.example.greeting.configuration.FeignClientConfig;
import com.example.greeting.model.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "user-app", configuration = FeignClientConfig.class)
public interface UsersClient {
    @RequestMapping(value = "/users/id/{id}", method = RequestMethod.GET)
    User findUserById(@PathVariable("id") long id);
}
