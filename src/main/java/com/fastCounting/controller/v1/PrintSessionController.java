package com.fastCounting.controller.v1;

import com.fastCounting.controller.RestConstant;
import com.fastCounting.dao.PrintSessionDao;
import com.fastCounting.domain.model.PrintSession;
import com.fastCounting.domain.pojo.search.PrintSessionSearch;
import com.fastCounting.utils.ControllerUtils;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(RestConstant.V1 + "/print-sessions")
@AllArgsConstructor
public class PrintSessionController {
    private PrintSessionDao printSessionDao;
    private ControllerUtils controllerUtils;

    private final static String SEARCH = "/search";

    @Secured({RestConstant.ROLE_USER, RestConstant.ROLE_ADMIN})
    @RequestMapping(method = RequestMethod.POST)
    void create(@RequestBody PrintSession printSession) {
        printSessionDao.create(printSession);
    }

    @Secured({RestConstant.ROLE_USER, RestConstant.ROLE_ADMIN})
    @RequestMapping(value = SEARCH, method = RequestMethod.POST)
    ResponseEntity getAll(@RequestBody PrintSessionSearch printSessionSearch) {
        HttpHeaders headers = new HttpHeaders();
        headers.addAll(controllerUtils.getTotalSize(printSessionDao, printSessionSearch));
        return new ResponseEntity(printSessionDao.getAll(printSessionSearch), headers, HttpStatus.OK);
    }
}
