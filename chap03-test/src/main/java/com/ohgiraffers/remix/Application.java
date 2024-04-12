package com.ohgiraffers.remix;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ProductController productController = new ProductController();

        do{
            System.out.println("========= 메뉴 관리 ==========");
            System.out.println("1. 전체 출력");
            System.out.println("2. 제품 번호(ID) 에 해당하는 제품 조회");
            System.out.println("3. 제품 번호(ID) 에 해당하는 제품 대여 상태 변경");
            System.out.println("4. 제품 추가 및 대여 정보 추가");
            System.out.println("5. 제품 삭제 및 대여 정보 삭제");
            System.out.print("메뉴 관리 번호를 입력 하세요 : ");
            int no = sc.nextInt();

            switch (no) {
                case 1: productController.selectAllMenu();
                    break;
                case 2: productController.selectMenuByCode(inputMenuCode());
                    break;
                case 3: productController.registMenu(inputMenu());
                    break;
                case 4: productController.modifyMenu(inputModifyMenu());
                    break;
                case 5: productController.deleteMenu(inputMenuCode());
                    break;

                default:
                    System.out.println("잘못된 번호를 선택하셨습니다.");
                    break;
            }
        }while (true);

    }
    private static Map<String,String> inputMenuCode() {
        Scanner sc = new Scanner(System.in);
        System.out.print("제품 번호 (ID)를 입력해 주세요 : ");
        String id = sc.nextLine();

        Map<String,String> parameter = new HashMap<>();
        parameter.put("id",id);

        return parameter;
    }

    private static Map<String, String> inputMenu() {
        Scanner sc = new Scanner(System.in);
        System.out.print("변경하실 가격을 입력해 주세요 : ");
        String price = sc.nextLine();
        System.out.print("대여 상태 변경 ex) Y / N : ");
        String rental = sc.nextLine();

        Map<String,String> parameter = new HashMap<>();
        parameter.put("price", price);
        parameter.put("rental", rental);


        return parameter;
    }

    private static Map<Integer,String> inputModifyMenu() {

        return null;
    }


}

