package jpabook.jpashop.domain;

import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data
public class Album extends Item{
    public String artist;
    public String etc;
}
