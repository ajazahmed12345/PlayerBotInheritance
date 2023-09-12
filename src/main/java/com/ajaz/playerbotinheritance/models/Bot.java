package com.ajaz.playerbotinheritance.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.PrimaryKeyJoinColumn;
import lombok.Data;

@Entity
@PrimaryKeyJoinColumn(name = "player_id")
public class Bot extends Player{



}
