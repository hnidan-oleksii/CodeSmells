package Task2.Subtask2;

public class LargeClass {
    private final String name;
    private final int age;
    private final String gender;
    private final CustomList<String> friends;
    private final CustomList<String> enemies;
    private final CustomList<String> tasks;

    public LargeClass(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.friends = new CustomList<>(ListEntity.Friend);
        this.enemies = new CustomList<>(ListEntity.Enemy);
        this.tasks = new CustomList<>(ListEntity.Task);
    }

    public void displayInfo() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Gender: " + this.gender);
        friends.display();
        enemies.display();
        tasks.display();
    }
}

