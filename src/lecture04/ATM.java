package lecture04;

import java.util.ArrayList;
import java.util.List;

public class ATM {
    List<Account> accountList;

    public ATM(){
        this.accountList = new ArrayList<>();
    }

    //アカウント登録
    public void registerAccount(String name,String number){
        Account account = new Account(name,number);
        accountList.add(new Account(name,number));
        System.out.println(name + " さんのアカウントを口座番号：" + number + "で登録しました。");
    }

    //アカウント有無の確認
    public boolean existsAccount(String name,String number){
        for (Account account : accountList){
            if(account.getName() != null && account.getNumber() != null){
                System.out.println("名前：" + name + " 口座番号：" + number + " は存在します。");
                return true;
            }
        }
        System.out.println("名前：" + name + " 口座番号：" + number + " は存在しません。");
        return false;
    }

    //入金
    public void deposit(String number,long money){
        for(Account account : accountList){
            if(account.getNumber().equals(number)){
                account.setBalance(account.getBalance() + money);
                System.out.println("口座番号：" + number + " に " + money + " 円入金しました。");
            }
        }
    }

    //出金
    public long withdraw(String number,long money){
        for(Account account : accountList){
            if(account.getNumber().equals(number)) {
                if (account.getBalance() >= money) {
                    account.setBalance(account.getBalance() - money);
                    System.out.print("口座番号：" + number + " から " + money + " 円引き出しました。");
                    System.out.println("残高：" + account.getBalance() + "円です。");
                    return account.getBalance();
                }
                System.out.print("口座番号：" + number + " から " + money + " 円引き出せませんでした。");
                System.out.println("残高：" + account.getBalance() + "円です。");
                return account.getBalance();
            }
        }
        return 0;
    }
}
