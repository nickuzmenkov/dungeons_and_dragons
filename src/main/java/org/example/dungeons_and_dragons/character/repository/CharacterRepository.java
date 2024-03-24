package org.example.dungeons_and_dragons.character.repository;

import org.example.dungeons_and_dragons.character.model.Character;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CharacterRepository extends JpaRepository<Character, Long> {
}
