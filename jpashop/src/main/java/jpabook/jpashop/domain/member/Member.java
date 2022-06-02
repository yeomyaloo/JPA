package jpabook.jpashop.domain.member;

import javax.persistence.*;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
@Table(name = "MEMBER", uniqueConstraints = {@UniqueConstraint(
        name = "NAME_AGE_UNIQUE",
        columnNames = {"NAME", "AGE"})})
public class Member {

    @Id
    @Column(name = "ID")
    private String id;

    @Column(name="NAME", nullable = false, length = 10)
    private String username;

    //매핑 보가 없는 필드
    private Integer age;

    // == 추가 ==
    @Enumerated(EnumType.STRING)
    private RoleType roleType;

    @Temporal(TemporalType.TIMESTAMP)
    private Date createdDate;

    @Temporal(TemporalType.TIMESTAMP)
    private Date lastModifiedDate;

    @Lob
    private String description;
}
