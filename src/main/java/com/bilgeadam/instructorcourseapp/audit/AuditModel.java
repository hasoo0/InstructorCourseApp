package com.bilgeadam.instructorcourseapp.audit;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Date;

@Data
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class AuditModel {

    @Temporal(TemporalType.TIMESTAMP)
    @CreatedDate
    @Column(name = "created_ad", nullable = false,updatable = false)
    private Date createdAt;

    @Temporal(TemporalType.TIMESTAMP)
    @LastModifiedDate
    @Column(name = "updated_ad",nullable = false)
    private Date updatedAd;



}
