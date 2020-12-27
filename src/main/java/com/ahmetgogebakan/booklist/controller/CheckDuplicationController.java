package com.ahmetgogebakan.booklist.controller;

import com.ahmetgogebakan.booklist.swaggergen.controller.CheckDuplicationApi;
import com.ahmetgogebakan.booklist.swaggergen.model.CheckDuplicationRequest;
import com.ahmetgogebakan.booklist.swaggergen.model.CheckDuplicationResponse;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CheckDuplicationController implements CheckDuplicationApi {

    @Override
    public CheckDuplicationResponse checkDuplication(final CheckDuplicationRequest checkDuplicationRequest){
        return new CheckDuplicationResponse();
    }
}
