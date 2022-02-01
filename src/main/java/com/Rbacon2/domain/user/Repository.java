package com.Rbacon2.domain.user;

import java.util.List;

public interface Repository {
    public ManagerUser save(ManagerUser managerUser);

    public List<ManagerUser> findAll();

    public ManagerUser findByName(String testId);

    public void repositoryClear();
}
