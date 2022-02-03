package com.Rbacon2.domain.web.basic;

import com.Rbacon2.domain.user.ManagerMemoryRepository;
import com.Rbacon2.domain.user.ManagerUser;
import com.Rbacon2.domain.user.Repository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Slf4j
@Controller
@RequestMapping("/basic/addForm")
@RequiredArgsConstructor
public class BasicManagerController {
    private Repository memoryRepository = new ManagerMemoryRepository();

    @GetMapping
    public String saveForm() {
        return "basic/addForm";
    }
//    public String save(@RequestParam String testName,
//                       @RequestParam String testId,
//                       @RequestParam String testPwd,
//                       @RequestParam String testEmail,
//                       @RequestParam String testPhone,
//                       Model model) {
//        ManagerUser managerUser = new ManagerUser();
//        managerUser.setTestName(managerUser.getTestName());
//        managerUser.setTestId(managerUser.getTestId());
//        managerUser.setTestPwd(managerUser.getTestPwd());
//        managerUser.setTestEmail(managerUser.getTestEmail());
//        managerUser.setTestPhone(managerUser.getTestPhone());
//        memoryRepository.save(managerUser);
//        log.info("debug log={}",managerUser.toString());
//        return "basic/addForm";
//    }
}
