package connection_people_and_books_application.member.repository

import connection_people_and_books_application.member.model.Member
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface MemberRepository : JpaRepository<Member, Long>
