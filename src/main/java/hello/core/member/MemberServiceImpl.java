package hello.core.member;

public class MemberServiceImpl implements MemberService {

    private final MemberRepository memberRepository;

    public MemberServiceImpl(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Override
    public void join(Member member) {
        memberRepository.save(member);
    } //오버라이드 된 것이 호출됨

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }
}
