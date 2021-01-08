import java.util.Scanner;

public class Main {
    public static Character manager;
    public static Story story;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите ваше имя:");
        manager = new Character(in.next());
        story = new Story();
        while (true) {
            manager.Health += story.current_situation.dHealth;
            manager.Power += story.current_situation.dPower;
            manager.Money += story.current_situation.dMoney;
            System.out.println("=====\nЗдоровье:" + manager.Health + "\tМощность:"
                    + manager.Power + "\tДеньги:" + manager.Money + "\n=====");
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