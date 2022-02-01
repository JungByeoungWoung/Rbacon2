package com.Rbacon2.domain.user;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class MemoryRepositoryTest {
    Repository memoryMemberRepository = new ManagerMemoryRepository();

    @Test
    public void save() {
        //given
        ManagerUser managerUser =
                new ManagerUser("testName","testId","testPwd","testEmail","testPhone");
        //when
        ManagerUser saveManagerUser =memoryMemberRepository.save(managerUser);
        //then
        ManagerUser findManagerUser = memoryMemberRepository.findByName(saveManagerUser.getTestId());
        Assertions.assertThat(findManagerUser).isEqualTo(saveManagerUser);
    }
}
