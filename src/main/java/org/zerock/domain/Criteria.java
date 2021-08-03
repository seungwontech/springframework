//package org.zerock.domain;
//
//import org.springframework.web.util.UriComponentsBuilder;
//
//import lombok.Getter;
//import lombok.Setter;
//import lombok.ToString;
//
//@ToString
//@Setter
//@Getter
//public class Criteria {
//
//	private int pageNum;// 1페이지
//	private int amount;// 10개씩
//
//	private String type;
//	private String keyword;
//
//	public Criteria() {
//		this(1, 10);
//	}
//
//	public Criteria(int pageNum, int amount) {
//		this.pageNum = pageNum;
//		this.amount = amount;
//	}
//
//	public String[] getTypeArr() {
//
//		return type == null ? new String[] {} : type.split("");
//	}
//
//	public String getListLink() {
//		UriComponentsBuilder builder = UriComponentsBuilder.fromPath("")
//				.queryParam("pageNum", this.pageNum)
//				.queryParam("amount", this.getAmount())
//				.queryParam("type", this.getType())
//				.queryParam("keyword", this.getKeyword());
//		return builder.toUriString();
//	}
//}
