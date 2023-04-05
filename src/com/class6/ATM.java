package com.class6;

import java.util.ArrayList;
import java.util.Scanner;

public class ATM {
    //lớp tài khoản
    static class Account{
        String name;
        double balance;
        int accountNumber;

        Account(String name, int accountNumber, double balance){
            this.name = name;
            this.accountNumber = accountNumber;
            this.balance = balance;
        }
    }
    //Danh sách tài khoản
    static ArrayList<Account> accounts = new ArrayList<>();
    //Phương thức tạo tài khoản
    public static void createAccount(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên tài khoản");
        String name = scanner.nextLine();
        System.out.println("Nhập số tài khoản");
        int accountNumber = scanner.nextInt();
        System.out.println("Nhập số dư ban đầu");
        double balance = scanner.nextDouble();

        //Tạo tài khoản mới và thêm vào danh sách
        Account account = new Account(name, accountNumber, balance);
        accounts.add(account);

        System.out.println("Tài khoản đã được tạo thành công!");
    }
    //Phương thức nộp tiền
    public static void deposit(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số tài khoản: ");
        int accountNumber = scanner.nextInt();
        System.out.println("Nhập số tiền muốn nộp: ");
        double amount = scanner.nextDouble();

        for (Account account: accounts){
            if(account.accountNumber == accountNumber){
                //Cộng thêm số tiền vào tài khoản
                account.balance +=amount;
                System.out.println("Số tiền" + amount + "đã nộp vào tài khoản" + accountNumber);
                return;
            }
        }
        System.out.println("Không tìm thấy tài khoản có số tài khoản là: " + accountNumber);

    }
    //Phương thức rút tiền
    public static void withdraw(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số tài khoản: ");
        int accountNumber = scanner.nextInt();
        System.out.println("Nhập số tiền muốn rút: ");
        double amount = scanner.nextDouble();


        for (Account account: accounts){
            if(account.accountNumber == accountNumber){
                if(account.balance >= amount){
                    //Trừ đi số tiền tài khoản
                    account.balance -= amount;
                    System.out.println("Số tiền " + amount + "đã được rút khỏi tài khoản" + accountNumber);
                }else{
                    System.out.println("Sóo dư toàn khoản không đủ để thực hiện giao dịch!");
                }
                return;
            }
        }
        System.out.println("Không tìm thấy tài khoản có số tài khoản là: " + accountNumber);
    }
    //Phương thức tra cứu tài khoản
    public static void findAccount(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số tài khoản: ");
        int accountNumber = scanner.nextInt();

        for (Account account : accounts){
            if(account.accountNumber == accountNumber){
                System.out.println("Tên tài khoản:" + account.name);
                System.out.println("Số dư:" + account.balance);
                return;
            }
        }
        System.out.println("Không tìm thấy tài khoản có số tài khoản là: " + accountNumber);
    }
    //Phương thức hiển thị danh sách tài khoản
    public static void displayAccounts(){
        if(accounts.isEmpty()){
            System.out.println("Danh sách tài khoản đang trống.");
        }else{
            System.out.println("Danh sách tài khoản:");
            for (Account account: accounts){
                System.out.println("Tên tài khoản" + account.name);
                System.out.println("Số tài khoản" + account.accountNumber);
                System.out.println("Số dư" + account.balance);
                System.out.println("-----------------------------");

            }
        }
    }
    //Phương thức xóa tài khoản
    public static void deleteAccount(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số tài khoản muốn xóa: ");
        int accountNumber = scanner.nextInt();
        for (Account account: accounts){
            if( account.accountNumber == accountNumber){
                //Xóa tài khoản khỏi danh sách
                accounts.remove(account);
                System.out.println("Tài khoản " + accountNumber + "đã được xóa thành công!");
            }
        }
        System.out.println("Không tìm thấy tài khoản có số tài khoản là: " + accountNumber);
    }
    //Phương thức sửa tài khoản
    public static void editAccount(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập sô tài khoản cần sửa: ");
        int accountNumber = scanner.nextInt();

        for(Account account:accounts){
            if(account.accountNumber == accountNumber){
                System.out.println("Tên tài khoản hiện tại là: " + account.name);
                System.out.println("Số dư hiện tại là: " + account.balance);
                System.out.println("Nhập tên mới (bỏ qua nếu không muốn thay đổi): ");
                String name = scanner.nextLine();
                if(!name.equals("")){
                    account.name = name;
                }
                System.out.println("Nhập số dư mới (bỏ qua nếu không muốn thay đổi):");
                Double balance = scanner.nextDouble();
                if(balance != null){
                    account.balance = balance;
                }
                System.out.println("Tài khoản đã được sửa thành công!");
                return;
            }
        }
        System.out.println("Không tìm thấy tài khoản có số tài khoản là: " + accountNumber);

    }
    //Phương thức thoát chưởng trình
    public static void exit(){
        System.out.println("Chương trình kết thúc!");
        System.exit(0);
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("===============================");
            System.out.println("1. Tạo tài khoản");
            System.out.println("2. Nộp tiền");
            System.out.println("3. Rút tiền");
            System.out.println("4. Tra cứu tài khoản");
            System.out.println("5. Hiển thị danh sách tài khoản");
            System.out.println("6. Xóa tài khoản");
            System.out.println("7. Sửa tài khoản");
            System.out.println("8. Thoát chương trình");
            System.out.println("===============================");
            System.out.print("Vui lòng nhập lựa chọn của bạn: ");
            choice = scanner.nextInt();

            switch (choice){
                case 1:
                    createAccount();
                    break;
                case 2:
                    deposit();
                    break;
                case 3:
                    withdraw();
                    break;
                case 4:
                    findAccount();
                    break;
                case 5:
                    displayAccounts();
                    break;
                case 6:
                    deleteAccount();
                    break;
                case 7:
                    editAccount();
                    break;
                case 8:
                    exit();
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
                    break;

            }
        } while (choice != 8);
    }
}
