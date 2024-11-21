package com.ClassesAndObjects;

import java.util.ArrayList;
import java.util.List;

public class TeamDTO {

    private String name;
    private String city;
    private String division;
    private List<PlayerDTO> players;

    public TeamDTO(String name, String city, String division) {
        this.name = name;
        this.city = city;
        this.division = division;
        this.players = new ArrayList<>();
    } 

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    public List<PlayerDTO> getPlayers() {
        return players;
    }

    public void setPlayers(List<PlayerDTO> players) {
        this.players = players;
    }

    @Override
    public String toString(){

        String player = "";

        for(PlayerDTO p:players)
            player+=("%n"+p.toString());

        return """
                %s

                    Team Name  : %s
                    City  : %s
                    Division    : %s
                %s
                    Players:%s
                %s
            """.formatted("_".repeat(40),getName(),getCity(),
                            getDivision(),"_".repeat(40),player,"_".repeat(40));
    }

    
}

class PlayerDTO {
    
    private String name;
    private String position;
    private int jerseyNumber;

    public PlayerDTO(String name, String position, int jerseyNumber) {
        this.name = name;
        this.position = position;
        this.jerseyNumber = jerseyNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getJerseyNumber() {
        return jerseyNumber;
    }

    public void setJerseyNumber(int jerseyNumber) {
        this.jerseyNumber = jerseyNumber;
    }

    @Override
    public String toString(){

        return """
                %s

                    Player Name   : %s
                    Position  : %s
                    Jersey Number    : %s
                %s
            """.formatted("_".repeat(40),getName(),getPosition(),
                            getJerseyNumber(),"_".repeat(40));
    }

    
}
