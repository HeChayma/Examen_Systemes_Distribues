package command.controllers;

import command.commands.AddReviewCommand;
import command.commands.CreateConferenceCommand;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.web.bind.annotation.*;
import query.dto.ConferenceRequestDTO;
import query.dto.ReviewRequestDTO;

import java.time.LocalDateTime;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;

@RestController
@RequestMapping("/commands/conferences")
public class ConferenceCommandController {

    private final CommandGateway commandGateway;

    public ConferenceCommandController(CommandGateway commandGateway) {
        this.commandGateway = commandGateway;
    }

    @PostMapping
    public CompletableFuture<String> createConference(@RequestBody ConferenceRequestDTO dto) {
        return commandGateway.send(new CreateConferenceCommand(
                UUID.randomUUID().toString(),
                dto.getTitre(),
                dto.getType(),
                dto.getDate(),
                dto.getDuree()
        ));
    }

    @PostMapping("/{id}/reviews")
    public CompletableFuture<String> addReview(
            @PathVariable String id,
            @RequestBody ReviewRequestDTO dto) {

        return commandGateway.send(new AddReviewCommand(
                id,
                UUID.randomUUID().toString(),
                LocalDateTime.now(),
                dto.getTexte(),
                dto.getNote()
        ));
    }
}

