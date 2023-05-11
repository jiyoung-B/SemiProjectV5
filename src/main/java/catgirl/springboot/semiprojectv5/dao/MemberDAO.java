package catgirl.springboot.semiprojectv5.dao;

import catgirl.springboot.semiprojectv5.model.Member;

public interface MemberDAO {
    int selectLogin(Member m);
}
