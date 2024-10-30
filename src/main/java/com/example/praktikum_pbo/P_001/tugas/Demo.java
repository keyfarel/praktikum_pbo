package com.example.praktikum_pbo.P_001.tugas;

public class Demo {
    public static void main(String[] args) {
        Snake snake = new Snake("Cobra", 5);
        SancaSnake ss = new SancaSnake("Yellow Sanca", 15,
                false, "Yellow");

        Ball ball = new Ball("Basket Ball", 27);
        BilliardBall bb = new BilliardBall("Billiard Ball", 5
                , 8, "Black");

        Drink drink = new Drink("Lemon Tea", 200);
        Coffee coffee= new Coffee("Coffee", 150
                , "Americano", 0);

        Food food = new Food("Fried Egg", 150);
        FriedRice friedRice = new FriedRice("Fried Rice"
                , 300, true);

        System.out.println(snake);
        snake.move();
        snake.snakeEat();

        System.out.println();
        System.out.println(ss);
        ss.constrictPrey();
        ss.move();

        System.out.println();
        System.out.println(ball);
        ball.bounce();
        ball.roll();
        System.out.println();

        System.out.println(bb);
        bb.roll();
        bb.pocket();
        bb.bounce();

        System.out.println();
        System.out.println(drink);
        drink.drinking();
        drink.checkVolume();

        System.out.println();
        System.out.println(coffee);
        coffee.drinking();
        coffee.checkVolume();
        coffee.addSugar();

        System.out.println();
        System.out.println(food);
        food.caloriesCount();
        food.eat();

        System.out.println();
        System.out.println(friedRice);
        friedRice.addSpicyLevel();
        friedRice.addTopping();
    }
}
