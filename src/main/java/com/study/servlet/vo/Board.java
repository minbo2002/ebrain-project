package com.study.servlet.vo;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class Board {

    private Long boardId;
    private Long categoryId;
    private String writer;
    private String title;
    private String content;
    private int count;
    private String boardPw;
    private String boardRePw;
    private LocalDateTime createdAt;
    private LocalDateTime modifiedAt;

    @Builder
    public Board(Long boardId, Long categoryId, String writer, String title, String content,
                 int count, String boardPw, String boardRePw, LocalDateTime createdAt, LocalDateTime modifiedAt) {
        this.boardId = boardId;
        this.categoryId = categoryId;
        this.writer = writer;
        this.title = title;
        this.content = content;
        this.count = count;
        this.boardPw = boardPw;
        this.boardRePw = boardRePw;
        this.createdAt = createdAt;
        this.modifiedAt = modifiedAt;
    }
}
