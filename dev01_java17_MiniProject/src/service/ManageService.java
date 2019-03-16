
package service;

import java.util.InputMismatchException;
import java.util.Scanner;

import common.Const;
import vo.Member;

public class ManageService {
	private Scanner sc = null;
	private Member[] memberList = null;
	
	public ManageService() {
		memberList = new Member[0];
		start();
	}
	
	public void start() {
		while (true) {
			int result = selectedStartMenu();
			System.out.println(result + "번 매뉴가 선택 되었습니다.");
			if(1 == result) {
//				String[] inputtxt = resterMemberInputValues();
//				registMember(inputtxt);
				registMember(resterMemberInputValues());
			}else if(2 == result) {
				updateMember();
			}else if(3 == result) {
				showMemberOne();
			}else if(4 == result) {
				showMemberList();
			}
			
		}
	}

	public void showMemberOne() {
		System.out.println("===맴버 보기 입니다.===");
		System.out.println("찾으실 아이디를 입력하세요.");
		Member targetMember = new Member();
		boolean isTrue = false;
		
		sc = new Scanner(System.in);
		String searchId = sc.nextLine();
		for(int i=0; i<memberList.length; i++) {
			if(searchId.equals(memberList[i].getId())) {
				isTrue = true;
				targetMember = memberList[i];
			}
		}
		if(isTrue) {
			System.out.println(targetMember.toString());
		}else {
			System.out.println("찾으실 아이디가 없습니다.");
		}
	}

	
	public void registMember(String[] inputTxt) {
		int mlistSize = memberList.length;
		Member[] copyMemberList = new Member[mlistSize + 1];
		//1. 기존에 있는거 새로운 배열에 복사.
		if(mlistSize > 0) {
			for(int i = 0; i<mlistSize; i++) {
				copyMemberList[i] = memberList[i];
			}
		}
		
		//1.입력 받은걸 -> VO에 담는다.
		Member pvo = new Member();
		pvo.setId(inputTxt[0]);
		pvo.setPw(inputTxt[1]);
		pvo.setName(inputTxt[3]);
		pvo.setGender(inputTxt[4]);
		pvo.setAge(Integer.parseInt(inputTxt[5]));// "32" => 32
		
		//2.vo를 memberList에 담는다.
		copyMemberList[copyMemberList.length-1] = pvo;
		
		memberList = copyMemberList;
	}
	
	public String[] resterMemberInputValues() {
		System.out.println("===맴버 등록 입니다.===");		
		String[] inputTxt = new String[Const.memberMenuList.length];
		for(int i=0; i<Const.memberMenuList.length; i++) {
			System.out.println(Const.memberMenuList[i]);
			sc = new Scanner(System.in);
			inputTxt[i] = sc.nextLine();
		}
//		addMember(inputTxt);
		return inputTxt;
	}


	public void updateMember() {
		System.out.println("===맴버 수정 입니다.===");
	}
	
	public void showMemberList() {
		System.out.println("===맴버 리스트 입니다.===");
		for(int i = 0; i<memberList.length; i++) {
			System.out.println(memberList[i].toString());
		}
	}



	public int selectedStartMenu() { 
		int result = 0;
		System.out.println("===원하시는 메뉴를 선택해 주세요.===");
		try {
			for(int i=0; i<Const.startMenuList.length; i++) {
				System.out.println(Const.startMenuList[i]);
			}
			sc = new Scanner(System.in);
			result = sc.nextInt();
		}catch(InputMismatchException e) {
			System.out.println("숫자만 입력해 주세요.");
		}
		return result;
	}
	
}