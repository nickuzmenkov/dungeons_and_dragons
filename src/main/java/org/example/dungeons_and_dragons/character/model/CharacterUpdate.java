package org.example.dungeons_and_dragons.character.model;

import jakarta.persistence.Column;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CharacterUpdate {
    @NotNull
    @Column(nullable = false)
    private int level;
}
