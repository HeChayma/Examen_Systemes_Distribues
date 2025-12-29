package command.controllers;

import command.commands.CreateKeynoteCommand;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import query.dto.KeynoteRequestDTO;

import java.util.UUID;
import java.util.concurrent.CompletableFuture;

@RestController
@RequestMapping("/commands/keynotes")
public class KeynoteCommandController {

    private final CommandGateway commandGateway;

    public KeynoteCommandController(CommandGateway commandGateway) {
        this.commandGateway = commandGateway;
    }

    @PostMapping
    public CompletableFuture<String> createKeynote(@RequestBody KeynoteRequestDTO dto) {
        return commandGateway.send(new CreateKeynoteCommand(
                UUID.randomUUID().toString(),
                dto.getNom(),
                dto.getPrenom(),
                dto.getEmail(),
                dto.getFonction()
        ));
    }
}
