package se.lexicon.todo_app.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Builder;
import se.lexicon.todo_app.entity.Role;

import java.util.Set;

@Builder
public record PersonDto(
        Long id,

        @NotBlank(message = "Name is required")
        @Size(min = 2, max = 100, message = "Name must be between 2 and 100 characters")
        String name,

        @NotBlank(message = "Email is required")
        @Email(message = "Invalid email format")
        @Size(max = 150, message = "Email must be less than 150 characters")
        String email,

        // New fields needed for the frontend:
        String username,
        Set<Role> roles)
{}
