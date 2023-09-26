package com.study.servlet.dto;

import com.study.servlet.vo.Category;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDateTime;

@Getter
@ToString
@NoArgsConstructor
public class BoardListDto {

    private Long boardId;
    private Category category;
    private String writer;
    private String title;
    private String content;
    private int count;
    private String boardPw;
    private String boardRePw;
    private LocalDateTime createdAt;
    private LocalDateTime modifiedAt;

    @Builder
    public BoardListDto(Long boardId, Category category, String writer, String title, String content, int count,
                        String boardPw, String boardRePw, LocalDateTime createdAt, LocalDateTime modifiedAt) {
        this.boardId = boardId;
        this.category = category;
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
