package connection_people_and_books_application.member.service

import connection_people_and_books_application.member.model.Member
import connection_people_and_books_application.member.repository.MemberRepository
import lombok.RequiredArgsConstructor
import org.springframework.stereotype.Service

@Service
@RequiredArgsConstructor
class MemberService(
    private val memberRepository: MemberRepository
) {

    fun selectMembers() : List<Member> {
        return memberRepository.findAll();
    }
}
