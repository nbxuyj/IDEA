package com.xuyj.demospring.designMode.flyweight;

import com.xuyj.demospring.designMode.flyweight.impl.ConcreteCharacter;

import java.util.HashMap;
import java.util.Map;



public class CharacterFactory {
    private final Map<Character, ConcreteCharacter> characterMap = new HashMap<Character, ConcreteCharacter>();

    public ConcreteCharacter getCharacter(char character) {
        ConcreteCharacter concreteCharacter = characterMap.get(character);

        if (concreteCharacter == null) {
            concreteCharacter = new ConcreteCharacter(character);
            characterMap.put(character, concreteCharacter);
        }

        return concreteCharacter;
    }
}