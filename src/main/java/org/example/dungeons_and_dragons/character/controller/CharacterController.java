package org.example.dungeons_and_dragons.character.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.example.dungeons_and_dragons.character.model.Character;
import org.example.dungeons_and_dragons.character.model.CharacterCreate;
import org.example.dungeons_and_dragons.character.model.CharacterUpdate;
import org.example.dungeons_and_dragons.character.service.CharacterService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/characters")
@Tag(name = "Character Controller", description = "Manage characters")
public class CharacterController {
    private CharacterService characterService;

    public CharacterController(CharacterService characterService) {
        this.characterService = characterService;
    }

    @PostMapping
    @Operation(summary = "Create a new character")
    public ResponseEntity<Character> createCharacter(@RequestBody CharacterCreate characterCreate) {
        Character character = characterService.createCharacter(characterCreate);
        return ResponseEntity.status(HttpStatus.CREATED).body(character);
    }

    @GetMapping
    @Operation(summary = "Get all existing characters")
    public ResponseEntity<List<Character>> getCharacters() {
        return ResponseEntity.status(HttpStatus.OK).body(characterService.getCharacters());
    }

    @GetMapping("/{characterId}")
    @Operation(summary = "Get existing character by ID")
    public ResponseEntity<Character> getCharacter(@PathVariable long characterId) {
        Optional<Character> character = characterService.getCharacter(characterId);
        return character.map(value -> ResponseEntity.status(HttpStatus.OK).body(value)).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PutMapping("/{characterId}")
    @Operation(summary = "Update existing character")
    public ResponseEntity<Character> updateCharacter(@PathVariable long characterId, @RequestBody CharacterUpdate characterUpdate) {
        Optional<Character> character = characterService.updateCharacter(characterId, characterUpdate);
        return character.map(value -> ResponseEntity.status(HttpStatus.OK).body(value)).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{characterId}")
    @Operation(summary = "Delete existing character by ID")
    public ResponseEntity<Void> deleteCharacter(@PathVariable long characterId) {
        characterService.deleteCharacter(characterId);
        return ResponseEntity.status(HttpStatus.OK).build();
    }
}
