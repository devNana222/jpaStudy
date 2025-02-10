package jpabook.jpashop.domain;

import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@MappedSuperclass
public abstract class BaseEntity {
    public String createdBy;
    public String updatedBy;
    public LocalDateTime createdDate;
    public LocalDateTime updatedDate;
}
