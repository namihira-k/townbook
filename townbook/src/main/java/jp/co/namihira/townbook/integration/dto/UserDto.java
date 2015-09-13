/*
 * Copyright 2015 Kosuke Namihira All Rights Reserved.
 */
package jp.co.namihira.townbook.integration.dto;

import java.util.UUID;

import javax.validation.constraints.NotNull;

import lombok.Data;

/**
 * User Dto
 */
@Data
public class UserDto {

    private int id;

    @NotNull
    private String userId;

    @NotNull
    private String name;

    @NotNull
    private String password;

    private UUID uuid;

}
