import java.util.Scanner;

public class A1093374_0324_1 {
    public static void main(String[] args) {
        Animal[] animals = new Animal[] {
            new Animal("雪寶", 1.1, 52, 100),
            new Animal("驢子", 1.5, 99, 200),
            new Animal("安那", 1.7, 48, 120),
            new Animal("愛沙", 1.7, 50, 120)
        };

        // 印出所有成員的屬性值
        for (Animal animal : animals) {
            animal.show();
            System.out.println();
        }

        // 讓使用者輸入時間和加速度，計算每個成員的跑步距離
        Scanner scanner = new Scanner(System.in);

        for (Animal animal : animals) {
            System.out.print(animal.name + "，請輸入時間(分鐘)：");
            double time = scanner.nextDouble();

            System.out.print(animal.name + "，請輸入加速度(double值)：");
            double acceleration = scanner.nextDouble();

            double distance = animal.distance(time, acceleration);
            System.out.println(animal.name + "的跑步距離為：" + distance + " 公尺\n");
        }
    }
}
