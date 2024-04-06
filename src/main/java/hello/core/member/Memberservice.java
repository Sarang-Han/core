package hello.core.member;

public interface Memberservice {

    void join(Member member);

    Member findMember(Long memberId);
}
