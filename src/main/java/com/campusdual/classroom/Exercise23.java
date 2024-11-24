package com.campusdual.classroom;

import java.util.HashMap;
import java.util.Map;

public class Exercise23 {

    public static Map<String, Person> createHashMap() {
        Map<String,Person> personaMap = new HashMap<>();
        personaMap.put("person",new Person("John","Smith"));
        personaMap.put("teacher",new Teacher("María","Montessori","Educación"));
        personaMap.put("police",new PoliceOfficer("Jake","Peralta","B-99"));
        personaMap.put("doctor",new Doctor("Gregory","House","Nefrología e infectología"));
        return personaMap;
    }

    public static Person addMapValue(Map<String, Person> map, String key, Person value) {
        map.put(key, value);
        return value;
    }

    public static void printMapValues(Map<String, Person> map) {
        for (Person persona : map.values()) {
            persona.getDetails();
        }
    }

    public static void main(String[] args) {
        Map <String,Person> mapPersonas = new HashMap<>();
        mapPersonas=createHashMap();
        addMapValue(mapPersonas,"police",new PoliceOfficer("Charles","Boyle","B-99"));
        printMapValues(mapPersonas);
    }
}
