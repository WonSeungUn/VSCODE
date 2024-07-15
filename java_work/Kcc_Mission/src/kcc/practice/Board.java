package kcc.practice;

// 하나의 게시글에 대한 Board
public class Board {
	// 게시판 작성(글번호, 제목, 내용, 글쓴이)
	// 게시판 삭제(글번호 알면 될듯..?)
	// 게시판 수정(글번호, 제목, 내용)
	// 게시판 전체 출력(모든 내용을 출력하면 될 것 같으므로 void)) 출력 메소드!
	// 게시판 글 출력 (글 번호를 알아야할듯?)
 	private int boardNo;
	private String title;
	private String content;
	private String writer;
	
	public Board() {
		
	}

	public Board(int boardNo, String title, String content, String writer) {
		super();
		this.boardNo = boardNo;
		this.title = title;
		this.content = content;
		this.writer = writer;
	}
	
	// 글 보여주기 (게시판 전체와 하나의 게시판 글을 보여주는 용도 가능할 것 같음)
	public void print() {
		System.out.println("글번호 : " + boardNo);
		System.out.println("제목 : " + title);
		System.out.println("내용 : " + content);
		System.out.println("글쓴이 : " + writer);
	}
	

	public int getBoardNo() {
		return boardNo;
	}

	public void setBoardNo(int boardNo) {
		this.boardNo = boardNo;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
	
	
	
	
}
