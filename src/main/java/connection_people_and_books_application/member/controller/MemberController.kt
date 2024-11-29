package connection_people_and_books_application.member.controller

import connection_people_and_books_application.common.model.PagingData
import connection_people_and_books_application.member.model.Member
import connection_people_and_books_application.member.service.MemberService
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.ResponseBody

@Controller
class MemberController(
    private val memberService: MemberService
) {

    @GetMapping("/member")
    fun findAll(@RequestParam(defaultValue = "0") page: Int, @RequestParam(defaultValue = "10") size: Int)
            : ResponseEntity<PagingData<Member>> {
        val selectMembers = memberService.selectMembers(page, size)
        return ResponseEntity.ok(PagingData(selectMembers));
    }
}
