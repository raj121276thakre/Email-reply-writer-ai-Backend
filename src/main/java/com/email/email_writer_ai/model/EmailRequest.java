package com.email.email_writer_ai.model;

import lombok.Data;

@Data
public class EmailRequest {
    private String emailContent;
    private String tone;
}
