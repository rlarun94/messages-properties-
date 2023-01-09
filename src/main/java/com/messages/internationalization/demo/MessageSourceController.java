package com.messages.internationalization.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.web.bind.annotation.*;

import java.util.Locale;

@RestController
@RequestMapping("/")
public class MessageSourceController {

    @Autowired
    private MessageSource messageSource;

    @GetMapping(path = "/message-internationalize/{messageKey}")
    public String getMessage(@RequestHeader(name = "Accept-Language", required = false) Locale locale, @PathVariable String messageKey) {
        return messageSource.getMessage(messageKey, null, locale);
    }

}
