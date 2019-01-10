package board.controller;
import java.util.ArrayList;
import java.util.Scanner;

import board.model.vo.Board;

public class BoardManager {
	ArrayList<Board> list = new ArrayList<Board>();
	Scanner sc = new Scanner(System.in);
	
	public BoardManager() {
		//구현내용 : board_list.dat 파일의 내용을 읽어서
		//list에 저장함 	null 될 때까지 저장함
	}
	
	public void writeBoard() {
		System.out.println("새 게시글 쓰기 입니다.");
		System.out.print("글제목: ");
		
		System.out.print("작성자 : ");
		
		//작성날짜는 현재 날짜로 입력처리
		System.out.print("글내용 : ");
		//여러 줄로 입력받음 "exit"입력하면 입력종료
		//Board 객체 생성시 초기값으로 사용함
		//list에 추가함
	}
	
	public void displayAllList() {
		for(int i=0; i<list.size();i++) {
			list.get(i);
		}
	}
	
	public void displayBoard() {
		System.out.print("조회할 글번호 : ");
		//해당 글번호에 대한 게시글을 화면에 출력시킴
		//해당 글에 대한 조회수 1증가 처리함
	}
	
	public void modifyTitle() {
		System.out.print("수정할 글번호 : ");
		list.get(sc.nextInt());
		System.out.print("변경할 내용 : ");
		
	}
	public void modifyContent(){
		
	}
	
	public void deleteBoard() {
		
	}
	
	public void searchBoard() {
		
	}
	
	public void saveListFile() {
		
	}
	
	public void sortList(int item, boolean isDesc) {
		
	}
}
