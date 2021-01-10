import java.util.Scanner;

public class Main {
    public static Character player;
    public static Story story;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите ваше имя:");
        player = new Character(in.next());
        story = new Story();
        while (true) {
            player.Health += story.current_situation.dHealth;
            player.Power += story.current_situation.dPower;
            player.Money += story.current_situation.dMoney;
            System.out.println("=====\nЗдоровье:" + player.Health + "\tМощность:"
                    + player.Power + "\tДеньги:" + player.Money + "\n=====");
            System.out.println("============="
                    + story.current_situation.subject + "==============");
            System.out.println(story.current_situation.text);
            if (story.isEnd()) {
                System.out
                        .println("====================the end!===================");
                return;
            }
            story.go(in.nextInt());
        }
    }
}