package com.hmsh.carrotmarket.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class BoardReplyDTO {

    private Long id;

    private String content;

    private String phoneNumber;

    private Long boardId;

}
