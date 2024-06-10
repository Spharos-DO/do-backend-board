package hobbiedo.board.dto.response;

import java.time.LocalDateTime;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class BoardDetailsResponseDto {

	private Long boardId; // 게시글 번호
	private String title; // 제목
	private String content; // 내용
	private String writerUuid; // 작성자 uuid
	private Long likeCount; // 좋아요 수
	private Long commentCount; // 댓글 수
	private boolean pinned; // 고정 여부
	private LocalDateTime updatedAt; // 수정일
	private boolean updated; // 수정 여부
	private List<String> imageUrls; // 이미지 url 목록
}