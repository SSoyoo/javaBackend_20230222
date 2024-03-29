package board;

import java.util.Scanner;

import board.common.constant.HttpStatus;
import board.controller.BoardController;
import board.controller.UserController;
import board.dto.request.board.PatchBoardDto;
import board.dto.request.board.PostBoardDto;
import board.dto.request.user.SignInDto;
import board.dto.request.user.SignUpDto;
import trainReservation.dto.PostReservationDto;

public class BoardApplication {
	
	private static UserController userController = new UserController();
	private static BoardController boardController = new BoardController();
	
	private static final String SIGN_UP ="POST /sigh-up";
	private static final String SIGN_IN ="POST /sign-in";
	
	private static final String POST_BOARD = "POST /board";
	
	private static final String GET_BOARD = "GET /board";
	private static final String GET_BOARD_LIST = "GET /board/list";
	
	private static final String PATCH_BOARD = "PATCH /board";
	private static final String DELETE_BOARD = "DELETE /board";

	
	public static void main(String[] args) {
		
		while(true) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("URL End point: ");
			String endpoint = scanner.nextLine();
			
			switch(endpoint) {
			
			case SIGN_UP :
				
				SignUpDto signUpDto = new SignUpDto();
				
				System.out.println("이메일주소: ");
				signUpDto.setEmail(scanner.nextLine());
				
				System.out.println("비밀번호: ");
				signUpDto.setPassword(scanner.nextLine());
				
				System.out.println("비밀번호확인: ");
				signUpDto.setPasswordCheck(scanner.nextLine());
				
				System.out.println("닉네임: ");
				signUpDto.setNickname(scanner.nextLine());
				
				System.out.println("휴대전화번호: ");
				signUpDto.setPhoneNumber(scanner.nextLine());
				
				System.out.println("주소: ");
				signUpDto.setAddress(scanner.nextLine());
				
				System.out.println("상세주소: ");
				signUpDto.setAddressDetail(scanner.nextLine());
				
				//System.out.println(signUpDto);
				
				userController.signUp(signUpDto);
				break;
				
			case SIGN_IN:
				
				SignInDto signInDto = new SignInDto();
				System.out.println("이메일 주소:");
				signInDto.setEmail(scanner.nextLine());
				System.out.println("비밀번호");
				signInDto.setPassword(scanner.nextLine());
				
//				System.out.println(signInDto);
				userController.signIn(signInDto);
				break;
				
			case POST_BOARD :
				
				PostBoardDto postBoardDto = new PostBoardDto();
				
				System.out.println("제목: ");
				postBoardDto.setTitle(scanner.nextLine());
				
				System.out.println("내용: ");
				postBoardDto.setContent(scanner.nextLine());
				
				System.out.print("이미지: ");
				postBoardDto.setBoardImageUrl(scanner.nextLine());
				
				System.out.println("작성자 이메일: ");
				postBoardDto.setWriterEmail(scanner.nextLine());
				
				boardController.postBoard(postBoardDto);
				break;
				
			case GET_BOARD_LIST :
				
				boardController.getBoardList();
				break;
			
			case GET_BOARD: 
				
				int boardNumber = 0;
				
				try {
					System.out.println("게시물번호 : ");
					boardNumber = scanner.nextInt();
					
				} catch (Exception exception) {
					exception.printStackTrace();
					continue;
				}
				
				boardController.getBoard(boardNumber);
				
				break;
				
			case PATCH_BOARD : 
				
				PatchBoardDto patchBoardDto = new PatchBoardDto(); 
				try {
					
					System.out.println("게시물번호: ");
					String patchBoardNumberString = scanner.nextLine();
					
					patchBoardDto.setBoardNumber(Integer.parseInt(patchBoardNumberString));
					
					System.out.println("제목: ");
					patchBoardDto.setTitle(scanner.nextLine());
					
					System.out.println("내용: ");
					patchBoardDto.setContent(scanner.nextLine());
					
					System.out.println("이미지: ");
					patchBoardDto.setBoardImageUrl(scanner.nextLine());
	
					System.out.println("이메일: ");
					patchBoardDto.setEmail(scanner.nextLine());
					
					
				}catch (Exception exception) {
					exception.printStackTrace();
					continue;
				}
				
				boardController.patchBoard(patchBoardDto);
				
				break;
			case DELETE_BOARD:
				
				int deleteBoardNumber =0;
				String deleteEmail = null;
				
				
				try {
					System.out.println("게시물번호");
					deleteBoardNumber = Integer.parseInt(scanner.nextLine());
					System.out.println("이메일");
					deleteEmail = scanner.nextLine();
			
					
				}catch (Exception e) {
					e.printStackTrace();
					continue;
				}
				
				boardController.deleteBoard(deleteBoardNumber,deleteEmail);
				
				break;
				
				
				default:
					System.out.println(HttpStatus.NOT_FOUND);
		
			
			}//스위치
			
		}//while문
		
	} //메인메소드
	
	
}// 클래스 끝 
