package com.Rbacon2.domain.user;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Slf4j
public class ManagerMemoryRepository implements Repository{
    private static final Map<String, ManagerUser> userMap = new HashMap<>();
    private static long sequence = 0L;
    @Override
    public ManagerUser save(ManagerUser managerUser) {
        managerUser.setNum(++sequence);
        userMap.put(managerUser.getTestId(), managerUser);
        log.info("debug log="+managerUser.getTestName());
        return managerUser;
    }

    @Override
    public List<ManagerUser> findAll() {
        List<ManagerUser> managerUserList = new ArrayList<>();
        return managerUserList;
    }

    @Override
    public ManagerUser findByName(String testId) {
        log.info("debug log="+userMap.get(testId));
        return userMap.get(testId);
    }

    @Override
    public void repositoryClear() {
        userMap.clear();
    }
}
