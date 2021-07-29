package org.zerock.domain;

import java.util.Date;

import lombok.Data;

@Data
public class BoardVO {

	private int bno;

	private String title;

	private String content;

	private String user;

	private Date reg_dt;

	private Date mod_dt;

}