package org.mbc.czo.function.product.dto;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.mbc.czo.function.product.constant.ItemSellStatus;
import org.mbc.czo.function.product.domain.Item;
import org.modelmapper.ModelMapper;


import java.util.ArrayList;
import java.util.List;

@Getter @Setter @ToString
public class ItemFormDto {

    private Long id;

    @NotBlank(message = "상품명은 필수 입력 값입니다.")
    private String itemNm;

    @NotNull(message = "원가는 필수 입력 값입니다.")
    private Integer cost;

    @NotNull(message = "가격은 필수 입력 값입니다.")
    private Integer price;

    @NotBlank(message = "상품 상세는 필수 입력 값입니다.")
    private String itemDetail;

    @NotNull(message = "재고는 필수 입력 값입니다.")
    private Integer stockNumber;

    private ItemSellStatus itemSellStatus;

    // 에러 해결을 위해 views 필드 추가
    private Integer views;

    // likes 필드 추가 (현재 문제 해결)
    private Integer likes;

    // 업로드 단계에서 받은 tempKey
    private String tempKey;

    private List<String> fileNames= new ArrayList<>();;

    private String repImgUrl; // 대표 이미지 URL

    private static ModelMapper modelMapper = new ModelMapper();

    public Item createItem(){
        return modelMapper.map(this, Item.class);
    }

    public static ItemFormDto of(Item item){
        return modelMapper.map(item,ItemFormDto.class);
    }

}