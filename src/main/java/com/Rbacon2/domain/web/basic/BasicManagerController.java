package com.Rbacon2.domain.web.basic;

import com.Rbacon2.domain.user.ManagerMemoryRepository;
import com.Rbacon2.domain.user.ManagerUser;
import com.Rbacon2.domain.user.Repository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Slf4j
@Controller
@RequestMapping("/basic/login")
@RequiredArgsConstructor
public class BasicManagerController {
    private final Repository memoryRepository = new ManagerMemoryRepository();

    @GetMapping
    public String loginHome(){
        return "basic/loginForm";
    }

    @GetMapping("/add")
    public String saveForm() {
        return "basic/addForm";
    }

    @PostMapping("/add")
    public String save(@RequestParam String testName,
                       @RequestParam String testId,
                       @RequestParam String testPwd,
                       @RequestParam String testEmail,
                       @RequestParam String testPhone,
                       Model model) {
        ManagerUser managerUser = new ManagerUser();
        managerUser.setTestName(testName);
        managerUser.setTestId(testId);
        managerUser.setTestPwd(testPwd);
        managerUser.setTestEmail(testEmail);
        managerUser.setTestPhone(testPhone);
        memoryRepository.save(managerUser);
        model.addAttribute("managerUser", managerUser);
        log.info("debug log={}",managerUser.toString());
        return "basic/addForm";
    }
}
