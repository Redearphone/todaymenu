package com.gmail.dinnermenu;

import java.util.Scanner;
import java.util.Random;

class DinnerMenu {

    //肉料理を返すメソッド
    static String meatmenu() {
        String[] meat = {
            "鳥の照り焼き",
            "焼き肉",
            "鳥のトマト煮",
            "ポークソテー",
            "豚の味噌焼き",
            "生姜焼き",
            "肉じゃが",
            "鳥のさっぱり煮",
            "ステーキ",
            "唐揚げ"
        };
        int meatnum = (int) (Math.random() * (meat.length));
        return meat[meatnum];
    }

    //魚料理を返すメソッド
    static String fishmenu() {
        String[] fish = {
            "鮭の塩焼き",
            "鯖の味噌煮",
            "さしみ",
            "鯖の醤油煮",
            "秋刀魚の塩焼き",
        };
        int fishnum = (int) (Math.random() * (fish.length));
        return fish[fishnum];
    }
    //どんぶりを返すメソッド
    static String bowlmenu() {
        String[] bowl = {
            "マグロ丼",
            "親子丼",
            "しらす丼",
            "焼肉丼",
            "鳥丼",
        };
        int bowlnum = (int) (Math.random() * (bowl.length));
        return bowl[bowlnum];
    }
    //小鉢を返すメソッド
    static String submenu() {
        String[] subdish ={
            "ほうれん草のお浸し",
            "きんぴらごぼう",
            "きゅうりの酢の物",
            "きゅうりとツナのマヨネーズ和え",
            "高野豆腐",
            "豆腐",
            "きゅうりと塩昆布のごま油和え",
            "焼きなすび",
            "揚げ出し豆腐",
            "味噌汁"
        };
        int subnum = (int) (Math.random() * (subdish.length));
        return subdish[subnum];
    }
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
     
        
        //最初の文字表示
            int retry;
            int chefhand;
            do {
            do {
            System.out.println("今日の晩御飯は？");
            System.out.println("0...肉料理　1...魚料理　2...丼ぶり");
            System.out.print("入力 : ");
            chefhand = stdIn.nextInt();
            } while (chefhand < 0 || chefhand > 2);
         

            switch  (chefhand) {
                case 0 : 
                System.out.println("メイン : 「" + meatmenu() + "」");
                System.out.println("小鉢　: 「" + submenu() + "」と「" + submenu() +"」");
                break;
                case 1 : 
                System.out.println("メイン : 「" + fishmenu() + "」");
                System.out.println("小鉢　: 「" + submenu() + "」と「" + submenu() +"」");
                break;
                case 2 :
                System.out.println("メイン : 「" + bowlmenu() + "」");
                break;
            }
            System.out.println("もう一度？ 1...Yes/0...No : ");
            retry = stdIn.nextInt();
            
        } while (retry == 1);
    }
}