package hello.core.member;

public interface MemberService {

    void join(Member member) ; //save

    Member findMember(Long memberId);

}
