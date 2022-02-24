package com.Rbacon2.domain.user;

import com.Rbacon2.mapper.ManagerMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@Service
@RequiredArgsConstructor
public class ManagerOraRepository {
    @Autowired
    ManagerMapper managerMapper;

    @Transactional
    public void joinManager(ManagerUser managerUser) {
        managerUser.setTestName(managerUser.getTestName());
        managerUser.setTestId(managerUser.getTestId());
        managerUser.setTestPwd(managerUser.getTestPwd());
        managerUser.setTestEmail(managerUser.getTestEmail());
        managerUser.setTestPhone(managerUser.getTestPhone());
        managerMapper.saveManager(managerUser);
    }
}
