package org.example.dungeons_and_dragons.character.service;

import org.example.dungeons_and_dragons.character.model.Character;
import org.example.dungeons_and_dragons.character.model.CharacterCreate;
import org.example.dungeons_and_dragons.character.model.CharacterUpdate;
import org.example.dungeons_and_dragons.character.repository.CharacterRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CharacterService {
    private CharacterRepository characterRepository;

    public CharacterService(CharacterRepository characterRepository) {
        this.characterRepository = characterRepository;
    }

    public Character createCharacter(CharacterCreate characterCreate) {
        Character character = new Character();
        character.setName(characterCreate.getName());
        character.setRace(characterCreate.getRace());
        character.setLevel(characterCreate.getLevel());
        characterRepository.save(character);
        return character;
    }

    public List<Character> getCharacters() {
        return characterRepository.findAll();
    }

    public Optional<Character> getCharacter(long characterId) {
        return characterRepository.findById(characterId);
    }

    public Optional<Character> updateCharacter(long characterId, CharacterUpdate characterUpdate) {
        return characterRepository.findById(characterId)
                .map(character -> {
                    character.setLevel(characterUpdate.getLevel());
                    characterRepository.save(character);
                    return character;
                });
    }

    public void deleteCharacter(long characterId) {
        characterRepository.deleteById(characterId);
    }
}
