package c4_classobj;

import java.util.Scanner;

public class ShopCarTest {
    public static void main(String[] args) {
        // 1.定义商品类
        // 2.定义购物车类，数组对象
        Goods[] shopCar=new Goods[100];
        boolean flag=true;
        while(flag) {
            System.out.println("查询购物车：c");
            System.out.println("添加购物车：a");
            System.out.println("修改商品数：d");
            System.out.println("结算：p");
            System.out.println("输入指令:");
            Scanner sc = new Scanner(System.in);
            String com = sc.next();
            switch (com) {
                case "c":
                    //查询购物车
                    chaxun(shopCar);
                    break;
                case "a":
                    //添加购物车
                    add(shopCar, sc);
                    break;
                case "d":
                    //修改商品数
                    updat(shopCar, sc);
                    break;
                case "p":
                    //结算
                    pay(shopCar);
                    flag=false;
                    break;
            }
        }
    }

    private static void pay(Goods[] shopCar) {
        int all=0;
        for(int i=0;i<shopCar.length;i++) {
            if (shopCar[i]!=null) {
                all += shopCar[i].buyNumber * shopCar[i].price;
            }
        }
        System.out.println("总价："+all);
    }

    private static void updat(Goods[] shopCar,Scanner sc) {//修改商品数
        chaxun(shopCar);
        System.out.println("输入序号：");
        int k =sc.nextInt();
        System.out.println("名称："+shopCar[k].name);
        System.out.println("数量："+shopCar[k].buyNumber);
        System.out.println("输入数目：");
        int num =sc.nextInt();
        if (num==0)
            shopCar[k]=null;
        else
            shopCar[k].buyNumber=num;

    }

    private static void chaxun(Goods[] shopCar) {
        for(int i=0;i<shopCar.length;i++) {
            System.out.println("----------查询---------------");
            if (shopCar[i]!=null){
                System.out.println("序号："+i+"-------------------------");
                System.out.println("编号："+shopCar[i].id);
                System.out.println("名称："+shopCar[i].name);
                System.out.println("价格："+shopCar[i].price);
                System.out.println("数量："+shopCar[i].buyNumber);
            }
        }
        System.out.println("--------------------------");
    }

    private static void add(Goods[] shopCar,Scanner sc ) {
        System.out.println("输入编号：");
        int id =sc.nextInt();
        System.out.println("输入名称：");
        String name =sc.next();
        System.out.println("输入价格：");
        double price =sc.nextDouble();
        System.out.println("输入数量：");
        int num =sc.nextInt();
        Goods g=new Goods();
        g.id=id;
        g.name=name;
        g.price=price;
        g.buyNumber=num;
        for(int i=0;i<shopCar.length;i++) {
            if (shopCar[i]==null) {
                shopCar[i] = g;
                break;
            }
        }
    }
}
