public class Main {
    public static void main(String[] args) {
        var box = 5;
        System.out.println(box);
        box = box + 2;
        System.out.println(box);
        box = box - 3;
        System.out.println(box);
        box = box * 3;
        System.out.println(box);
        box = box / 4;
        System.out.println(box);

        var a = 3;
        var b = 5;

        var result1 = a + b;
        System.out.println("a + b =" + result1 );
        var result2 = a * b;
        System.out.println("a * b = " + result2);
        var result3 = b / a;
        System.out.println("a / b =" + result3);
        var result = (a / 2) * b;
        System.out.println("(a / 2) * b =" + result);

        var LiftingCapacity = 50;
        var staffWeight = 20;
        var capacityLeft = LiftingCapacity - staffWeight;
        System.out.println("Еще можно положить " + capacityLeft + "кг вещей");

        var appleWeight = 2;
        var orangeWeight = 3;
        var fruitWeight = appleWeight + orangeWeight;
        System.out.println("Общий вес фруктов " + fruitWeight);

        var meatWeight = 4;
        var waterWeight = 5;
        var tomatoesWeight = 2;
        var cucumbersWeight = 2;
        var peppersWeight = 2;
        var zucchiniWeight = 2;
        var vegetablesWeight = tomatoesWeight + cucumbersWeight + peppersWeight + zucchiniWeight;
        var productsWeight = fruitWeight + vegetablesWeight + meatWeight + waterWeight;
        System.out.println("Общий вес продуктов " + productsWeight + " кг!");

        var LeftWeight = LiftingCapacity - staffWeight - productsWeight;
        System.out.println("Места осталось " + LeftWeight + " кг!");

        productsWeight = productsWeight * 2;
        System.out.println("Теперь вес продуктов " + productsWeight);
        LeftWeight = LiftingCapacity - staffWeight - productsWeight;
        System.out.println("Теперь места остлось " + LeftWeight + " кг!");

        var overLoad = (staffWeight + productsWeight) % LiftingCapacity;
        System.out.println("Перегруз на " + overLoad + " кг!");

        var productsInOneCar = productsWeight / 2;
        System.out.println("Продуктов в одной машине теперь " + productsInOneCar);

        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);

        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);

        dog = dog - 3.5;
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);

        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        var weightOfOneBoxer = 78.2;
        System.out.println(weightOfOneBoxer);
        var weightOfTheSecondBoxer = 82.7;
        System.out.println(weightOfTheSecondBoxer);
        var massOfTwoFighters = weightOfOneBoxer + weightOfTheSecondBoxer;
        System.out.println("Общая масса двух бойцов " + massOfTwoFighters + " кг!");
        var difference =weightOfTheSecondBoxer - weightOfOneBoxer;
        System.out.println("Разница между массами бойцов " + difference + " кг!");

        var weightOne = 15;
        System.out.println(weightOne);
        var weightTwo = 5;
        System.out.println(weightTwo);
        var remainder = weightTwo % weightOne;
        System.out.println(remainder);

        var openingHours = 640;
        System.out.println(openingHours);
        var workTime = 8;
        System.out.println(workTime);
        var employees = openingHours / workTime;
        System.out.println(employees);
        employees = employees + 94;
        System.out.println(employees);
        workTime = openingHours / employees;
        System.out.println("Если в компании работает " + employees + " человека, то всего " + workTime + " часа работы может быть поделенно между сотрудниками");
















    }
}