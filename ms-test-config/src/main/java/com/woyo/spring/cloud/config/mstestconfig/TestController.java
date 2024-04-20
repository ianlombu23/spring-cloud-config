package com.woyo.spring.cloud.config.mstestconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test/v1")
public class TestController {

    @Autowired
    private AccountsContactInfoDTO accountsContactInfoDTO;

    @Value("${build.version:5.0}")
    private String buildVersion;

    @GetMapping("/connect")
    public String tesConnection() {
        return "Connection...";
    }

    @GetMapping("/version")
    public String getVersion() {
        return buildVersion;
    }

    @GetMapping("/accounts/info")
    public ResponseEntity<AccountsContactInfoDTO> getAccountsInfo() {
        return ResponseEntity.status(200).body(accountsContactInfoDTO);
    }


}
