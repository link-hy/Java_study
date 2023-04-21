package gameDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GamePuKe {
    //定义一个静态集合存储54个卡牌对象
    public static List<card> allcards=new ArrayList<>();
    //定义静态代码块初始化卡牌
    static{
        String[] sizes={"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
        String[] colors={"♠","♥","♣","♦"};
        //组合
        int ind=1;
        for (String size : sizes) {
            ind+=1;
            for (String color : colors) {
                card c=new card(size,color,ind);
                allcards.add(c);
            }
        }
        allcards.add(new card("","大王",ind+1));
        allcards.add(new card("","小王",ind+1));
    }
    public static void main(String[] args) {
        System.out.println("新牌"+allcards);
        Collections.shuffle(allcards);
        System.out.println("洗牌"+allcards);
        System.out.println("____________________________");
        //定义3组和地主
        List<card> A=new ArrayList<>();
        List<card> B=new ArrayList<>();
        List<card> C=new ArrayList<>();

        List<card> D=allcards.subList(allcards.size()-3, allcards.size());
        for (int i=0;i< allcards.size()/3;i++) {
            A.add(allcards.get(3*i));
            B.add(allcards.get(3*i+1));
            C.add(allcards.get(3*i+2));
        }

        sortCard(A);
        sortCard(B);
        sortCard(C);
        sortCard(D);

        System.out.println("A："+A);
        System.out.println("B："+B);
        System.out.println("C："+C);
        System.out.println("地主："+D);


    }

    private static void sortCard(List<card> cards) {
/*        Collections.sort(cards, new Comparator<card>() {
            @Override
            public int compare(card o1, card o2) {
                return o2.getIndex()-o1.getIndex();
            }
        });*/
//        Collections.sort(cards, (o1, o2)-> o2.getIndex()-o1.getIndex());
        cards.sort((o1, o2)-> o2.getIndex()-o1.getIndex());
    }
}
