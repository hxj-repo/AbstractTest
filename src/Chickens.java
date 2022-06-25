public class Chickens {

    public static void buyChickens(double total, int count) {
        System.out.println(total + "元买" + count + "只鸡的买法：");
        for (int i = 0; i <= total / 5; i++) {
            for (int j = 0; j <= total / 3; j ++) {
                if ( (5 * i + 3 * j + (count - i -j) / 3 == count) && (count - i -j) % 3 == 0) {
                    System.out.println(i + "只公鸡，" + j + "只母鸡，" + (count -i - j) + "只小鸡");
                }
            }
        }
    }

    public static void main(String[] args) {
        buyChickens(100, 100);
    }
}
