package com.Rbacon2.domain.user;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class ManagerUser {
    private Long num;
    private String testName;
    private String testId;
    private String testPwd;
    private String testEmail;
    private String testPhone;

    public ManagerUser() {
    }

    public ManagerUser(String testName, String testId, String testPwd, String testEmail, String testPhone) {
        this.testName = testName;
        this.testId = testId;
        this.testPwd = testPwd;
        this.testEmail = testEmail;
        this.testPhone = testPhone;
    }
}
