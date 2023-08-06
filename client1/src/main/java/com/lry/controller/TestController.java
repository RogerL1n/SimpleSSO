package com.lry.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lin
 */
@RestController
public class TestController {

    @GetMapping("/nor")
    @PreAuthorize("hasAuthority('ROLE_NORMAL')")
    public String normal( ) {
        return "normal permission test success !!!";
    }

    @GetMapping("/med")
    @PreAuthorize("hasAuthority('ROLE_MEDIUM')")
    public String medium() {
        return "medium permission test success !!!";
    }

    @GetMapping("/adm")
    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    public String admin() {
        return "admin permission test success !!!";
    }
}
