package org.mbc.czo.function.product.dto;

import com.querydsl.core.annotations.QueryProjection;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class MainItemDto {

    private Long id;

    private String itemNm; // 아이템 이름

    private String itemDetail; // 세부정보

    private String imgUrl;

    private Integer price; // 가격

    // ★ 새로 추가 - 정렬을 위한 필드들
    private Integer likes;   // 좋아요 수
    private Integer views;   // 조회수

    @QueryProjection // 생성자에 어노테이션을 선언하여 Querydsl로 결과 조회 시  MainitemDto 객체로 받아오도록 활용
    public MainItemDto(Long id, String itemNm, String itemDetail, String imgUrl, Integer price) {
        this.id = id;
        this.itemNm = itemNm;
        this.itemDetail = itemDetail;
        this.imgUrl = imgUrl;
        this.price = price;

    }

    // ★ 새로 추가 - likes, views 포함 생성자
    @QueryProjection
    public MainItemDto(Long id, String itemNm, String itemDetail, String imgUrl, Integer price, Integer likes, Integer views) {
        this.id = id;
        this.itemNm = itemNm;
        this.itemDetail = itemDetail;
        this.imgUrl = imgUrl;
        this.price = price;
        this.likes = likes;      // 좋아요 수 추가
        this.views = views;      // 조회수 추가
    }

}
