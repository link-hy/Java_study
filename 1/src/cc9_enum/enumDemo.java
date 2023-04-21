package cc9_enum;

public class enumDemo {
    public enum Move{//枚举类型适用于信息分类；和Switch匹配
        LEFT,RIGHT,UP,DOWN;
    }

    public static void main(String[] args) {
        move(Move.LEFT);
    }

    private static void move(Move move) {
        switch (move){
            case UP -> System.out.println("UP");
            case DOWN -> System.out.println("DOWN");
            case LEFT -> System.out.println("LEFT");
            case RIGHT -> System.out.println("RIGHT");
        }
    }


}
