package com.company.testproj.entity;

import io.jmix.core.DeletePolicy;
import io.jmix.core.annotation.DeletedBy;
import io.jmix.core.annotation.DeletedDate;
import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.entity.annotation.OnDeleteInverse;
import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;

import java.time.OffsetDateTime;
import java.util.UUID;

@JmixEntity
@Table(name = "TP1_CHILD", indexes = {
        @Index(name = "IDX_TP1_CHILD_PARENT", columnList = "PARENT_ID")
})
@Entity(name = "tp1_Child")
public class Child {
    @Column(name = "ID", nullable = false)
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "tp1_child_seq")
    @SequenceGenerator(name = "tp1_child_seq", sequenceName = "tp1_child_seq", allocationSize = 1)
    private Long id;

    @InstanceName
    @Column(name = "NAME")
    private String name;

    @JmixGeneratedValue
    @Column(name = "UUID")
    private UUID uuid;

    @DeletedBy
    @Column(name = "DELETED_BY")
    private String deletedBy;

    @DeletedDate
    @Column(name = "DELETED_DATE")
    private OffsetDateTime deletedDate;

    @Column(name = "VERSION", nullable = false)
    @Version
    private Integer version;
    @OnDeleteInverse(DeletePolicy.CASCADE)
    @JoinColumn(name = "PARENT_ID", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private Parent parent;

    public Parent getParent() {
        return parent;
    }

    public void setParent(Parent parent) {
        this.parent = parent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public OffsetDateTime getDeletedDate() {
        return deletedDate;
    }

    public void setDeletedDate(OffsetDateTime deletedDate) {
        this.deletedDate = deletedDate;
    }

    public String getDeletedBy() {
        return deletedBy;
    }

    public void setDeletedBy(String deletedBy) {
        this.deletedBy = deletedBy;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}