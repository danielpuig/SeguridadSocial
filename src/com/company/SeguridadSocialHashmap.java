package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by usu26 on 23/09/2016.
 */
public class SeguridadSocialHashmap {
    private Map<String, Persona> personaMapDni = new HashMap<>();
    private Map<String, Persona> personaMapSs = new HashMap<>();

    public void altaPersona(Persona persona) {

        if(!personaMapDni.containsKey(persona.getDni()) && !personaMapSs.containsKey(persona.getNumSS())) {
            personaMapDni.put(persona.getDni(),persona);
            personaMapSs.put(persona.getNumSS(),persona);
        }

    }

    //añado comentario

    public void bajaPersona(String dni) {

        if(personaMapDni.containsKey(dni)) {
            personaMapSs.remove(personaMapDni.get(dni).getNumSS());
            personaMapDni.remove(dni);
        }

    }

    public Persona obtenerPersonaPorDNI(String dni) {
        return personaMapDni.get(dni);
        //personaMapDni.keySet(); ver todas las keys
        //personaMapDni.values(); ver todos los valores
        //personaMapDni.remove(dni); borrar objeto por dni
    }

    public Persona obtenerPersonaPorNumSS(String numSS) {
        return personaMapSs.get(numSS);
    }

    public List<Persona> obtenerPersonasRangoSalarial(double min, double max){
        List<Persona> salarios = new ArrayList<>();
        for (Persona persona1 : personaMapDni.values()) {
            if(persona1.getSalario() >= min && persona1.getSalario() <= max) {
                salarios.add(persona1);
            }
        }
        return salarios;
    }

    public List<Persona> obtenerPersonasMayoresQue(int edad){
        List<Persona> edades = new ArrayList<>();
        for (Persona persona2 : personaMapDni.values()) {
            if(persona2.getEdad() >= edad){
                edades.add(persona2);
            }
        }
        return edades;
    }

    public List<Persona> obtenerTodas() {
        List<Persona> todas = new ArrayList<>();
        for (Persona persona3 : personaMapDni.values()) {
            todas.add(persona3);
        }
        return todas;
    }

    @Override
    public String toString() {
        return "SeguridadSocialHashmap{" +
                "personaMapDni=" + personaMapDni +
                ", personaMapSs=" + personaMapSs +
                '}';
    }

}
