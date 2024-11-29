package connection_people_and_books_application.member.model

import connection_people_and_books_application.common.model.BaseEntity
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Table

@Entity
@Table(name = "member")
data class Member(

    @Column(name = "name")
    val name: String = ""

) : BaseEntity()



