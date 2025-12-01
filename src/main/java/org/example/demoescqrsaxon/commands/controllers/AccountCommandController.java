package org.example.demoescqrsaxon.commands.controllers;

import org.axonframework.commandhandling.gateway.CommandGateway;
import org.example.demoescqrsaxon.commands.commands.AddAccountCommand;
import org.example.demoescqrsaxon.commands.dtos.AddNewAccountRequestDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;
import java.util.concurrent.CompletableFuture;

@RestController
@RequestMapping("/commands")
public class AccountCommandController {
    private CommandGateway commandGateway;

    public AccountCommandController(CommandGateway commandGateway) {
        this.commandGateway = commandGateway;
    }

    @PostMapping("/add")
    public CompletableFuture<String> addNewAccountCommand(@RequestBody AddNewAccountRequestDTO request){
        CompletableFuture<String> response = commandGateway.send(new AddAccountCommand(
                UUID.randomUUID().toString(),
                request.initialBalance(),
                request.currency()
        ));
        return response;
    }
}
