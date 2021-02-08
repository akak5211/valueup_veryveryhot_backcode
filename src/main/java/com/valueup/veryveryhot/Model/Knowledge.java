package com.valueup.veryveryhot.Model;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;


@Getter
@AllArgsConstructor
public class Knowledge{

    private final String knowledgetitle;
    private final String knowledgepeople;
    private final String knowledgecontent;
    private final String parentid;
    private final String knowledgedate;

    @Id
    private String id;

}
