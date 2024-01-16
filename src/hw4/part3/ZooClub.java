package hw4.part3;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ZooClub {
    private Map<Person, List<Pet>> club = new HashMap<>();
    public void addPersonToClub(Person person) {
        club.put(person, person.getAnimal());
    }
    public void addAnimalToPerson(Person person, Pet pet) {
        club.get(person).add(pet);
        //club.put(person, pets);
    }
    public void removeAnimalInPerson(Person person, Pet pet) {
        List<Pet> pets = club.get(person);
        pets.remove(pet);
    }
    public void removePersonFromClub(Person person) {
        club.remove(person);
    }
    public void removePetFromAllClub(Pet pet) {
        Set<Map.Entry<Person, List<Pet>>> entries = club.entrySet();
        for (Map.Entry<Person, List<Pet>> entry : entries) {
            List<Pet> value = entry.getValue();
            value.removeIf(next -> next.equals(pet));
        }
    }
}
