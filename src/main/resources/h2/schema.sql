-- board 테이블 생성
CREATE TABLE BOARD
(
    board_id       NUMBER            NOT NULL, 
    writer         VARCHAR2(50)      NOT NULL, 
    title          VARCHAR2(50)      NULL, 
    content        VARCHAR2(1000)    NULL, 
    reg_date       VARCHAR2(20)      NOT NULL, 
    update_date    VARCHAR2(20)      NULL, 
    delete_date    VARCHAR2(20)      NULL,
    PRIMARY KEY (board_id)
);

-- board 테이블 Comment 설정
COMMENT ON TABLE board IS '게시판 테이블';
COMMENT ON COLUMN board.board_id IS '게시글ID';
COMMENT ON COLUMN board.writer IS '작성자';
COMMENT ON COLUMN board.title IS '제목';
COMMENT ON COLUMN board.content IS '내용';
COMMENT ON COLUMN board.reg_date IS '등록 일자';
COMMENT ON COLUMN board.update_date IS '수정 일자';
COMMENT ON COLUMN board.delete_date IS '삭제 일자';

-- board 시퀀스 생성
CREATE SEQUENCE "sq_board_id" MINVALUE 1 MAXVALUE 999999999 INCREMENT BY 1 START WITH 202700 NOCACHE NOCYCLE;