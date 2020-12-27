package com.ahmetgogebakan.booklist.swaggergen.controller;

import com.ahmetgogebakan.booklist.swaggergen.model.CheckDuplicationRequest;
import com.ahmetgogebakan.booklist.swaggergen.model.CheckDuplicationResponse;
import com.ahmetgogebakan.booklist.swaggergen.model.ExceptionResponse;

import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;

import java.util.List;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import io.swagger.annotations.ApiParam;

    public interface CheckDuplicationApi {
        @RequestMapping(value = "/check-duplication",
            produces = { "application/json" },
            consumes = { "application/json" },
        method = RequestMethod.POST)
        @ApiResponses(value = { 
            @ApiResponse(responseCode = "200", description = "Success Response",
            content = @Content(schema = @Schema(implementation = CheckDuplicationResponse.class))), 
            @ApiResponse(responseCode = "default", description = "Exception Response",
            content = @Content(schema = @Schema(implementation = ExceptionResponse.class)))  })
        CheckDuplicationResponse checkDuplication(@RequestBody CheckDuplicationRequest checkDuplicationRequest);

    }
